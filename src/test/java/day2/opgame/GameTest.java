package day2.opgame;

import static org.junit.jupiter.api.Assertions.*;

import day2.opgame.service.OpGame;
import day2.opgame.service.PlusOperatorLevelOne;
import org.junit.jupiter.api.Test;

/**
 * @author gyuri
 *
 * 1. 덧셈
 * 2. 기회 3회
 * 3. 격려
 * 4. 결과는 10 이하
 *
 */

class GameTest {
    @Test
    public void test() {
        OpGame game = new OpGame(new PlusOperatorLevelOne());
        game.makeQuestion();
        String question = game.getQuestion();

        assertEquals("1 + 1 = ", question);
        assertEquals(3, game.getRemainingAnswers());
        assertEquals(false, game.isAnswer(3));
        assertEquals(2, game.getRemainingAnswers());
        assertEquals("한 번 더 해보자", game.getCheeringUpMsg());
        assertEquals(true, game.isAnswer(2));
    }

    @Test
    public void testRandom() {
        System.out.println((int)(Math.random()*10));
    }
    @Test
    public void testSumMax() {
        int max = 10;
        int a = (int)(Math.random()*max);
        int b = (int)(Math.random()*(max - a));
        System.out.printf("%d + %d = %d", a, b, a+b);
        assertTrue(a + b < 10);
    }
}
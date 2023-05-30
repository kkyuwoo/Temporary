package day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeapyearTest {
    @Test
    void checkLeapYear() {
        Assertions.assertEquals(false, Leapyear.checkLeapYear(1700));
    }
    @Test
    void testLearYear() {
        Assertions.assertEquals(true, Leapyear.isLeapYear(2000));
        Assertions.assertEquals(false, Leapyear.isLeapYear(1900));
        Assertions.assertEquals(true, Leapyear.isLeapYear(2400));
    }
}
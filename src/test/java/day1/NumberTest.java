package day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {

    @Test
    void testPrime() {
        assertTrue(Number.isPrime(3));
        assertTrue(Number.isPrime(7));
        assertFalse(Number.isPrime(10));
    }

    @Test
    void testPerfectNumber() {
        assertTrue(Number.isPerfectNumber(6));
        assertTrue(Number.isPerfectNumber(28));
        assertFalse(Number.isPerfectNumber(12));
    }

    @Test
    void testFactors() {
        assertEquals("[1, 2, 4, 8]", Number.factors(16));
    }

}
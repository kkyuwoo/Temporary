package day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeapyearTest {

    @Test
    void checkLeapYear() {
        Assertions.assertEquals(false, Leapyear.checkLeapYear(1700));
    }
}
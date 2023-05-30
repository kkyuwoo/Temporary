package day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainClass369Test {

    @Test
    void game369() {
        assertEquals("*", MainClass369.is369(3));
        assertEquals("", MainClass369.is369(15));
        assertEquals("**", MainClass369.is369(33));
        assertEquals("***", MainClass369.is369(333));
        assertEquals("****", MainClass369.is369(3369));
    }
}
package com.oumaima.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {
    @Test
    public void testIsEven() {
        NumberUtils utils = new NumberUtils();

        assertTrue(utils.isEven(4), "4 doit être pair");
        assertFalse(utils.isEven(3), "3 ne doit pas être pair");
    }


}
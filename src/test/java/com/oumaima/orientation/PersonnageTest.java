package com.oumaima.orientation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonnageTest {

    @Test
    void tourner() {
        Personnage p = new Personnage();
        String result = p.tourner(1);
        assertEquals("est", result, "expected est");
    }
}
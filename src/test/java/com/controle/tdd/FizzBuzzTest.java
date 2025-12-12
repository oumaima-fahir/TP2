package com.controle.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzz_de_3_devrait_retourner_Fizz() {
     String r = FizzBuzz.de(15);
     assertEquals("FizzBuzz",r, "doit retourner FizzBuzz");
    }


    @Test
    void fizzBuzz_de_5_devrait_retourner_Buzz() {
        String r = FizzBuzz.de(5);
        assertEquals("Buzz",r, "doit retourner Buzz");
    }

    @Test
    void fizzBuzz_de_15_devrait_retourner_Buzz() {
        String r = FizzBuzz.de(15);
        assertEquals("FizzBuzz",r, "doit retourner FizzBuzz");
}

}

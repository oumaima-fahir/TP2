package com.controle.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {


    @Test
    void fizzBuzz_de_3_devrait_retourner_Fizz() {

     String r = FizzBuzz.de(3);
     assertEquals("Fizz",r, "doit retourner Fizz");
    }
    @Test
    void fizzBuzz_de_5_devrait_retourner_Buzz() {
        String r = FizzBuzz.de(5);
        assertEquals("Buzz",r, "doit retourner Buzz");
    }

}

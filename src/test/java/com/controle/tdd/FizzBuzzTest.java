package com.controle.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {


    @Test
    void fizzBuzz_de_3_devrait_retourner_Fizz() {
     FizzBuzz fb = new FizzBuzz();
     String r = fb.de(3);
     assertEquals("Fizz",r, "doit retourner Fizz");
    }
}
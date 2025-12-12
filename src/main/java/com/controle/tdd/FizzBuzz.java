package com.controle.tdd;

public class FizzBuzz {
    public static String de(int nbr){

        if(nbr%3 ==0 && nbr%5 ==0){
            return "FizzBuzz";
        }

        if(nbr%3 == 0) {
            return "Fizz";
        }

        if(nbr%5 == 0) {
            return "Buzz";
        }
        return ""+nbr;
    }
}
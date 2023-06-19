package org.example.lesson2.homework;

import java.math.BigInteger;

public class EXtest {
    public static void main(String [] args){
        Integer integer = 7;
        BigInteger bigInteger = BigInteger.valueOf(integer);
        boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(integer));
        System.out.println(probablePrime);
    }

}

package org.oop.homework.hw6;

import org.oop.homework.hw6.complex.Sum;

public class Xmain {
    public static void main(String[] args) {
     Sum a = new Sum(5,6);
     Sum b = new Sum (7, 4);
//        StdOut.println();
        System.out.println("b + a  = " + Sum.getSum(a,b));
    }

}

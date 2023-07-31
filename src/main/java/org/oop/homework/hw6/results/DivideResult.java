package org.oop.homework.hw6.results;

import org.oop.homework.hw6.complex.Divide;

import java.util.Scanner;

public class DivideResult extends AbstractResult{
    public DivideResult(double re1, double im1, double re2, double im2) {
        super(re1, im1, re2, im2);
    }

    public static void getDivideResult() {
        AbstractResult.getScanner();
        Divide a = new Divide(re1, im1);
        Divide b = new Divide(re2, im2);
        System.out.println("a/b  = " + Divide.getDivide(a, b));
    }
}

package org.oop.homework.hw6.results;

import org.oop.homework.hw6.complex.*;

public class MultiplyResult extends AbstractResult {
    public MultiplyResult(double re1, double im1, double re2, double im2) {
        super(re1, im1, re2, im2);
    }

    public static void getMultiplyResult() {
        AbstractResult.getScanner();
        Multiply a = new Multiply(re1, im1);
        Multiply b = new Multiply(re2, im2);
        System.out.println("Результат произведения двух комплексных чисел  = " + Multiply.getMultiply(a, b));
    }
}

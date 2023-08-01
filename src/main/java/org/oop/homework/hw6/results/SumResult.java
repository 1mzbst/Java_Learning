package org.oop.homework.hw6.results;

import org.oop.homework.hw6.complex.*;

public class SumResult extends AbstractResult{
    public SumResult(double re1, double im1, double re2, double im2) {
        super(re1, im1, re2, im2);
    }
    public static void getSumResult() {
        AbstractResult.getScanner();
        Sum a = new Sum(re1, im1);
        Sum b = new Sum(re2, im2);
        System.out.println("Сумма двух комплексных чисел  = " + Sum.getSum(a, b));
    }
}

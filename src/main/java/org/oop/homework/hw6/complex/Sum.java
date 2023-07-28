package org.oop.homework.hw6.complex;

public class Sum extends ComplexAbstract {

    public Sum(double re, double im) {
        super(re, im);
    }

    public static Sum getSum(Sum a, Sum b) {
        double real = a.re + b.re;
        double imag = b.im + b.im;
        Sum sum = new Sum(real, imag);
        return sum;
    }

    public String toString() {
        if (im == 0) return re + "";
        if (re == 0) return im + "i";
        if (im < 0) return re + " - " + (-im) + "i";
        return re + " + " + im + "i";

    }
}
package org.oop.homework.hw6.complex;

public class Multiply extends  ComplexAbstract implements MultiplyInterface{


    public Multiply(double re, double im) {
        super(re, im);
    }

    public static Multiply getMultiply(Multiply a,  Multiply b) {
        double real = a.re * b.re - a.im * b.im;
        double imag = a.re * b.im + a.im * b.re;
        return new Multiply(real, imag);
    }

    public String toString() {
        if (im == 0) return re + "";
        if (re == 0) return im + "i";
        if (im < 0) return re + " - " + (-im) + "i";
        return re + " + " + im + "i";

    }

}

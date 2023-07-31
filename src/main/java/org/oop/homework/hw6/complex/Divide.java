package org.oop.homework.hw6.complex;

public class Divide extends ComplexAbstract implements DivideInterface {

    public Divide(double re, double im) {
        super(re, im);
    }

    public static Divide getMultiply(Divide a, Divide b) {
        double real = a.re * b.re - a.im * b.im;
        double imag = a.re * b.im + a.im * b.re;
        return new Divide(real, imag);
    }

    public static Divide getDivide(Divide a, Divide b) {

        return Divide.getMultiply(a, b.getReciprocal());
    }

    public Divide getReciprocal() {
        double scale = re * re + im * im;
        return new Divide(re / scale, -im / scale);

    }

    public String toString() {
        if (im == 0) return re + "";
        if (re == 0) return im + "i";
        if (im < 0) return re + " - " + (-im) + "i";
        return re + " + " + im + "i";

    }
}

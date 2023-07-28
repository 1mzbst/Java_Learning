package org.oop.homework.hw6.complex;

public class Print extends ComplexAbstract {

    public Print(double re, double im) {
        super(re, im);
    }

    public String toString() {
        if (im == 0) return re + "";
        if (re == 0) return im + "i";
        if (im < 0) return re + " - " + (-im) + "i";
        return re + " + " + im + "i";

    }

}

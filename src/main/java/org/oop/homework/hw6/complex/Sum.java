package org.oop.homework.hw6.complex;

import org.oop.homework.hw6.complex.abstracts.ComplexAbstract;
import org.oop.homework.hw6.complex.interfaces.SumInterface;

public class Sum extends ComplexAbstract implements SumInterface {

    public Sum(double re, double im) {
        super(re, im);
    }
    /**
     * @apiNote Принимает на вход два объеккта Sum от абстрактного класса ComplexAbstract, происзводит
     * математические действия по формуле сложения комплексных чисел.
     * @param a
     * @param b
     * @return Возваращает новый объект класса Sum.
     */
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
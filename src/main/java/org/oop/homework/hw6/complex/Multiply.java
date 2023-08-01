package org.oop.homework.hw6.complex;

import org.oop.homework.hw6.complex.abstracts.ComplexAbstract;
import org.oop.homework.hw6.complex.interfaces.MultiplyInterface;

public class Multiply extends ComplexAbstract implements MultiplyInterface {


    public Multiply(double re, double im) {
        super(re, im);
    }
    /**
     * @apiNote Принимает на вход два объеккта Multiply от абстрактного класса ComplexAbstract, происзводит
     * математические действия по формуле произведения комплексных чисел.
     * @param a Объект класса Multiply
     * @param b Объект класса Multiply
     * @return Возваращает новый объект класса Multiply.
     */
    public static Multiply getMultiply(Multiply a,  Multiply b) {
        double real = a.re * b.re - a.im * b.im;
        double imag = a.re * b.im + a.im * b.re;
        return new Multiply(real, imag);
    }
    /**
     * @apiNote Условия выода объекта в консоль
     * @return Вывод в консоль
     */
    public String toString() {
        if (im == 0) return re + "";
        if (re == 0) return im + "i";
        if (im < 0) return re + " - " + (-im) + "i";
        return re + " + " + im + "i";

    }

}

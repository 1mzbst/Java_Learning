package org.oop.homework.hw6.complex;

import org.oop.homework.hw6.complex.abstracts.ComplexAbstract;
import org.oop.homework.hw6.complex.interfaces.DivideInterface;

public class Divide extends ComplexAbstract implements DivideInterface {

    public Divide(double re, double im) {
        super(re, im);
    }

    /**
     * @apiNote Принимает на вход два объеккта Divide от абстрактного класса ComplexAbstract, происзводит математические действия
     * по формуле произведения комплексных чисел.
     * @param a
     * @param b
     * @return Возваращает новый объект класса Divide.
     */
    public static Divide getMultiply(Divide a, Divide b) {
        double real = a.re * b.re - a.im * b.im;
        double imag = a.re * b.im + a.im * b.re;
        return new Divide(real, imag);
    }
    /**
     * @apiNote Принимает на вход два объеккта Divide от абстрактного класса ComplexAbstract, происзводит математические
     * действия по формуле деления комплексных чисел.
     * @param a
     * @param b
     * @return Возваращает новый объект класса Divide, вычесленный при помощи метода getMultiply и метода getReciprocal.
     */
    public static Divide getDivide(Divide a, Divide b) {

        return Divide.getMultiply(a, b.getReciprocal());
    }

    /**
     * @apiNote Вычисляет произвидение вещественных и мнимых частей уровнения.
     * @return Возваращает новый объект класса Divide, необходимый для дальнейшеого вычисления частного одного
     * комплекусного числа от другого.
     */
    public Divide getReciprocal() {
        double scale = re * re + im * im;
        return new Divide(re / scale, -im / scale);

    }

    /**
     * @return Вывод в консоль
     */
    public String toString() {
        if (im == 0) return re + "";
        if (re == 0) return im + "i";
        if (im < 0) return re + " - " + (-im) + "i";
        return re + " + " + im + "i";

    }
}

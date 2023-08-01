package org.oop.homework.hw6.results;

import java.util.Scanner;

public abstract class AbstractResult implements ResultsInterface{
    static double re1;
    static double im1;
    static double re2;
    static double im2;

    public AbstractResult(double re1, double im1, double re2, double im2) {
        this.re1 = re1;
        this.im1 = im1;
        this.re2 = re2;
        this.im2 = im2;
    }

    /**
     * Метод вызова сканеров для заполнения переменных с клавиатуры.
     */
    public static void getScanner() {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Введите действительную часть первого комплексного числа: ");
        re1 = scanner1.nextDouble();
        System.out.println("Введите 'мнимую' часть комплексного числа: ");
        im1 = scanner2.nextDouble();
        System.out.println("Введите действительную часть второого комплексного числа: ");
        re2 = scanner3.nextDouble();
        System.out.println("Введите 'мнимую' часть второого комплексного числа: ");
        im2 = scanner4.nextDouble();
    }
}


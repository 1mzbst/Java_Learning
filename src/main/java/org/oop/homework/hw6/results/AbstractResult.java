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

    public static void getScanner() {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);
        re1 = scanner1.nextDouble();
        im1 = scanner2.nextDouble();
        re2 = scanner3.nextDouble();
        im2 = scanner4.nextDouble();
    }
}


package org.oop.homework.hw4;

import java.util.Scanner;

public class CalculatorMultiply {

    /**
     * @apiNote Метод перемножает два значения введённых с клавиатуры. Результат записывает в
     * переменную.
     * @return переменную res с результатом умножения.
     */
    public double multiply(){
        double res = 0.0;
        Scanner digit1 = new Scanner(System.in);
        System.out.println("Число 1");
       double digit11 =  digit1.nextDouble();
        Scanner digit2 = new Scanner(System.in);
        System.out.println("Число 2");
       double digit22 =  digit2.nextDouble();
        res = digit11*digit22;
        System.out.println("Результат " + res);
        return res;

    }
}

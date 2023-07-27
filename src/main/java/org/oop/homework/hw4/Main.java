package org.oop.homework.hw4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CalculatorMultiply calcMulti = new CalculatorMultiply();
        CalculatorDivision calcDiv = new CalculatorDivision();
        System.out.println("Выберите матиматическое действие (*, /):  ");
        Scanner choice = new Scanner(System.in);
//        choice.nextLine();
        if (choice.nextLine().contains("*")) {
            calcMulti.multiply();

        } else if (choice.nextLine().contains("/")) {
            calcDiv.division();

        }

    }
}

package org.oop.homework.hw4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//            CalculatorSum calc = new CalculatorSum();
//            List<Double> doubleList = new ArrayList<>();
//            List<Integer> integerList = new ArrayList<>();
//            for (int i = 0; i <= 100; i += 50) {
//                doubleList.add((double) i);
//                integerList.add(i);
//            }
//            System.out.println("calc.sum(doubleList) = " + calc.sum(doubleList));
//            System.out.println("calc.sum(integerList) = " + calc.sum(integerList));
//        }

        CalculatorDivision calc = new CalculatorDivision();
//        calc.division();
//        ArrayList<Double> newA = new ArrayList<>();
//        newA.add(calc.division());
Scanner scanner = new Scanner(System.in);
if (scanner.nextInt() == 1){
    calc.division();
}



    }
}

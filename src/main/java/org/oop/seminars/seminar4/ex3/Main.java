package org.oop.seminars.seminar4.ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {
            Calculator calc = new Calculator();
            List<Double> doubleList = new ArrayList<>();
            List<Integer> integerList = new ArrayList<>();
            for (int i = 0; i <= 100; i += 50) {
                doubleList.add((double) i);
                integerList.add(i);
            }
            System.out.println("calc.sum(doubleList) = " + calc.sum(doubleList));
            System.out.println("calc.sum(integerList) = " + calc.sum(integerList));
        }
    }


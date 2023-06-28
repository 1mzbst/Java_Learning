package org.example.lesson3.seminar.homework.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex {
    public static void main(String[] args) {
        System.out.println("Collections.max(justList) = " + Collections.max(listOfNumbers()));
        System.out.println("Collections.min(justList) = " + Collections.min(listOfNumbers()));
        System.out.println("average(justList) = " + average(listOfNumbers()));
    }

    /**
     * @apiNote Вычисляет среднее арифметическое числе в массиве
     * @param list
     * @return
     */
    public static double average(ArrayList<Integer> list){
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum +=list.get(i);
        }
        return sum/list.size();
    }

    public static ArrayList<Integer> listOfNumbers (){
        ArrayList<Integer> justList = new ArrayList<>();
        justList.add(1);
        justList.add(2);
        justList.add(3);
        justList.add(10);
        justList.add(5);
        justList.add(6);
        return justList;
    }
}

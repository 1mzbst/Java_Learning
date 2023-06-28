package org.example.lesson4.homework.ex1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        System.out.println("Первоночальный список = " + list);
        List<Integer> reverList = getReverse(list);
        System.out.println("Оборотень = " + reverList);
    }
    public static List<Integer> getReverse(List<Integer> list ){
//        List<Integer> reverList = new ArrayList<>();
        Collections.reverse(list);
        return list;
    }


}

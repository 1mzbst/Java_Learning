package org.example.lesson1.homeWork;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        String s = "     the     sky  is      blue                  ";
        System.out.println(s);
        String sTrim = s.trim();
        String clearS = sTrim.replaceAll("\\s+", " ");
        String [] splitArr = clearS.split(" ");
        String [] reversSplitArr = rev(splitArr);
        String reversS = String.join(" ", reversSplitArr);
        System.out.println(reversS);
    }
    public static String[] rev (String [] array){
        int size = array.length;
        for (int i = 0; i < size / 2; i++){
            String temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;

        }
        return array;
    }
}
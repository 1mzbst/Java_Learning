package org.example.lesson2.homework;

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args){
        int [] arr = new int []{1, 22, 33, 44, 5, -5, -3, 23, -7};

    }

    public static int index(int [] array){
        int indexSum = 0;
        for(int i = 0; i< array.length; i++){
            if (array[i]%100 >=0.10 && array[i]%100<=0.99){
                indexSum  = Arrays.indexOf(array,array[i]);

            }
        }
    }
}

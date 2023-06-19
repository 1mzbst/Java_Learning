package org.example.lesson2.homework;

import java.math.BigInteger;

public class Ex1 {
    public static void main(String[] args){
        int [] arr = new int [] {1, 22, 33, 44, 5, -5, -3, 23, -7};
        System.out.println("сумма простых чисел = " +whole(arr));
    }

    /**
     * @apiNote Принимает массив и приминяет к каждому элименту метод BigInteger и isProbablePrime метод проверки на
     * простое число, складывает все простые числа (не по модулю!)
     * @param array
     * @return сумму
     */
    public static int whole (int [] array){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            BigInteger bigInteger = BigInteger.valueOf(array[i]);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(array[i]));
            if (probablePrime){
                count += array[i];
            }

        }
        return count;
    }
}

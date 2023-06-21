package org.example.lesson2.homework;

import javax.swing.plaf.synth.SynthStyleFactory;
import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(check(arr));
    }

    /**
     * @apiNote проверяет на возрастание значений массива
     * @param array
     * @return true or false
     */
    public static boolean check(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

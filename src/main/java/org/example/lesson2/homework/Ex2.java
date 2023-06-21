package org.example.lesson2.homework;

import javax.swing.plaf.synth.SynthStyleFactory;
import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
//        int[] arr = new int[]{1, 22, 33, 44, 5, -5, -3, 23, -7};



        int[] arr = new int[]{1,2,3,4,5,6};
        System.out.println(check(arr));

    }


    public static boolean check(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }


//    public static boolean check (int[] array){
//        int i = 0;
//        do {if (array[i] > array[i + 1])
//            i++;
//        } while (array[i]< array.length);
//    }
        }
        return true;
    }
//     System.out.println(arr[i + 1]);{
//        for (int i : array) {
//                if (i>(i+1)) {
////                    return 1;
//                    System.out.println(i);
//                }
//
//            }
//    }
//}
//        public static boolean check (int[] array){
//            for (int i : array) {
//                if (i < (i + 1)) {
//                    return true;
//                }
//            }
//            return false;
//        }
//}
}
package org.exception.homeworks.hw2.ex2;

public class Main {
    public static void main(String[] args) {
        //Если необходимо, исправьте данный код
        //        try {
        //            int d = 0;
        //            double catchedRes1 = intArray[8] / d;
        //            System.out.println("catchedRes1 = " + catchedRes1);
        //        } catch (ArithmeticException e) {
        //            System.out.println("Catching exception: " + e);
        //        }


        try {
            int d = 0;
            int[] intArray = new int[10];
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}


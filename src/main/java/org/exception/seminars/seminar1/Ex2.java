package org.exception.seminars.seminar1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, 0};
        dialog(arr);
    }

    private static void dialog(int[] arr) {
        System.out.println("Введите искомое число");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int code = checkArray(arr, num);
        parseCode(code);
    }

    private static void parseCode(int code) {
        switch (code) {
            case -1:
                System.out.println("Длинна массива меньше минимального необходимого");
                break;
            case -2:
                System.out.println("Искомый элемент не найден");
                break;
            case -3:
                System.out.println("Массив не инициализирован");
                break;
            default:
                System.out.println("Индекс элемента: " + code);
        }
    }

    private static int checkArray(int[] arr, int num) {
        if (arr == null) {
            return -3;
        }
        int minLength = 5;
        if (arr.length < minLength) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -2;
    }
}

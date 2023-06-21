package org.example.lesson2.homework;

public class Ex3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 22, 33, 44, 5, -5, -3, 23, -7};
        int [] newArr = change(arr, check(arr));
        printArray(newArr);
    }

    /**
     * @apiNote суммирует инедксы двузначных чисел
     * @param arr
     * @return переменную с суммой инедков двузначных чисел
     */
    private static int check(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 9 && arr[i] < 100) {
                temp += i;
            }
        }
        return temp;
    }

    /**
     * @apiNote Меняет элимент массива array на переменную a
     * @param array
     * @param a
     * @return изменённый массив
     */
    public static int [] change (int [] array, int a){
        for (int i = 0; i < array.length; i++){
            if (array[i] < 0){
                array[i] = a;
            }
        }
    return array;
    }

    /**
     * @apiNote выводит поэлиментно array в консоль
     * @param array
     */
    public static void printArray (int [] array){
        for (int i = 0; i < array.length; i ++){
            System.out.println(array[i]);
        }
    }
}
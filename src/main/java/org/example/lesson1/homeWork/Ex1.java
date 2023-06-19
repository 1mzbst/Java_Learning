package org.example.lesson1.homeWork;

public class Ex1 {
    public static void main (String[] args0){
        int [] myArray = new int []{1, 2, 1, 2, -1, 1, 3, 1, 3, -1, 0};
        System.out.println("count = " + countSum(myArray));
    }

    /**
     * @apiNote находит сумму положительных чисел, после которых следует отрицательное число.
     * @param array
     * @return переменную с суммой.
     */
    public static int countSum(int [] array){
        int count = 0;
        for (int i = 0; i < array.length; i++){

            if (array[i] < 0){
                count +=  array[i -1];
            }
        }

        return count;
    }
}
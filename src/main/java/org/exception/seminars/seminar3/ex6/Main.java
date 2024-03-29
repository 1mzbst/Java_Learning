package org.exception.seminars.seminar3.ex6;

public class Main {
    /*
    Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
    При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
    Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или
    текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией,
    в какой именно ячейке лежат неверные данные.
    В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException
    и MyArrayDataException и вывести результат расчета (сумму элементов, при условии что подали
    на вход корректный массив).
     */
    public static void main(String[] args) {
        String[][] testArray = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};
        try{
            System.out.println(arraySumOfElements(testArray));
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }

    public static int arraySumOfElements(String[][] arr){
        int res = 0;
        int desired = 4;
        if (arr.length != desired){
            throw new MyArraySizeException("Desired array length: " + desired + ". Current length: " + arr.length);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != desired){
                throw new MyArraySizeException("Desired array length: " + desired + ". Current length: " + arr[i].length);
            }
            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j].matches("[0-9]+")){
//                    throw new MyArrayDataException();
//                }
                try {
                    res += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return res;
    }
}

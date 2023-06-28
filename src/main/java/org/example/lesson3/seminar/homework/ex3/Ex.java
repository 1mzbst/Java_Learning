package org.example.lesson3.seminar.homework.ex3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;


public class Ex {
    public static void main(String[] args) {
        System.out.println("наши книги" + createList());
        ArrayList<String> newArray = getNameOfBooks(createList());
        System.out.println("newArray = " + newArray);
    }

    /**
     * @apiNote  Пролверка числа на ПростОту
     * @param a
     * @return true / False
     */
    public static boolean getPrime (int a){
        BigInteger bigInteger = BigInteger.valueOf(a);
        return bigInteger.isProbablePrime((int) Math.log(a));
    }

    /**
     * @apiNote  Принимает лист и фильтрует его по заданному условию задачи. Не стабильно работает с random
     * @param list
     * @return
     */
    public static ArrayList<String> getNameOfBooks(ArrayList<Books> list){
        ArrayList<String> nameOfBooks = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i).getSurname().contains("А") || list.get(i).getSurname().contains("а")) && (list.get(i).getYear()>=2010) &&
                    (getPrime(list.get(i).getPages())))
            {
                nameOfBooks.add(list.get(i).getName());
            }

        }
        return nameOfBooks;
    }

    /**
     * @apiNote Лист массивов класса Books
     * @return
     */
    private static ArrayList<Books> createList(){
        ArrayList<Books> booksList = new ArrayList<>();
        Random random = new Random();
        booksList.add(new Books("Кластелин Валец" , "йацук", random.nextInt(100),
              2010, 7));
        booksList.add(new Books("Ирраг Реттоп" , "Алёшкин", random.nextInt(100),
               2011, 5));
        booksList.add(new Books("Преступление и Вагнер" , "шкавич", random.nextInt(100),
               2011, 1));
        booksList.add(new Books("Краткий пересказ анекдота про Колобка" , "Козлов - Аристотель",
                random.nextInt(100), 2009, 2));
        return booksList;
    }
}

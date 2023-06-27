package org.example.lesson3.seminar.homework.ex3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("наши книги" + createList());
        ArrayList<String> newArray = getNameOfBooks(createList());
        System.out.println("newArray = " + newArray);

    }

    public static ArrayList<String> getNameOfBooks(ArrayList<Books> list){
        ArrayList<String> nameOfBooks = new ArrayList<>();
        for (int i = 0; i<list.size();i++){
            if ((list.get(i).getSurname().contains("А")) & (list.get(i).getYear() >= 2010)) {
                checkForPrime(list.get(i).getPages());

                    if (checkForPrime(list.get(i).getPages())) {
                        nameOfBooks.add(list.get(i).getName());
                    }

            }

        }
        return nameOfBooks;
    }

    public static boolean checkForPrime(Integer a){
        BigInteger bigInteger = BigInteger.valueOf(a);
        return bigInteger.isProbablePrime((int) Math.log(a));
    }

    private static ArrayList<Books> createList(){
        ArrayList<Books> booksList = new ArrayList<>();
        Random random = new Random();
        booksList.add(new Books("Кластелин Валец" , "Рахманинов", random.nextInt(100),
                random.nextInt(2008,2012), random.nextInt(4,8)));
        booksList.add(new Books("Ирраг Реттоп" , "Алёшкин", random.nextInt(100),
                random.nextInt(2008,2012), random.nextInt(4,8)));
        booksList.add(new Books("Преступление и Вагнер" , "Ашкевич", random.nextInt(100),
                random.nextInt(2008,2012), random.nextInt(4,8)));
        booksList.add(new Books("Краткий пересказ анекдота про Колобка" , "Козлов - Аристотель",
                random.nextInt(100), random.nextInt(2008,2012), random.nextInt(4,8)));
        return booksList;
    }
}

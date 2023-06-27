package org.example.lesson3.seminar.homework.ex3;

import java.util.ArrayList;
import java.util.Random;

import static java.lang.Math.sqrt;

public class Ex {
    public static void main(String[] args) {
        System.out.println("наши книги" + createList());
        ArrayList<String> newArray = getNameOfBooks(createList());
        System.out.println("newArray = " + newArray);

    }



    public static ArrayList<String> getNameOfBooks(ArrayList<Books> list){
        ArrayList<String> nameOfBooks = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSurname().contains("A") && list.get(i).getYear()>=2010 &&
                    IsSimple(list.get(i).getPages())){
                nameOfBooks.add(list.get(i).getName());
            }

        }
        return nameOfBooks;
    }


    public static boolean IsSimple(int ANum) {
        if (ANum < 1)
            return false;
        double s = sqrt(ANum);
        for (int i = 2; i <= s; i++) {
            if (ANum % i == 0)
                return false;
        }
        return true;
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

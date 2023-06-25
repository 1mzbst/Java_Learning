package org.example.lesson3.seminar.homework.ex3;

import org.example.lesson3.seminar.homework.ex2.Goods1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {

    }


    public static boolean checkForPrime(int a){
        BigInteger bigInteger = BigInteger.valueOf(a);
        boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(a));
        return probablePrime;
    }



    private static ArrayList<Books> createList(){
        ArrayList<Books> booksList = new ArrayList<>();
        Random random = new Random();
        booksList.add(new Books("Кластелин Валец" , "Рахманинов", random.nextInt(100),
                random.nextInt(2008,2012), random.nextInt(1,598)));
        booksList.add(new Books("Ирраг Реттоп" , "Алёшкин", random.nextInt(100),
                random.nextInt(2008,2012), random.nextInt(1,598)));
        booksList.add(new Books("Преступление и Вагнер" , "Сашкевич", random.nextInt(100),
                random.nextInt(2008,2012), random.nextInt(1,598)));
        booksList.add(new Books("Краткий пересказ анекдота про Колобка" , "Козлов - Аристотель",
                random.nextInt(100), random.nextInt(2008,2012), random.nextInt(1,598)));
        return booksList;
    }
}

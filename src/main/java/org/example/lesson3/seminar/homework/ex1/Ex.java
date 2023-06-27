package org.example.lesson3.seminar.homework.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex {

    public static void main (String[] args){

        List<Goods> listOfGoods = new ArrayList<>(createList());
        System.out.println(listOfGoods);
        int max = 0;
        for (Goods good: listOfGoods){
//            if(good.getPrice() > max && good.getName().contains("highest") && good.getGrade().contains(("1st")) &&
//               good.getGrade().contains("2st")) {
            if(good.getPrice() > max && good.getName().contains("highest") && good.getGrade().contains(("1st"))) {
                    max = good.getPrice();
                }
            }
        System.out.println("max price = " + max);
        }


    private static ArrayList<Goods> createList() {
        ArrayList<Goods> goodsList = new ArrayList<>();
        Random random = new Random();
            goodsList.add(new Goods("highest flour tree", "highest", random.nextInt(100)));
            goodsList.add(new Goods("highest butter", "1st", random.nextInt(100)));
            goodsList.add(new Goods("highest seed oil", "2st", random.nextInt(100)));
            goodsList.add(new Goods("apples", "1st", random.nextInt(100)));
            goodsList.add(new Goods("flour", "highest", random.nextInt(100)));
            goodsList.add(new Goods("highest butter broad", "1st", random.nextInt(100)));
            goodsList.add(new Goods("highest seed oil", "highest", random.nextInt(100)));
            goodsList.add(new Goods("pineapples", "1st", random.nextInt(100)));
            goodsList.add(new Goods("highest pine", "2st", random.nextInt(100)));

        return goodsList;
    }
}

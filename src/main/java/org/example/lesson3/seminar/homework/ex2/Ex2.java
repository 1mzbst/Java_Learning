package org.example.lesson3.seminar.homework.ex2;

import org.example.lesson3.seminar.homework.ex1.Goods;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex2 {
    public static void main (String[] args){

        List<Goods1> listOfGoods = new ArrayList<>(createList());
        System.out.println(listOfGoods);

        List<Goods1> oneMoreList = new ArrayList<>();
        List<Goods1> lessPrice = new ArrayList<>();
        int qer = listOfGoods.size();
        int qwe = oneMoreList.size();
        for (int i = 0; i < qer; i++){
            if(listOfGoods.get(i).getGrade().equals("1st")){
                oneMoreList.add(listOfGoods.get(i));
            }

        }
        System.out.println(oneMoreList);
        for(int j = 0; j<oneMoreList.size() - 1; j++){
            if (oneMoreList.get(j).getPrice() < oneMoreList.get(j + 1).getPrice()) {
                lessPrice.add(oneMoreList.get(j));
            }
        }

        System.out.println(lessPrice);
    }



    private static ArrayList<Goods1> createList() {
        ArrayList<Goods1> goodsList = new ArrayList<>();
        Random random = new Random();
        goodsList.add(new Goods1("highest flour tree", "Russia" , random.nextInt(100),
                "highest", random.nextInt(100)));
        goodsList.add(new Goods1("highest butter", "USA", random.nextInt(100), "1st", random.nextInt(100)));
        goodsList.add(new Goods1("highest seed oil", "Germany", random.nextInt(100), "2st", random.nextInt(100)));
        goodsList.add(new Goods1("apples","Russia" , random.nextInt(100), "1st", random.nextInt(100)));
        goodsList.add(new Goods1("flour",  "USA", random.nextInt(100), "highest", random.nextInt(100)));
        goodsList.add(new Goods1("highest butter broad",  "Germany", random.nextInt(100), "1st", random.nextInt(100)));
        goodsList.add(new Goods1("highest seed oil","Russia" , random.nextInt(100), "highest", random.nextInt(100)));
        goodsList.add(new Goods1("pineapples", "USA", random.nextInt(100), "1st", random.nextInt(100)));
        goodsList.add(new Goods1("highest pine", "Germany", random.nextInt(100), "2st", random.nextInt(100)));

        return goodsList;
    }
}

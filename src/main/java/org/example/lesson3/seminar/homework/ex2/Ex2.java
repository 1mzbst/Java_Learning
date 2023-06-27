package org.example.lesson3.seminar.homework.ex2;

import org.example.lesson3.seminar.homework.ex1.Goods;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public static void main (String[] args){

        List<Goods1> listOfGoods = new ArrayList<>(createList());
        System.out.println(listOfGoods);
        // в данном задании пример состоит из списка с 1st сортом
        System.out.println("Введите highest, 1st или 2nd сорт: ");
        String gradeFromUser = getGradeFromUser();
        List<Goods1> gradeList = new ArrayList<>(getGradeList(listOfGoods, gradeFromUser));
        System.out.println("Список с товаром заданного сорта -> " + gradeList);
        int minPrice = getMinPrice(gradeList);
        System.out.println("Наименьшая стоимость = " + minPrice);
        List<String> lessPrice = new ArrayList<>(getLessPriceList(gradeList, minPrice));
        System.out.println("Список товаров с наименьшей ценой -> " + lessPrice);

    }

    /**
     * @apiNote ввод с клавиатуры сорт Grade
     * @return grade
     */
    public static String getGradeFromUser (){
        Scanner sc = new Scanner(System.in);
        String grade = sc.next();
        return grade;
    }

    /**
     * @apiNote принимает список товаров и переменную с названием сорта grade
     * @param list
     * @param a
     * @return новый список товаров заданного сорта grade
     */
    private static List<Goods1> getGradeList(List<Goods1> list, String a) {
        List<Goods1> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).getGrade().equals(a)){
                newList.add(list.get(i));
            }
        }
        return newList;
    }
    /**
     * @apiNote принимает список товаров
     * @param list
     * @return возвращает наименьшую цену товара из списка
     */
    private static int getMinPrice(List<Goods1> list) {
        int min = list.get(0).getPrice() ;
        for(int j = 0; j<list.size(); j++) {
            if (list.get(j).getPrice() < min) {
                min = list.get(j).getPrice();
            }
        }
        return min;
    }
    /**
     * @apiNote принимает список товаров и переменную
     * @param list
     * @param min
     * @return новый список товаров с наименьшей стоимостью
     */
    private static List<String> getLessPriceList(List<Goods1> list, int min) {
        List<String> newListName = new ArrayList<>();
        for(int j = 0; j<list.size(); j++)
            if (list.get(j).getPrice() == min){
                newListName.add(list.get(j).getName());
            }

        return newListName;
    }

    /**
     * @apiNote список товаров
     * @return список
     */
    private static ArrayList<Goods1> createList() {
        ArrayList<Goods1> goodsList = new ArrayList<>();
        Random random = new Random();
        goodsList.add(new Goods1("flour1", "Russia" , random.nextInt(100),
                "highest", random.nextInt(1,5)));
        goodsList.add(new Goods1("flour2", "USA", random.nextInt(100),
                "1st", random.nextInt(1,5)));
        goodsList.add(new Goods1("flour3", "Germany", random.nextInt(100),
                "1st", random.nextInt(1,5)));
        goodsList.add(new Goods1("apples1","Russia" , random.nextInt(100),
                "1st", random.nextInt(1,5)));
        goodsList.add(new Goods1("apples2",  "USA", random.nextInt(100),
                "highest", random.nextInt(1,5)));
        goodsList.add(new Goods1("apples3",  "Germany", random.nextInt(100),
                "1st", random.nextInt(1,5)));
        goodsList.add(new Goods1("pineapples1","Russia" , random.nextInt(100),
                "1st", random.nextInt(1,5)));
        goodsList.add(new Goods1("pineapples2", "USA", random.nextInt(100),
                "1st", random.nextInt(1,5)));
        goodsList.add(new Goods1("pineapples3", "Germany", random.nextInt(100),
                "2nd", random.nextInt(1,5)));

        return goodsList;
    }
}

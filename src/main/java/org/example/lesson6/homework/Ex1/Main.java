package org.example.lesson6.homework.Ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Laptops getMeth = new Laptops();
        Integer forGet = getNum();


    }

    /**
     * @apiNote создает Мар с перечнем доступных для фильтрации
     * @return Мар
     */
    public static Map<Integer,ArrayList> setMapForChoice(){
        Laptops ge = new Laptops();
        Map<Integer,ArrayList> mapForFilter = new HashMap<>();
        mapForFilter.put(1, ge.getLaptopName(ge.listOfLaptops()));
//        mapForFilter.put(2, "OZU");
//        mapForFilter.put(3, "HDD");
//        mapForFilter.put(4, "GP");
//        mapForFilter.put(5, "Year");
//        mapForFilter.put(6, "OS");
//        mapForFilter.put(7, "Color");
        return mapForFilter;
    }


    /**
     * @apiNote Метод получает считывает значение с клавиатуры и по полученному значениею возвращает нужный
     * метод фильтрации
     * @param map
     * @return
     */
    public static ArrayList<Laptop> getChoiceForFilter(Map<Integer, ArrayList> map) {
        ArrayList<Laptop> result = new ArrayList<>();
         System.out.println("""
                Enter the number of filer what you want to get:\s
                 1 - Name;
                 2 - OZU;
                 3 - HDD;
                 4 - GP;
                 5 - Year;
                 6 - OS;
                 7 - Color.""");
        Scanner scanner = new Scanner(System.in);
        Integer numberForChoice = scanner.nextInt();
        for (Integer integer : map.keySet()) {
            if (numberForChoice.equals(integer)) {
                result.add(map.get(integer));


            }
        }return result;
    }

    /**
     * @apiNote Считывет значение введённое с клавиатуры.
     * @return
     */
    public static Integer getNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        Integer num = scanner.nextInt();
        return  num;
    }
}

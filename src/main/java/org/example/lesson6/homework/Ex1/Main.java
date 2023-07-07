package org.example.lesson6.homework.Ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Laptops getMeth = new Laptops();
//        Integer forGet = getNum();

        Map<Integer, ArrayList> sMap = setMapForChoice();
        System.out.println("sMap.get(1) = " + sMap.get(1));
//        System.out.println("getChoiceForFilter(sMap) = " + getChoiceForFilter(sMap));

    }

    /**
     *@apiNote Дошло как это работает только в процессе вызова, оказывается он вызывает их поочереди,
     * что конечно очевидно. Здесь надо указать название сегментов фильтрации, а затем как в методе ниже,
     * доделать реализацию : Какой фильтр хотите выбрать? Если то-то тогда вызывать метод который указал в этом
     * методе.
     *
     * @return Мар
     *
     */
    public static Map<Integer, ArrayList> setMapForChoice() {
        Laptops ge = new Laptops();
        Map<Integer, ArrayList> mapForFilter = new HashMap<>();
        mapForFilter.put(1, ge.getLaptopName(ge.listOfLaptops()));
//        mapForFilter.put(2, ge.getLaptopOZU(ge.listOfLaptops()));
//        mapForFilter.put(3, ge.getLaptopHDD(ge.listOfLaptops()));
//        mapForFilter.put(4, ge.getLaptopGP(ge.listOfLaptops()));
//        mapForFilter.put(5, ge.getLaptopYear(ge.listOfLaptops()));
//        mapForFilter.put(6, ge.getLaptopOS(ge.listOfLaptops()));
//        mapForFilter.put(7, ge.getLaptopColor(ge.listOfLaptops()));
        return mapForFilter;
    }


    /**
     * @param map
     * @return
     * @apiNote Метод получает считывает значение с клавиатуры и по полученному значениею возвращает нужный
     * метод фильтрации
     */
    public static ArrayList<ArrayList> getChoiceForFilter(Map<Integer, ArrayList> map) {
        ArrayList<ArrayList> result = new ArrayList<>();
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
        }
        return result;
    }

    /**
     * @return
     * @apiNote Считывет значение введённое с клавиатуры.
     */
    public static Integer getNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        Integer num = scanner.nextInt();
        return num;
    }
}

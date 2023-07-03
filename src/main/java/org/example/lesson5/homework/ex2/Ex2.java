package org.example.lesson5.homework.ex2;

import java.util.*;

import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;

public class Ex2 {
    public static void main(String[] args) {
        Map<String,Integer> resultMap=getCountOfName(getMap());
        System.out.println("resultMap = " + resultMap);
        System.out.println("getSorted(resultMap) = " + getSorted(resultMap));
//        List<Integer> resultList = reverseList(resultMap);
//        System.out.println("resultList = " + resultList);
//        System.out.println("getSorted(resultMap,resultList) = " + getSorted(resultMap, resultList));


    }

    /**
     * @apiNote принимает Map <String, String> и возвращает новый Map <String, Integer>.
     * Подсчитывает, сколько раз повторялось значение в переданном Map.
     * @param map <String, String>
     * @return Map<String, Integer>
     */
    public static Map<String, Integer> getCountOfName(Map<String, String> map) {
        Map<String, Integer> newMap = new HashMap<>();
        for (String i : map.keySet()) {
            int count = 0;
            for (String j : map.keySet()) {
                if (map.get(i).equals(map.get(j))) {
                    count++;
                }

            }
            newMap.put(map.get(i), count);
        }

        return newMap;
    }

//    public static Map<String, Integer> getSorted (Map<String, Integer> map) {
//        NavigableMap<String,Integer> test2 = new TreeMap<>(map);
//        test2.navigableKeySet();
//    }

    public static Map<String, Integer> getSorted2 (Map<String, Integer> map){
        Map<String, Integer> newMap = new HashMap<>();
        for (String s : map.keySet()) {
            Integer count = map.get(s);
            for (String s1 : map.keySet()) {
                if (map.get(s1)>count){

            }


            }
        }
    }


    /**
     * @apiNote сортирует Map по убыванию значения.
     * @param map Map<String, Integer>
     * @return отсортированный Map<String, Integer>
     */
//    public static Map<String, Integer> getSorted (Map<String, Integer> map, List<Integer>tempList) {
//        Map<String, Integer> newMap = new HashMap<>();
//        for (Integer integer : tempList) {
//            for (String s : map.keySet()) {
//                System.out.println("s = " + s);
//                if (map.get(s).equals(integer)) {
//                    System.out.println("map.get(s) = " + map.get(s));
//                    newMap.put(s, map.get(s));
//                    System.out.println("newMap = " + newMap);
//                }
//
//            }
//
//        }
//
//        return newMap;
//    }



//    public static List<Integer> reverseList(Map<String, Integer> map){
//        SortedMap<String,Integer> test = new TreeMap<>(map);
//        NavigableMap<String,Integer> test2 = new TreeMap<>(map);
//        test2.descendingMap();
//        Map<String, Integer> test3 = test2.descendingMap();
//
//
//        List<Integer> tempList = new ArrayList<>(map.values());
//        tempList.sort(Collections.reverseOrder());
//        System.out.println("tempList = " + tempList);
//        return tempList;
//    }


    /**
     * @apiNote Распечатывает Map <String,String>
     * @param map <String,String>
     */
    public static void printMap(Map<String, String> map) {
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + ":" + value);
        }
    }

    /**
     * @apiNote распечатывает Map <String, Integer>
     * @param map <String, Integer>
     */
    public static void printMap2(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + ":" + value);
        }
    }



    /**
     * @return записаный Map
     * @apiNote Map с Ключ - Фамилия : Значение - Имя
     */
    public static Map<String, String> getMap() {
        Map<String, String> namesMap = new HashMap<>();
        namesMap.put("Иванов", "Иван");
        namesMap.put("Петрова", "Светлана");
        namesMap.put("Белова", "Кристина");
        namesMap.put("Мусина", "Анна");
        namesMap.put("Крутова", "Анна");
        namesMap.put("Юрин", "Иван");
        namesMap.put("Лыков", "Петр");
        namesMap.put("Чернов", "Павел");
        namesMap.put("Чернышов", "Петр");
        namesMap.put("Федорова", "Мария");
        namesMap.put("Светлова", "Марина");
        namesMap.put("Рыкова", "Мария");
        namesMap.put("Лугова", "Марина");
        namesMap.put("Владимирова", "Анна");
        namesMap.put("Петин", "Петр");
        namesMap.put("Ежов", "Иван");
        namesMap.put("Мечников", "Иван");
        return namesMap;
    }
}
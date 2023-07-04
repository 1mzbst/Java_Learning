package org.example.lesson5.homework.ex2;

import java.lang.reflect.Array;
import java.util.*;

import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;

public class Ex2 {
    public static void main(String[] args) {
        Map<String, Integer> resultMap = getCountOfName(getMap());
        System.out.println("resultMap = " + resultMap);
        getSorted3(resultMap);
    }

    /**
     * @param map <String, String>
     * @return Map<String, Integer>
     * @apiNote принимает Map <String, String> и возвращает новый Map <String, Integer>.
     * Подсчитывает, сколько раз повторялось значение в переданном Map.
     */
    public static Map<String, Integer> getCountOfName(Map<String, String> map) {
        Map<String, Integer> newMap = new HashMap<>();
        Map<String, Integer> newMap2 = new HashMap<>();
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

    /**
     * @param map <String, Integer>
     * @return map <String, Integer>
     * @apiNote Вывод map в порядке убывания значения
     */
    public static Map<String, Integer> getSorted3(Map<String, Integer> map) {
        Map<String, Integer> newMap = new HashMap<>();
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach((System.out::println));
        return map;
    }


    /**
     * @param map <String,String>
     * @apiNote Распечатывает Map <String,String>
     */
    public static void printMap(Map<String, String> map) {
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + ":" + value);
        }
    }

    /**
     * @param map <String, Integer>
     * @apiNote распечатывает Map <String, Integer>
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
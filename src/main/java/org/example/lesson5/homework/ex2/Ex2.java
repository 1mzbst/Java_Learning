package org.example.lesson5.homework.ex2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;

public class Ex2 {
    public static void main(String[] args) {
        printMap(getMap());
        Map<String,Integer> forPrint=getCountOfName(getMap());
        printMap2(forPrint);
        forPrint.
    }

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

    public static void printMap2(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + ":" + value);
        }
    }

    public static Map<String,Integer> getSortedMap (Map<String, Integer> map){
        return map;

    }
}

package org.example.lesson5.homework.ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        String sentence = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String enterFromKeyboard = getScanner();
        int count = getCount( getTransformString(sentence), enterFromKeyboard);
        Map<String, Integer> result = getCountOfKey(enterFromKeyboard, count);
        printMap(result);

    }

    /**
     * @apiNote инициализирует ввод с клавиатуры
     * @return возвращает строковое значение
     */
    public static String getScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    /**
     * @apiNote трансформирует строку меняя у неё пунктуацию на пробелы, убирая лишение пробелы и превращая строку в
     * массив строк
     * @param sentence строка для трансформации
     * @return преобразовання строка
     */
    public static String [] getTransformString(String sentence){
        String sentenceRep = sentence.replace(".", " ");
        String sentenceRep2 = sentenceRep.replace("—", "");
        String sentenceRep3 = sentenceRep2.toLowerCase();
        String sentenceRep4 = sentenceRep3.replaceAll("\\s+", " ");
        return sentenceRep4.split(" ");
    }

    /**
     * @apiNote проверяет, есть ли искомое слово введённое с клавиатуры в массиве строк
     * @param splitWords массив строк полученный при помощи фуии getTransformString
     * @param enterFromKeyboard значение полученное с клавиатуры
     * @return число вхождений
     */
    public static int getCount(String [] splitWords,  String enterFromKeyboard ) {
        int count = 0;
        for (String splitWord : splitWords) {
            if (splitWord.equals(enterFromKeyboard.toLowerCase())) count++;
        }
            return count; // Остановился нужно добавить метод добовление в map
        }

    /**
     * @apiNote добовляет в новый map значения полученные с клавиатуры и число вхождения значения введённого с
     * клавиатуры
     * @param enterFromKeyboard значение введённое с клавиатуры
     * @param count число
     * @return новый Map
     */
    public static Map<String, Integer> getCountOfKey (String enterFromKeyboard, int count){
        Map<String, Integer> words = new HashMap<>();
        words.putIfAbsent(enterFromKeyboard, count);

        return words;
    }

    /**
     * @apiNote вывдит в консоль пару Ключ : Значение
     * @param map Map
     */
    public static void printMap (Map<String, Integer> map){
        for (Map.Entry<String, Integer> pair : map.entrySet())
        {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + ":" + value);
        }
    }
}

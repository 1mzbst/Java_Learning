package org.example.lesson5.homework.ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        Map<Character, Integer> words = new HashMap<>();
        String sentence = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String [] splitWords = sentence.split(" ");
        String enterFromKeyboard = getScaner();
        getCount();




        for (int i = 0; i < sentence.length(); i++) {
            words.putIfAbsent(sentence.charAt(i),0);
            words.put(sentence.charAt(i),words.get(sentence.charAt(i)) + 1);


        }

    }

    private static int getCount(String [] splitWords,  String enterFromKeyboard ) {
        int count = 0;
        for (int i = 0; i < splitWords.length; i++) {
            if (Objects.equals(enterFromKeyboard, splitWords[i])){
                count +=1;
            }

        }
        return count; // Остановился нужно добавить метод добовление в map
    }

    private static String getScaner() {
        Scanner scanner = new Scanner(System.in);
        String enterFromKeyboard = scanner.next();
        return enterFromKeyboard;
    }
}

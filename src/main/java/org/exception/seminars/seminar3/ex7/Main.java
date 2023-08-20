package org.exception.seminars.seminar3.ex7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    /*
    Запишите в файл следующие строки:
    Анна=4
    Елена=5
    Марина=6
    Владимир=?
    Константин=?
    �?ван=4
    � еализуйте метод, который считывает данные из файла и сохраняет в двумерный массив
    (либо HashMap, если студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных,
    если сохранено значение ?, заменить его на соответствующее число.
    Если на каком-то месте встречается символ, отличный от числа или ?, бросить подходящее исключение.
    Записать в тот же файл данные с замененными символами ?.
     */
    public static void main(String[] args) {
        readAndWrite();
    }

    private static void readAndWrite() {
        try {
            Map<String, String> map = readFile("test.txt");
            replaceText(map);
            saveToFile("t/t/t/test1.txt", map);
        } catch (ReadFileException e){
            e.printStackTrace();
        } catch (SaveFileException e){
            e.printStackTrace();
        } catch (IllegalArgumentException e){
            System.out.println("РќРµРІРµСЂРЅС‹Р№ С„РѕСЂРјР°С‚ Р·Р°РїРёСЃРё");
            System.out.println(e.getMessage());
        }
    }

    private static void saveToFile(String filePath, Map<String, String> map) throws SaveFileException {
        try (FileWriter writer = new FileWriter(filePath)){
            for (Map.Entry<String, String> entry: map.entrySet()){
                writer.write(entry.toString());
                writer.write("\n");
                writer.flush();
            }
        } catch (IOException e){
            throw new SaveFileException("Р—Р°РїРёСЃСЊ РІ С„Р°Р№Р» РЅРµ СѓРґР°Р»Р°СЃСЊ", e);
        }
    }

    private static void replaceText(Map<String, String> map){
        for (Map.Entry<String, String> entry: map.entrySet()){
            String key = entry.getKey();
            String val = entry.getValue();
            if (val.equals("?")){
                entry.setValue(String.valueOf(key.length()));
            } else if (!val.matches("[0-9]+")) {
                throw new IllegalArgumentException("РћС€РёР±РєР° РІ СЃС‚СЂРѕРєРµ: " + entry);
            }
        }
    }

    private static Map<String, String> readFile(String filePath) throws ReadFileException {
        Map<String, String> map = new LinkedHashMap<>();
        File file = new File(filePath);
        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNext()){
                String line = scanner.nextLine();
                String[] temp = line.split("=");
                map.put(temp[0], temp[1]);
            }
        } catch (IOException e){
            throw new ReadFileException("Р§С‚РµРЅРёРµ С„Р°Р№Р»Р° РЅРµ СѓРґР°Р»РѕСЃСЊ", e);
        }
        return map;
    }
}

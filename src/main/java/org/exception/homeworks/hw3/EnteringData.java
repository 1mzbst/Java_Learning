package org.exception.homeworks.hw3;

import org.exception.homeworks.hw3.exceptions.EnteringDataException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnteringData {
    public static String getEnteringData () throws EnteringDataException {
        System.out.println("Введите фамилию, имя, отчество, дату рождения (в формате dd.mm.yyyy), номер телефона " +
                "(число без разделителей) и пол(символ латиницей f или m), разделенные пробелом");

        String text;
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            text = bf.readLine();
        }catch (IOException e){
            throw new EnteringDataException("Произошла ошибка при работе с консолью");
//            throw new Exception("Произошла ошибка при работе с консолью");
        }
        return text;
    }
}

package org.exception.homeworks.hw2.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getFloat();

    }

    public static void getFloat() {
        try {
            System.out.println("Введите дробь: ");
            Scanner scanner = new Scanner(System.in);
            float fromUser = scanner.nextFloat();
            System.out.println("Вот это ваше число: " + fromUser);
        } catch (InputMismatchException e) {
            System.out.println("Неверный формат записи, повторите ввод!");
            getFloat();

        }

    }

}


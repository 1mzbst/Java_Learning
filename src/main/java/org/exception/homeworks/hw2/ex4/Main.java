package org.exception.homeworks.hw2.ex4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Введите строку: ");
            Scanner scanner = new Scanner(System.in);
            String fromUser = scanner.nextLine();
            System.out.println(fromUser);
        }catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}

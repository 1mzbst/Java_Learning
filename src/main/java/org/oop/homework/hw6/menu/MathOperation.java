package org.oop.homework.hw6.menu;

import java.util.Scanner;

public class MathOperation {
    char mathDoings;

    /**
     * @return mathDoings c математической операцией.
     * @apiNote Через сканер плучает математическии операции "*", "/", "+", "-" записывает их переменную mathDoings.
     */
    public char getMathValue() {
        System.out.println("""
                Выберите действие:\s
                << * >> - умножение;\s
                << / >> - деление;\s
                << + >> сложение;\s
                Ввдите значение: \s""");

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            mathDoings = scanner.next().charAt(0);
        } else {
            System.out.println("Что то пошло не так, попробуйте снова!");
            getMathValue();
        }
        return mathDoings;
    }
}

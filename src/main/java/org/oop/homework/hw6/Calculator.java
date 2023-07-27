package org.oop.homework.hw6;

public class Calculator {
    double result;

    public double getResult(double num1, double num2) {
        MathOperation mathOp = new MathOperation();
        switch (mathOp.getMathValue()) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> {
                System.out.println("Вы ничего не ввели! Нажимайте на кнопки!");
                result = getResult(num1, num2);
            }
        }
        return result;
    }
}

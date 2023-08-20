package org.exception.seminars.seminar3.ex4;

public class Main {
    public static void main(String[] args) {
        try {
            double res = divideTwo(6, 0);
            System.out.println(res);
        } catch (DivisionByZeroException e) {
            e.printStackTrace();
        }
    }

    public static double divideTwo(int num1, int num2) {
        if (num2 == 0) {
            throw new DivisionByZeroException("You can't divide by zero!");
        }
        return num1 / num2;
    }
}

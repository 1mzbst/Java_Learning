package org.oop.homework.hw6;

import org.oop.homework.hw6.complex.*;
import org.oop.homework.hw6.results.*;

public class Calculator {


    public static void getResult() {
        MathOperation mathOp = new MathOperation();
        switch (mathOp.getMathValue()) {
            case '+' -> SumResult.getSumResult();
            case '*' -> MultiplyResult.getMultiplyResult();
            case '/' -> DivideResult.getDivideResult();
            default -> {
                System.out.println("Вы ничего не ввели! Нажимайте на кнопки!");
                getResult();
            }
        }

    }
}

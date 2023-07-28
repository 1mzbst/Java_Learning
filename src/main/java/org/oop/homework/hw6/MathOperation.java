package org.oop.homework.hw6;
import java.util.Scanner;
public class MathOperation {
    char mathDoings;

    /**
     * @apiNote Через сканер плучает математическии операции "*", "/", "+", "-" записывает их переменную mathDoings.
     * @return mathDoings c математической операцией.
     */
    public char getMathValue(){
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            this.mathDoings = scanner.next().charAt(0);
        } else {
            System.out.println("Что то пошло не так, попробуйте снова!");
            getMathValue();
        }
        return this.mathDoings;
    }
}

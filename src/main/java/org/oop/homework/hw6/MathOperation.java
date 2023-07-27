package org.oop.homework.hw6;
import java.util.Scanner;
public class MathOperation {
    char mathDoings;

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

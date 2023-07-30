package org.oop.homework.hw6;

import org.oop.homework.hw6.complex.Multiply;
import org.oop.homework.hw6.complex.Sum;

public class Xmain {
    public static void main(String[] args) {

//     Sum a = new Sum(5,6);
//     Sum b = new Sum (-3, 4);


//        System.out.println("b + a  = " + Sum.getSum(a,b));

        Multiply a = new Multiply(5,6);
        Multiply b = new Multiply(-3,4);
        System.out.println("a * b  = " + Multiply.getMultiply(a,b));
    }


}

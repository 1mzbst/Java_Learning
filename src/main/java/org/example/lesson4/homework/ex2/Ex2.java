package org.example.lesson4.homework.ex2;

import java.util.*;

public class Ex2 {

    public static void main (String [] args){
        String s = "()(){}[][]()[)[](){}";
        System.out.println("Does our string is valid? -> " + getCheck(s));
    }

    /**
     * @apiNote Проверяет строку согласно условию задачи используя очередь.
     * @param s Принимает строку на проверку
     * @return true || false
     */
    public static boolean getCheck(String s){
        char [] s2 = s.toCharArray();
        Deque <Character> checkDeque = new ArrayDeque<>();
        for (Character i : s2) {
            if (i == '(') {
                checkDeque.push(')');
            }
            else if (i == '{'){
                checkDeque.push('}');
            }
            else if (i == '['){
                checkDeque.push(']');
            }
            else if (checkDeque.isEmpty() || checkDeque.pop () !=i) {
                return false;
            }
        }
        return checkDeque.isEmpty();
    }
}


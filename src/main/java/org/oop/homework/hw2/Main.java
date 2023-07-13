package org.oop.homework.hw2;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        new Cat().printCat();
        Cat cat = new Cat(1,50);

        Treadmill treadmill = new Treadmill();
        Map<Integer,Integer> realObst = treadmill.obstacleCourse();
        System.out.println("Полоса дистанций" + realObst);
        for (Integer integer : realObst.keySet()) {
            if(cat.getMaxRun() >= realObst.get(integer)){
                System.out.println("Дистанция -> " + integer);
                cat.runCat();
            }else{
                System.out.println("Дистанция -> " + integer);
                cat.runNotCat();
                break;
            }
        }




        }

    }

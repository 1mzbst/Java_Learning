package org.oop.seminars.seminar5.ex2;

public class Outer {
    public static void main(String[] args) {
        Flyable flyable = new Flyable() {
            @Override
            public void fly() {
                System.out.println("летим - летим!");
            }
        };
        System.out.println(flyable.getClass().getName());
        Flyable flyable2 = new Flyable() {
            @Override
            public void fly() {
                System.out.println("летим - летим!");
            }
        };
        System.out.println(flyable2.getClass().getName());

    }

}

//public class Outer {
//
//    public static void main(String[] args) {
//        Flyable flyable = new Flyable() {
//            @Override
//            public void fly() {
//                System.out.println("летим - летим!");
//            }
//        };
//        // new Flyable()
//        // Outer implements Flyable
//        // происходит овверайд методов
//        // Outer fluyable = new Outer();
//    }
//
//}
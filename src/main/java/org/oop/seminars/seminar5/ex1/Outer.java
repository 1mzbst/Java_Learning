package org.oop.seminars.seminar5.ex1;

public class Outer {
    public Outer(int outerValue) {
        this.outerValue = outerValue;
    }

    public Outer() {
    }

    class Inner {
        int innerValue;

        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }

        public void innerMethod(){
            System.out.println(outerValue);
            System.out.println(innerValue);
//            innerMethod();
            outerMethod();
        }
    }
    int outerValue;

    public void outerMethod(){
        System.out.println(outerValue);
//        System.out.println(innerValue);
//            innerMethod();
//        outerMethod();
    }

    public static void main(String[] args) {
        Inner inner = new Outer().new Inner(10);
    }

}


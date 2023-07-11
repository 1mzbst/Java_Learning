package org.oop.seminars.seminar4.ex2;


public class Main {
    public static void main(String[] args) {
        BoxWithNumber<Integer> boxWithNumber = new BoxWithNumber(1,2,3,4);
        System.out.println("boxWithNumber.avarge() = " + boxWithNumber.avarge());

        BoxWithNumber<Integer> boxWithNumber2 = new BoxWithNumber<>(1,2,3,4);
        System.out.println("boxWithNumber2.compareAvarge(boxWithNumber2) = " + boxWithNumber2.compareAvarge(boxWithNumber2));
    }


}

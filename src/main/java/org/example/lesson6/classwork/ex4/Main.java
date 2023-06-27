package org.example.lesson6.classwork.ex4;

public class Main {
    public static void main(String[] args) {
        double temp = 0.0;
        System.out.println("temp C = " + new Celsii().convertValue(temp));
        System.out.println("temp Kelvin = " + new Kelvin().convertValue(temp));
        System.out.println("temp Foren = " + new Farengheit().convertValue(temp));
    }
}

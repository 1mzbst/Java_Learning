package org.example.lesson6.classwork.ex4;

public class Kelvin implements Converter {

    @Override
    public double convertValue(double baseValue) {
        return baseValue + 273.15;
    }
}

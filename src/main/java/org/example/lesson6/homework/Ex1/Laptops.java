package org.example.lesson6.homework.Ex1;

import java.util.ArrayList;

public class Laptops {
    public ArrayList<Laptop> listOfLaptops(){
        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add( new Laptop(128,500,256,1999,"Windows","yellow"));
        laptops.add(new Laptop(512,256,64,1995,"Android","black"));
        return laptops;
    }

}

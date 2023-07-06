package org.example.lesson6.homework.Ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите название ");
        String number = scanner.next();
        Laptops getName = new Laptops();
        ArrayList<Laptop> newList = getName.getLaptopName(getName.listOfLaptops(),number);
        System.out.println("newList = " + newList);
//        getName.getLaptopName(getName.listOfLaptops(),number);

//        Laptop nosy = new Laptop("",128,500,256,1999,"Windows","yellow");
//        Laptop  = new Laptop("ellpa",256,500,512,2000,"Apple","red");
//        Laptop Ssusa = new Laptop("Ssusa",512,256,64,1995,"Android","black");
//        Laptop Sera = new Laptop("Sera",256,500,512,2000,"Windows","green");
//        Laptop SeraViper  = new Laptop("SeraViper",128,500,256,1999,"Windows","yellow");
//        Laptop SsusaQwerty = new Laptop("SsusaQwerty",256,500,512,2000,"Apple","white");
//        Laptop ellpaAlfa = new Laptop("ellpaAlfa",512,256,64,1995,"Android","black");
//        Laptop nosyPrime = new Laptop("nosyPrime",256,500,512,2000,"Windows","green");

    }

}

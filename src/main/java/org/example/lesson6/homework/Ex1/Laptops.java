package org.example.lesson6.homework.Ex1;

import java.util.ArrayList;

public class Laptops {

    public ArrayList<Laptop> getLaptopOZU(ArrayList<Laptop> listOfLaptops, int numbOZU) {
        ArrayList<Laptop> newListOZU = new ArrayList<>();
        for (int i = 0; i < listOfLaptops.size(); i++) {
            if (listOfLaptops.get(i).getOZU() == numbOZU) {
                newListOZU.add(listOfLaptops.get(i));
            }
        }
        return newListOZU;
    }

    public ArrayList<Laptop> getLaptopHDD(ArrayList<Laptop> listOfLaptops, int numbHDD) {
//        Map <Integer, Laptop> newMap = new HashMap<>();
        ArrayList<Laptop> newListHDD = new ArrayList<>();
        for (int i = 0; i < listOfLaptops.size(); i++) {
            if (listOfLaptops.get(i).getHDD() == numbHDD) {
                newListHDD.add(listOfLaptops.get(i));
            }
        }
        return newListHDD;
    }
    public ArrayList<Laptop> getLaptopGP(ArrayList<Laptop> listOfLaptops, int numbGP) {
        ArrayList<Laptop> newListGP = new ArrayList<>();
        for (int i = 0; i < listOfLaptops.size(); i++) {
            if (listOfLaptops.get(i).getGP() == numbGP) {
                newListGP.add(listOfLaptops.get(i));
            }
        }
        return newListGP;
}
    public ArrayList<Laptop> getLaptopYear(ArrayList<Laptop> listOfLaptops, int numbYear) {
        ArrayList<Laptop> newListYear = new ArrayList<>();
        for (int i = 0; i < listOfLaptops.size(); i++) {
            if (listOfLaptops.get(i).getYear() == numbYear) {
                newListYear.add(listOfLaptops.get(i));
            }
        }
        return newListYear;
    }

    public ArrayList<Laptop> getLaptopName(ArrayList<Laptop> listOfLaptops, String numbName) {
        ArrayList<Laptop> newListName = new ArrayList<>();
        for (int i = 0; i < listOfLaptops.size(); i++) {
            if (listOfLaptops.get(i).getName().contains(numbName)) {

                newListName.add(listOfLaptops.get(i));
            }
        }
//        System.out.println("newListName = " + newListName);
        return newListName;
    }
    public ArrayList<Laptop> getLaptopColor(ArrayList<Laptop> listOfLaptops, String color) {
        ArrayList<Laptop> newListColor = new ArrayList<>();
        for (int i = 0; i < listOfLaptops.size(); i++) {
            if (listOfLaptops.get(i).getColor().contains(color)) {
                newListColor.add(listOfLaptops.get(i));
            }
        }
        return newListColor;
    }
    public ArrayList<Laptop> getLaptopOS(ArrayList<Laptop> listOfLaptops, String oS) {
        ArrayList<Laptop> newListOS = new ArrayList<>();
        for (int i = 0; i < listOfLaptops.size(); i++) {
            if (listOfLaptops.get(i).getOS().contains(oS)) {
                newListOS.add(listOfLaptops.get(i));
            }
        }
        return newListOS;
    }

    public ArrayList<Laptop> listOfLaptops(){
        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add( new Laptop("Nosy",128,500,256,1999,"Windows","yellow"));
        laptops.add(new Laptop("Sera",512,256,64,1995,"Android","black"));
        laptops.add(new Laptop("ellpa",256,500,512,2000,"Apple","red"));
        laptops.add(new Laptop("Ssusa",512,256,64,1995,"Android","black"));
        laptops.add(new Laptop("SeraViper",128,500,256,1999,"Windows","yellow"));
        laptops.add(new Laptop("SsusaQwerty",256,500,512,2000,"Apple","white"));
        laptops.add(new Laptop("nosyPrime",256,500,512,2000,"Windows","green"));
        laptops.add( new Laptop("ellpaAlfa",512,256,64,1995,"Android","black"));
        return laptops;



    }

}

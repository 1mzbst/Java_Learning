package org.example.lesson6.homework.Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Laptops {

    /**
     * @apiNote Переберает массив, считывает значение введенное с клавиатуры. Значение - желаемый вид фильтрации.
     * @param listOfLaptops массив Ноутбуков.
     * @return результат фильтрации по OZU
     */
    public ArrayList<Laptop> getLaptopOZU(ArrayList<Laptop> listOfLaptops) {
        System.out.println("Enter the OZU of laptop:");
        Scanner scanner = new Scanner(System.in);
        Integer fromKeyBord = scanner.nextInt();
        ArrayList<Laptop> newListOZU = new ArrayList<>();
        for (int i = 0; i < listOfLaptops.size(); i++) {
            if (listOfLaptops.get(i).getOZU() == fromKeyBord) {
                newListOZU.add(listOfLaptops.get(i));
            }
        }
        return newListOZU;
    }

    /**
     * @apiNote Переберает массив, считывает значение введенное с клавиатуры. Значение - желаемый вид фильтрации.
     * @param listOfLaptops массив Ноутбуков.
     * @return езультат фильтрации по HDD
     */
    public ArrayList<Laptop> getLaptopHDD(ArrayList<Laptop> listOfLaptops) {
        System.out.println("Enter the HDD of laptop:");
        Scanner scanner = new Scanner(System.in);
        Integer fromKeyBord = scanner.nextInt();
        ArrayList<Laptop> newListHDD = new ArrayList<>();
        for (int i = 0; i < listOfLaptops.size(); i++) {
            if (listOfLaptops.get(i).getHDD().equals(fromKeyBord)) {
                newListHDD.add(listOfLaptops.get(i));
            }
        }
        return newListHDD;
    }

    /**
     * @apiNote Переберает массив, считывает значение введенное с клавиатуры. Значение - желаемый вид фильтрации.
     * @param listOfLaptops массив Ноутбуков.
     * @return езультат фильтрации по GP
     */
    public ArrayList<Laptop> getLaptopGP(ArrayList<Laptop> listOfLaptops) {
        System.out.println("Enter the GP of laptop:");
        Scanner scanner = new Scanner(System.in);
        Integer fromKeyBord = scanner.nextInt();
        ArrayList<Laptop> newListGP = new ArrayList<>();
        for (int i = 0; i < listOfLaptops.size(); i++) {
            if (listOfLaptops.get(i).getGP().equals(fromKeyBord)) {
                newListGP.add(listOfLaptops.get(i));
            }
        }
        return newListGP;
}

    /**
     * @apiNote Переберает массив, считывает значение введенное с клавиатуры. Значение - желаемый вид фильтрации.
     * @param listOfLaptops массив Ноутбуков.
     * @return езультат фильтрации по Year
     */
    public ArrayList<Laptop> getLaptopYear(ArrayList<Laptop> listOfLaptops) {
        System.out.println("Enter the Year of laptop:");
        Scanner scanner = new Scanner(System.in);
        Integer fromKeyBord = scanner.nextInt();
        ArrayList<Laptop> newListYear = new ArrayList<>();
        for (int i = 0; i < listOfLaptops.size(); i++) {
            if (listOfLaptops.get(i).getYear().equals(fromKeyBord)) {
                newListYear.add(listOfLaptops.get(i));
            }
        }
        return newListYear;
    }

    /**
     * @apiNote Переберает массив, считывает значение введенное с клавиатуры. Значение - желаемый вид фильтрации.
     * @param listOfLaptops массив Ноутбуков.
     * @return езультат фильтрации по Name
     */
    public ArrayList<Laptop> getLaptopName(ArrayList<Laptop> listOfLaptops) {
        System.out.println("Enter the Name of laptop:");
        Scanner scanner = new Scanner(System.in);
        String fromKeyBord = scanner.next();
        ArrayList<Laptop> newListName = new ArrayList<>();
        for (int i = 0; i < listOfLaptops.size(); i++) {
            if (listOfLaptops.get(i).getName().contains(fromKeyBord)) {

                newListName.add(listOfLaptops.get(i));
            }
        }
//        System.out.println("newListName = " + newListName);
        return newListName;
    }

    /**
     * @apiNote Переберает массив, считывает значение введенное с клавиатуры. Значение - желаемый вид фильтрации.
     * @param listOfLaptops массив Ноутбуков.
     * @return езультат фильтрации по Color;
     */
    public ArrayList<Laptop> getLaptopColor(ArrayList<Laptop> listOfLaptops) {
        System.out.println("Enter the color of laptop:");
        Scanner scanner = new Scanner(System.in);
        String fromKeyBord = scanner.next();
        ArrayList<Laptop> newListColor = new ArrayList<>();
        for (int i = 0; i < listOfLaptops.size(); i++) {
            if (listOfLaptops.get(i).getColor().contains(fromKeyBord)) {
                newListColor.add(listOfLaptops.get(i));
            }
        }
        return newListColor;
    }

    /**
     * @apiNote Переберает массив, считывает значение введенное с клавиатуры. Значение - желаемый вид фильтрации.
     * @param listOfLaptops массив Ноутбуков.
     * @return езультат фильтрации по OS;
     */
    public ArrayList<Laptop> getLaptopOS(ArrayList<Laptop> listOfLaptops) {
        System.out.println("Enter the OS of laptop:");
        Scanner scanner = new Scanner(System.in);
        String fromKeyBord = scanner.next();
        ArrayList<Laptop> newListOS = new ArrayList<>();
        for (int i = 0; i < listOfLaptops.size(); i++) {
            if (listOfLaptops.get(i).getOS().contains(fromKeyBord)) {
                newListOS.add(listOfLaptops.get(i));
            }
        }
        return newListOS;
    }

    /**
     * @apiNote Список ноутбуков.
     * @return
     */
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

//package org.example.lesson3.seminar.classwork;
//
//import org.example.lesson3.seminar.classwork.ex2.Item;
//
//import java.util.Scanner;
//import java.util.Random;
//public class Ex1 {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        List<Item> itemList = createList(n);
//        System.out.println("itemList = " + itemList);
//        String searchName = scanner.nextLine();
//        Integer sumVolume = 0;
//        List<String> countryList = new ArrayList<>();
//        zad1(sumVolume,countryList,itemList,searchName);
//    }
//
//    /**
//     * @apiNote  //1.Найти страны, ко	торые экспортируют данный(введенный с кл-ы) товар, и общий объем его экспорта.
//     * @param sumVolume
//     * @param countryList
//     * @param itemList
//     * @param searchName
//     */
//    private static void zad1(Integer sumVolume, List<String> countryList, List<Item> itemList,String searchName) {
//        for (int i = 0; i < itemList.size(); i++) {
//            if (itemList.get(i).getName().equals(searchName)) {
//                sumVolume += itemList.get(i).getVolume();
//                countryList.add(itemList.get(i).getCountry());
//            }
//        }
//        System.out.println("countryList = " + countryList);
//        System.out.println(sumVolume);
//    }
//
//    /**
//     * @apiNote формирование ArrayList
//     * @param n
//     * @return
//     */
//    private static ArrayList<Item> createList(int n) {
//        ArrayList<Item> resultList = new ArrayList<>();
//        Random random = new Random();
//        for (int i = 0; i < n; i++) {
//            Item item1 = new Item("qwe1", "asd1", random.nextInt(100));
//            Item item2 = new Item("qwe2", "asd2", random.nextInt(100));
//            Item item3 = new Item("qwe3", "asd3", random.nextInt(100));
//            Item item4 = new Item("qwe1", "asd4", random.nextInt(100));
//            resultList.add(item1);
//            resultList.add(item2);
//            resultList.add(item3);
//            resultList.add(item4);
//        }
//        return resultList;
//    }
//}

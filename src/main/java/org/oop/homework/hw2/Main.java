package org.oop.homework.hw2;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Знакомтесь с нашими участниками!");
        new Cat().printCat();
        new Human().printHuman();
        new Robot().printRobot();
        Cat cat = new Cat(50, 50);
        Human human = new Human(90, 100);
        Robot robot = new Robot(1000, 5000);
        System.out.println("Начинаем!");

        Treadmill treadmill = new Treadmill();
        Map<Integer, Integer> realObst = treadmill.obstacleCourse();
        System.out.println("Полоса дистанций " + realObst);
        Wall wall = new Wall();
        Map<Integer, Integer> realObstWall = wall.getObstacle();
        System.out.println("Полоса стен " + realObstWall);
        getResultOfCat(cat, realObst, realObstWall);
        getResultOfHuman(human, realObst, realObstWall);
        getResultOfRobot(robot, realObst, realObstWall);
        System.out.println("хм.. нам нужет Unicode");
    }

    /**
     * @apiNote Получаем результат сравнения значений maxRun и maxJump объекта класса Cat
     * со значениями по ключам двух Map
     * @param someCat объект класса Cat
     * @param mapTread map класса Treadmill
     * @param mapWall map класса Wall
     */
    public static void getResultOfCat(Cat someCat, Map<Integer, Integer> mapTread, Map<Integer, Integer> mapWall) {

        for (Integer integer : mapTread.keySet()) {
            if (someCat.getMaxRun() >= mapTread.get(integer)) {
                System.out.println("Дистанция -> " + integer);
                someCat.runCat();
            } else {
                System.out.println("Дистанция -> " + integer);
                someCat.runNotCat();
                break;
            }
        }
        System.out.println("Переходим ко второму этапу!");
        for (Integer integer : mapWall.keySet()) {
            if (someCat.getMaxJump() >= mapWall.get(integer)) {
                System.out.println("Стена -> " + integer);
                someCat.jumpCat();
            } else {
                System.out.println("Стена -> " + integer);
                someCat.jumpNotCat();
                break;
            }
        }

    }
    /**
     * @apiNote Получаем результат сравнения значений maxRun и maxJump объекта класса Human
     * со значениями по ключам двух Map
     * @param someHuman объект класса Cat
     * @param mapTread map класса Treadmill
     * @param mapWall map класса Wall
     */
    public static void getResultOfHuman(Human someHuman, Map<Integer, Integer> mapTread, Map<Integer, Integer> mapWall) {

        for (Integer integer : mapTread.keySet()) {
            if (someHuman.getMaxRun() >= mapTread.get(integer)) {
                System.out.println("Дистанция -> " + integer);
                someHuman.runHuman();
            } else {
                System.out.println("Стена -> " + integer);
                someHuman.runNotHuman();
                break;
            }
        }
        System.out.println("Переходим ко второму этапу!");
        for (Integer integer : mapWall.keySet()) {
            if (someHuman.getMaxJump() >= mapWall.get(integer)) {
                System.out.println("Дистанция -> " + integer);
                someHuman.jumpHuman();
            } else {
                System.out.println("Дистанция -> " + integer);
                someHuman.jumpNotHuman();
                break;
            }
        }

    }
    /**
     * @apiNote Получаем результат сравнения значений maxRun и maxJump объекта класса Robot
     * со значениями по ключам двух Map
     * @param someRobot объект класса Cat
     * @param mapTread map класса Treadmill
     * @param mapWall map класса Wall
     */
    public static void getResultOfRobot(Robot someRobot, Map<Integer, Integer> mapTread, Map<Integer, Integer> mapWall) {

        for (Integer integer : mapTread.keySet()) {
            if (someRobot.getMaxRun() >= mapTread.get(integer)) {
                System.out.println("Дистанция -> " + integer);
                someRobot.runRobot();
            } else {
                System.out.println("Стена -> " + integer);
                someRobot.runNotRobot();
                break;
            }
        }
        System.out.println("Переходим ко второму этапу!");
        for (Integer integer : mapWall.keySet()) {
            if (someRobot.getMaxJump() >= mapWall.get(integer)) {
                System.out.println("Дистанция -> " + integer);
                someRobot.runRobot();
            } else {
                System.out.println("Дистанция -> " + integer);
                someRobot.jumpNotRobot();
                break;
            }
        }

    }
}


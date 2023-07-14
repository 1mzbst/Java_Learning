package org.oop.homework.hw2;

public class Human {
    private String jump;
    private String run;


    private int MaxJump;

    private int MaxRun;

    public Human(){
        this.jump = "я умею прыгать, хех";
        this.run = "я умею бегать, хех";
    }

    public void jumpHuman(){
        System.out.println("Перепрыгнул, йуху!");
    }
    public void jumpNotHuman(){
        System.out.println("Не перепрыгнул, эх!");
    }

    public void runHuman(){
        System.out.println("Пробежал, йуху!");
    }

    public void runNotHuman(){
        System.out.println("Не пробежал, эх!");
    }

    public Human(String jump, String run) {
        this.jump = jump;
        this.run = run;
    }

    public Human(int maxJump, int maxRun) {
        MaxJump = maxJump;
        MaxRun = maxRun;
    }


    public void printHuman(){
        System.out.println(jump);
        System.out.println(run);
    }

    public int getMaxJump() {
        return MaxJump;
    }

    public int getMaxRun() {
        return MaxRun;
    }
}

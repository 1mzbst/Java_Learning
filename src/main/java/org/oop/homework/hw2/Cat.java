package org.oop.homework.hw2;



public class Cat {
    private String jump;
    private String run;

    private int MaxJump;

    private int MaxRun;

    public Cat(){
        this.jump = "я умею прыгать, мяу";
        this.run = "я умею бегать, мяу";
    }

    public Cat(int maxJump, int maxRun) {
        MaxJump = maxJump;
        MaxRun = maxRun;
    }

    public void jumpCat(){
        System.out.println("Перепрыгнул, мяу!");
    }
    public void jumpNotCat(){
        System.out.println("Не перепрыгнул, мяу!");
    }

    public void runCat(){
        System.out.println("Пробежал, мяу");
    }

    public void runNotCat(){
        System.out.println("Не пробежал, мяу");
    }

    public Cat(String jump, String run) {
        this.jump = jump;
        this.run = run;
    }

    public void printCat(){
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


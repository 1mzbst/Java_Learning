package org.oop.homework.hw2;



public class Cat {
    private String jump;
    private String run;

    public Cat(){
        this.jump = "я умею прыгать, мяу";
        this.run = "я умею бегать, мяу";
    }

    public Cat(String jump, String run) {
        this.jump = jump;
        this.run = run;
    }

    public void printCat(){
        System.out.println(jump);
        System.out.println(run);
    }
}


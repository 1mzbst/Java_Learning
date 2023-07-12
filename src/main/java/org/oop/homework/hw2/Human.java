package org.oop.homework.hw2;

public class Human {
    private String jump;
    private String run;

    public Human(){
        this.jump = "я умею прыгать, хех";
        this.run = "я умею бегать, хех";
    }

    public Human(String jump, String run) {
        this.jump = jump;
        this.run = run;
    }

    public void printCat(){
        System.out.println(jump);
        System.out.println(run);
    }
}

package org.oop.homework.hw2;

public class Robot {
    private String jump;
    private String run;

    public Robot(){
        this.jump = "я умею прыгать, 0101";
        this.run = "я умею бегать, 0101";
    }

    public Robot(String jump, String run) {
        this.jump = jump;
        this.run = run;
    }

    public void printCat(){
        System.out.println(jump);
        System.out.println(run);
    }
}


package org.oop.homework.hw2;

public class Robot {
    private String jump;
    private String run;

    private int MaxJump;

    private int MaxRun;

    public Robot(){
        this.jump = "41b 438 43a 432 438 434 438 440 43e 432 430 442 44c 20 414 436 43e 43d 430 20 41a 43e 43d " +
                "43d 43e 440 430";
        this.run = "41b 438 43a 432 438 434 438 440 43e 432 430 442 44c 20 414 436 43e 43d 430 20 41a 43e 43d " +
                "43d 43e 440 430";
    }
    public void jumpRobot(){
        System.out.println("41b 438 43a 432 438 434 438 440 43e 432 430 442 44c 20 414 436 43e 43d 430 20 41a 43e " +
                "43d 43d 43e 440 430");
    }
    public void jumpNotRobot(){
        System.out.println("41b 438 43a 432 438 434 438 440 43e 432 430 442 44c 20 414 436 43e 43d 430 20 41a 43e" +
                " 43d 43d 43e 440 430");
    }

    public void runRobot(){
        System.out.println("41b 438 43a 432 438 434 438 440 43e 432 430 442 44c 20 414 436 43e 43d 430 20 41a " +
                "43e 43d 43d 43e 440 430");
    }

    public void runNotRobot(){
        System.out.println("41b 438 43a 432 438 434 438 440 43e 432 430 442 44c 20 414 436 43e 43d 430 20 41a " +
                "43e 43d 43d 43e 440 430");
    }
    public Robot(String jump, String run) {
        this.jump = jump;
        this.run = run;
    }

    public Robot(int maxJump, int maxRun) {
        MaxJump = maxJump;
        MaxRun = maxRun;
    }

    public void printRobot(){
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


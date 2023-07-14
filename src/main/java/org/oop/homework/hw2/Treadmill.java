package org.oop.homework.hw2;

import java.util.HashMap;
import java.util.Map;

public class Treadmill {

    Map<Integer, Integer> obstacle;


    public Map<Integer, Integer> obstacleCourse() {
        this.obstacle = new HashMap<>();
        obstacle.put(1, 10);
        obstacle.put(2, 30);
        obstacle.put(3, 60);
        obstacle.put(4, 100);
        obstacle.put(5, 300);
        return obstacle;
    }

}

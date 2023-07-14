package org.oop.homework.hw2;

import java.util.HashMap;
import java.util.Map;

public class Wall {
    private Map<Integer, Integer> obstacle;

    public Wall() {
    }

    public Map<Integer, Integer> getObstacle() {
        this.obstacle = new HashMap<>();
        obstacle.put(1, 10);
        obstacle.put(2, 50);
        obstacle.put(3, 80);
        obstacle.put(4, 120);
        obstacle.put(5, 250);
        return obstacle;
    }
}


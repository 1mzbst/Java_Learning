package org.example.lesson3.seminar.homework.ex2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


    @Data
    @AllArgsConstructor
    @NoArgsConstructor

    public class Goods1 {
        private String name;
        private String origin;
        private Integer weight;
        private String grade;
        private Integer price;
    }


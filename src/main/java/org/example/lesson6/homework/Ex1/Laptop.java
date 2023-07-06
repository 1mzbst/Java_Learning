package org.example.lesson6.homework.Ex1;

import java.time.Year;

public class Laptop {
    private String Name;
    private Integer OZU;
    private Integer HDD;
    private Integer GP;
    private Integer Year;
    private String OS;
    private String Color;

    public Integer getOZU() {
        return OZU;
    }

    public void setOZU(Integer OZU) {
        this.OZU = OZU;
    }

    public Integer getHDD() {
        return HDD;
    }

    public void setHDD(Integer HDD) {
        this.HDD = HDD;
    }

    public Integer getGP() {
        return GP;
    }

    public void setGP(Integer GP) {
        this.GP = GP;
    }

    public Integer getYear() {
        return Year;
    }

    public void setYear(Integer year) {
        Year = year;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Laptop() {
    }
    public Laptop(String Name, Integer OZU, Integer HDD, Integer GP, Integer Year, String OS, String color) {
        this.Name = Name;
        this.OZU = OZU;
        this.HDD = HDD;
        this.GP = GP;
        this.Year = Year;
        this.OS = OS;
        this.Color = color;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

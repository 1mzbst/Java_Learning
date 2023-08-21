package org.exception.homeworks.hw3;

public class CheckForSex {
    public static String CheckForSex(String [] array){
        String sex = array[5];
        if (!sex.equalsIgnoreCase("m") && !sex.equalsIgnoreCase("f")){
            throw new RuntimeException("Неверно введен пол");
        }
        return sex;
    }
}

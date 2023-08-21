package org.exception.homeworks.hw3;

public class CheckForPhoneNumber {
    public static Integer CheckForPhoneNumber(String [] array){
        int phone;
        try {
            phone = Integer.parseInt(array[4]);
        }catch (NumberFormatException e){
            throw new NumberFormatException("Неверный формат телефона");
        }
        return phone;
    }
}

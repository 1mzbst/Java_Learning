package org.exception.homeworks.hw3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckForBirthDate {
    public static Date CheckForBirthDate(String[] array) throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date birthdate;
        try {
            birthdate = format.parse(array[3]);
        }catch (ParseException e){
            throw new ParseException("Неверный формат даты рождения", e.getErrorOffset());
        }

        return birthdate;
    }
}

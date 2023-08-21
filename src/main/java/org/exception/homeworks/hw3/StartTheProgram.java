package org.exception.homeworks.hw3;

import org.exception.homeworks.hw3.exceptions.ArraySizeException;

public class StartTheProgram {
    public static void getStart () throws Exception {
        String[] array = EnteringData.getEnteringData().split(" ");
        if (array.length != 6) {
            throw new ArraySizeException("Введено неверное количество параметров");
        }
        CheckForBirthDate.CheckForBirthDate(array);
        CheckForPhoneNumber.CheckForPhoneNumber(array);
        CheckForSex.CheckForSex(array);
        WriteInFile.getFile(array);
    }
}

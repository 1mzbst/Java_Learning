package org.exception.homeworks.hw3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.text.ParseException;

public class WriteInFile {
    public static void getFile(String[] array) throws FileSystemException {
        String surname = array[0];
        String name = array[1];
        String patronymic = array[2];


        String fileName = "\\Desktop\\ForHW\\" + surname.toLowerCase() + ".txt"; // сохраняет на рабочий стол
        File file = new File(fileName);
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            if (file.length() > 0) {
                fileWriter.write('\n');
            }
            fileWriter.write(String.format("%s %s %s %s %s %s", surname, name, patronymic,
                    CheckForBirthDate.CheckForBirthDate(array),
                    CheckForPhoneNumber.CheckForPhoneNumber(array), CheckForSex.CheckForSex(array)));
            System.out.println("File was written");
        } catch (IOException | ParseException e) {
            throw new FileSystemException("Возникла ошибка при работе с файлом");
        }

    }
}

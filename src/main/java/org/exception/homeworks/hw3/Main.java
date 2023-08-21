package org.exception.homeworks.hw3;
import java.io.*;
import java.nio.file.FileSystemException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {
    /*
    Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные
     пробелом (данные вводятся одной строкой без запятых):
Фамилия Имя Отчество, дата рождения, номер телефона, пол

Форматы данных:
фамилия, имя, отчество - строки
дата рождения - строка формата dd.mm.yyyy
номер телефона - целое беззнаковое число без форматирования
пол - символ латиницей f или m.

Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым,
вернуть код ошибки. Создать метод, который обработает его и покажет пользователю сообщение,
 что он ввел меньше или больше данных, чем требуется.

Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры.
 Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы.
  Можно использовать встроенные типы java или создать свои. Исключение должно быть корректно обработано,
   пользователю выведено сообщение с информацией, что именно неверно.

Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии.
В него в одну строку должны записаться полученные данные, вида

Фамилия Имя Отчество, дата рождения, номер телефона, пол

Однофамильцы должны записаться в один и тот же файл, в отдельные строки.

Не забудьте закрыть соединение с файлом.

При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано,
 пользователь должен увидеть стектрейс ошибки.
     */


    public static void main(String[] args) throws IOException {

        try {
            makeRecord();
            System.out.println("File was written");
        } catch (FileSystemException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }


    public static void makeRecord() throws Exception{
//        System.out.println("Введите фамилию, имя, отчество, дату рождения (в формате dd.mm.yyyy), номер телефона " +
//                "(число без разделителей) и пол(символ латиницей f или m), разделенные пробелом");
//
//        String text;
//        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
//            text = bf.readLine();
//        }catch (IOException e){
//            throw new Exception("Произошла ошибка при работе с консолью");
//        }
//        EnteringData.getEnteringData();
        String[] array = EnteringData.getEnteringData().split(" ");
        if (array.length != 6){
            throw new ArraySizeException("Введено неверное количество параметров");
        }

        String surname = array[0];
        String name = array[1];
        String patronymic = array[2];

//        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
//        Date birthdate;
//        try {
//            birthdate = format.parse(array[3]);
//        }catch (ParseException e){
//            throw new ParseException("Неверный формат даты рождения", e.getErrorOffset());
//        }

//        int phone;
//        try {
//            phone = Integer.parseInt(array[4]);
//        }catch (NumberFormatException e){
//            throw new NumberFormatException("Неверный формат телефона");
//        }

//        String sex = array[5];
//        if (!sex.equalsIgnoreCase("m") && !sex.equalsIgnoreCase("f")){
//            throw new RuntimeException("Неверно введен пол");
//        }

        String fileName = "C:\\Users\\Dmitriy\\Desktop\\ForHW\\" + surname.toLowerCase() + ".txt";
        File file = new File(fileName);
        try (FileWriter fileWriter = new FileWriter(file, true)){
            if (file.length() > 0){
                fileWriter.write('\n');
            }
            fileWriter.write(String.format("%s %s %s %s %s %s", surname, name, patronymic, format.format(birthdate),
                    phone, sex));
        }catch (IOException e){
            throw new FileSystemException("Возникла ошибка при работе с файлом");
        }

    }
}


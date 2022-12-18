package lesson_15.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task_02 {

//    Задача 2
//    Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
//    Нужно сделать так, чтобы программа вводила с клавиатуры пары (число и строку) и сохраняла их в HashMap.
//
//    Ключевые требования:
//    Пустая строка - конец ввода данных.
//    Числа могут повторяться.
//    Строки всегда уникальны.
//    Введенные данные не должны потеряться!
//    Затем программа должна выводить содержание HashMap на экран.
//    Каждую пару - с новой строки.

    public static void main(String[] args) throws IOException {
        String strInput = " :) ";
        String strKey = "";
        Integer intValue = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Integer> hmPairs = new HashMap<>();

        while (true) {
            strInput = reader.readLine();
            // сначала вводим значение с проверкой на Int
            if (!strInput.trim().equals("")) {
                try {
                    intValue = Integer.parseInt(strInput);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            } else break;

            // ..а потом только ключ :)
            strInput = reader.readLine();
            if (!strInput.trim().equals("")) {
                strKey = strInput;
            } else break;

            // если всё хорошо - добавляем пару в мап
            hmPairs.put(strKey,intValue);
        }

        // вывод тоже разворачиваем: <Значение> <Ключ>
        for (Map.Entry<String,Integer> entry: hmPairs.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }


    }
}

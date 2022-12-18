package lesson_15.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Task_01alt {
//    Задача 1 (альтернативное решение без словаря)
//    Введи с клавиатуры 10 строчек и посчитай в них количество различных букв без учета регистра.
//    Результат выведи на экран в алфавитном порядке.

    public static void main(String[] args) throws IOException {

        Character chr;  // текущий символ
        String[] arrInputStr = new String[10];  // строки для ввода
        TreeMap<Character,Integer> tmCharCount = new TreeMap<>();  // мап для списка символов
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // для каждой строки..
        for (int i = 0; i < arrInputStr.length; i++) {
            System.out.print("Введите "+(i+1)+"ю строку: ");
            arrInputStr[i] = reader.readLine();

            // ..проверяем каждый символ (в нижнем регистре)..
            for (int j = 0; j < arrInputStr[i].length(); j++) {
                chr = arrInputStr[i].toLowerCase().charAt(j);

                // проверка символа на вхождение в мап
                if (tmCharCount.containsKey(chr)) {
                    tmCharCount.put(chr, tmCharCount.get(chr)+1);
                } else {
                    tmCharCount.put(chr,1);
                }
            }
        }

        System.out.println("Результат: ");
        // вывод результата
        for (Map.Entry<Character,Integer> entry: tmCharCount.entrySet()) {
            System.out.println(entry.getKey() + " " +entry.getValue());
        }

    }

}

package lesson_05.homework.optional;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_01 {
//    Массивы + String
//    Задача 1.
//    Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
//    Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.
//
//    Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
//    Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
//    Программа выводит слова на экран.

    public static void main(String[] args) {
        String inputStr = "";
        String[] arrStr = new String[25];
        Scanner input = new Scanner(System.in);
        byte i = 0;

        do {
            inputStr = input.nextLine();
            arrStr[i] = inputStr;
            i++;
        } while ((!inputStr.trim().isEmpty()) && (i < arrStr.length));

        for (int j = 0; j < i; j++) {
            arrStr[j] = arrStr[j].toUpperCase();
            if (arrStr[j].length() % 2 == 0) {
                arrStr[j] = arrStr[j] + arrStr[j];
            } else {
                arrStr[j] = arrStr[j] + arrStr[j] + arrStr[j];
            }

            System.out.println(arrStr[j]);
        }

    }
}

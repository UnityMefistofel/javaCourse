package lesson_05.homework.optional;

import java.util.Scanner;

public class Task_05 {
//    Массивы + String
//    Задание 5.
//      1. Считать 6 строк и заполнить ими массив strings.
//      2. Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").

    public static void main(String[] args) {
        String[] arrStr = new String[6];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arrStr.length; i++) {
            arrStr[i] = input.nextLine();
        }

        for (int i = 0; i < arrStr.length-1; i++) {
            for (int j = i+1; j < arrStr.length; j++) {
                if ( arrStr[i] != null && arrStr[i].equals(arrStr[j]) ) {
                    arrStr[j] = null;
                }
            }
        }

        for (int i = 0; i < arrStr.length; i++) {
            System.out.println(arrStr[i]);
        }

    }
}

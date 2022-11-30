package lesson_05.homework.optional;

import java.util.Scanner;

public class Task_02 {
//    Массивы + String
//    Задача 2.
//    Ввести 5 строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.

    public static void main(String[] args) {
        String[] arrStr = new String[5];
        Scanner input = new Scanner(System.in);
        int maxL = 0;
        int maxI = 0;
        int minL = 0;
        int minI = 0;
        int l;

        for (int i = 0; i < arrStr.length; i++) {
            arrStr[i] = input.nextLine();
            l = arrStr[i].length();
            if ((l < minL) || (i == 0)) {
              minL = l;
              minI = i;
            }
            if ((l > maxL) || (i == 0)) {
                maxL = l;
                maxI = i;
            }
        }

        System.out.println("Самая короткая строка: ");
        System.out.println(arrStr[minI]+"("+minL+")");
        System.out.println("Самая длинная строка: ");
        System.out.println(arrStr[maxI]+"("+maxL+")");
    }

}

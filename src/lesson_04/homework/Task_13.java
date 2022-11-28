package lesson_04.homework;

import java.util.Scanner;

public class Task_13 {
//    Массивы
//    Задаиие 7.
//    Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
    public static void main(String[] args) {
        int[] arrInt = new int[20];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arrInt.length; i++) {
            System.out.print("Введите " + (i + 1) + "е число: ");
            arrInt[i] = input.nextInt();
        }

        for (int i = arrInt.length-1; i >= 0; i--) {
            System.out.print(arrInt[i] + " ");
        }
    }
}

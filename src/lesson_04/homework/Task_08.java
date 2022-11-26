package lesson_04.homework;

import java.util.Scanner;

public class Task_08 {
//    Массивы
//    Задание 2:
//      1.1. Создай массив на 10 чисел
//      1.2. Считай с консоли 10 чисел и заполни ими массив
//      2. Найти максимальное число из элементов массива

    public Task_08() {}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrInt = new int[10];
        int maxInt = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Введите "+(i+1)+"е число: ");
            arrInt[i] = input.nextInt();

            if ((i == 0) || (arrInt[i] > maxInt)) {
                maxInt = arrInt[i];
            }
        }

        System.out.print("Максимальное число: "+maxInt);
    }
}

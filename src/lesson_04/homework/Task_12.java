package lesson_04.homework;

import java.util.Scanner;

public class Task_12 {
//    Массивы
//    Задание 6.
//    здать массив на 20 чисел.
//    Заполнить его числами с клавиатуры.
//    Найти максимальное и минимальное числа в массиве.
//    Вывести на экран максимальное и минимальное числа через пробел.

    public Task_12() {}

    public static void main(String[] args) {
        int minInt = 0;
        int maxInt = 0;
        int[] arrInt = new int[20];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arrInt.length; i++) {
            System.out.print("Введите "+(i+1)+"е число: ");
            arrInt[i] = input.nextInt();

            if ((i == 0) || (arrInt[i] < minInt)) {
                minInt = arrInt[i];
            } else if ((i == 0) || (arrInt[i] > maxInt)) {
                maxInt = arrInt[i];
            }
        }

        System.out.print(maxInt+" "+minInt);
    }

}

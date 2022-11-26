package lesson_04.homework;

import java.util.Scanner;

public class Task_10 {
//    Массивы
//    Задание 4.
//      1. Создать массив на 10 чисел.
//      2. Ввести с клавиатуры 10 чисел и записать их в массив.
//      3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.

    public Task_10() {}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrInt = new int[10];

        for (int i = 0; i < arrInt.length; i++) {
            System.out.print("Введите "+(i+1)+"е целое число: ");
            arrInt[i] = input.nextInt();
        }

        for (int i = arrInt.length-1; i >= 0; i--) {
            System.out.println(arrInt[i]);
        }
    }

}

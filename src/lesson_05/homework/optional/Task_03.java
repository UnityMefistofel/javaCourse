package lesson_05.homework.optional;

import java.util.Scanner;

public class Task_03 {
//    Массивы + String
//    Задача 3.
//      1. Создать массив на 10 строк.
//      2. Ввести с клавиатуры 8 строк и сохранить их в массив.
//      3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arrStr = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Введите "+(i+1)+"ю строку: ");
            arrStr[i] = input.nextLine();
        }

        for (int i = arrStr.length-1; i >= 0; i--) {
            System.out.println(arrStr[i]);
        }
    }


}

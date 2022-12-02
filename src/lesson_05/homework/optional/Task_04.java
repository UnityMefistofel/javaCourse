package lesson_05.homework.optional;

import java.util.Scanner;

public class Task_04 {
//    Массивы + String
//    Задание 3.
//      1. Создать массив на 10 строк.
//      2. Создать массив на 10 чисел.
//      3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
//      4. В каждую ячейку массива чисел записать длину строки из массива строк,
//          индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.


    public static void main(String[] args) {

        int intCount = 10;
        int[] arrInt = new int[intCount];
        String[] arrStr = new String[intCount];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < intCount; i++) {
            System.out.print("Введите "+(i+1)+"ю строку: ");
            arrStr[i] = input.nextLine();
            arrInt[i] = arrStr[i].length();
        }

        for (int i = 0; i < intCount; i++) {
            System.out.println(arrInt[i]);
        }
    }
}

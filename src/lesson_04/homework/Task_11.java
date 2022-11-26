package lesson_04.homework;

import java.util.Scanner;

public class Task_11 {
//    Массивы
//    Задание 5.
//      1. Создать массив на 20 чисел.
//      2. Ввести в него значения с клавиатуры.
//      3. Создать два массива на 10 чисел каждый.
//      4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
//      5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.

    public Task_11() {}

    public static void main(String[] args) {
        int[] arrIntMain = new int[20];
        int[] arrIntFirst = new int[10];
        int[] arrIntSecond = new int[10];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arrIntMain.length; i++) {
            System.out.print("Введите "+(i+1)+"е число: ");
            arrIntMain[i] = input.nextInt();
        }

        System.arraycopy(arrIntMain,0,arrIntFirst,0,10);
        System.arraycopy(arrIntMain,10,arrIntSecond,0,10);

        for (int i = 0; i < arrIntSecond.length; i++) {
            System.out.println(arrIntSecond[i]);
        }


    }
}

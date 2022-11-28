package lesson_10.homework;

import lesson_10.homework.misc.ArrayListExt;

import java.util.Scanner;
import java.util.TreeSet;

public class Task_05 {

//     Коллекциия ч.2
//     Задание 4.
//       1. Введи с клавиатуры 10 слов в список строк.
//       2. Определить, является ли список упорядоченным по возрастанию длины строки.
//       3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.

    Task_05() {}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayListExt<String> arrStrExt = new ArrayListExt<>();

        for (int i = 0; i < 10; i++) {
            arrStrExt.add(input.nextLine());
        }

        int errInd = arrStrExt.orderlengthcheck();
        if ( errInd >=0 ){
            System.out.println(errInd);
        } else {
            System.out.println("Кажется.. всё хорошо :)");
        }
    }
}

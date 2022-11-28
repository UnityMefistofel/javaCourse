package lesson_04.homework;

import java.util.Scanner;

public class Task_04 {
    // Циклы
    // Задание 4: Вводить с клавиатуры числа.
    //   Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
    //   -1 должно учитываться в сумме.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int summ = 0; // сумма чисел
        int number;   // последнее введенное число

        do {
            System.out.print("Введите целое число: ");
            number = input.nextInt();
            summ = number +summ;
        } while (number != -1);

        System.out.print(summ);
    }
}

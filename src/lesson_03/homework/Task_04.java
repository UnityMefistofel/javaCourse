package lesson_03.homework;

import java.util.Scanner;

public class Task_04 {
//    Написать программу, которая будет проверять число, которое мы подадим ей.
//    Если число положительное, то увеличить его в два раза.
//    Если число отрицательное, то прибавить единицу.
//    Если введенное число равно нулю, необходимо вывести ноль.
//    Вывести результат в консоль.

    public Task_04() {}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");

        int number = Integer.parseInt(input.nextLine());
        int result;

        if (number >0) {
            result = number *2;
        } else if (number <0) {
            result = number +1;
        } else {
            result = 0;
        }
        System.out.println(result);
    }

}

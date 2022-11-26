package lesson_04.homework;

import java.util.Scanner;

public class Task_01 {
//    Циклы
//    Задание1: Ввести с клавиатуры два числа m и n.
//    Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
    public Task_01() {}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число m: ");
        byte m = Byte.parseByte(input.nextLine()); // кол-во строк
        System.out.print("Введите число n: ");
        byte n = Byte.parseByte(input.nextLine()); // кол-во символов
        String result = "";

        for (byte i = 0; i < m; i++) {
            for (byte j = 0; j < n; j++) {
                result = result + "8";
            }
            result = result + "\n";
        }

        System.out.print(result);
    }
}

package lesson_04.homework;

import java.util.Scanner;

public class Task_06 {
    // Циклы
    // Задание 6: Ввести с клавиатуры строку name.
    //  Ввести с клавиатуры дату рождения (три числа): y, m, d.
    //  Вывести на экран текст:
    //  "Меня зовут name.
    //  Я родился d.m.y"
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите 'name': ");
        String name = input.nextLine();
        System.out.print("Введите 'y': ");
        String y = input.nextLine();
        System.out.print("Введите 'm': ");
        String m = input.nextLine();
        System.out.print("Введите 'd': ");
        String d = input.nextLine();

        System.out.print(
                "Меня зовут "+name+".\nЯ родился "+d+"."+m+"."+y
        );
    }
}

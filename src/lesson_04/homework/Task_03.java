package lesson_04.homework;

import java.util.*;

public class Task_03 {
//    Циклы
//    Задание 3: Ввести с клавиатуры три числа, вывести на экран среднее из них.
//    Т.е. не самое большое и не самое маленькое.
//    Если все числа равны, вывести любое из них.

    public Task_03() {}

    public static void main(String[] args) {
        int[] array = new int[3];

        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        array[0] = input.nextInt();
        System.out.print("Введите второе число: ");
        array[1] = input.nextInt();
        System.out.print("Введите третье число: ");
        array[2] = input.nextInt();

        Arrays.sort(array);

        System.out.print("Среднее число: "+array[1]);
    }

}

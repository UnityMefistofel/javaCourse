package lesson_03.homework;

import java.util.Scanner;

public class Task_01 {
//    1.Объявить три переменных (a, b, c) - стороны предполагаемого треугольника.
//    Определить возможность существования треугольника по сторонам.
//    Результат вывести на экран в следующем виде:
//            "Треугольник существует." - если треугольник с такими сторонами существует.
//            "Треугольник не существует." - если треугольник с такими сторонами не существует.
//            Подсказка:
//    Треугольник существует только тогда, когда сумма двух его сторон больше третьей.
//    Требуется сравнить каждую сторону с суммой двух других.
//    Если хотя бы в одном случае сторона окажется больше либо равна сумме двух других,
//    то треугольника с такими сторонами не существует.

    public Task_01() {
    }

    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner input = new Scanner(System.in);
        System.out.print("Введите длину стороны a: ");
        a = Integer.parseInt(input.next());
        System.out.print("Введите длину стороны b: ");
        b = Integer.parseInt(input.next());
        System.out.print("Введите длину стороны c: ");
        c = Integer.parseInt(input.next());

        boolean badResult = (a > b+c) || (b > a+c) || (c > a+b);
        String message = !badResult ?
                         "Треугольник существует." :
                         "Треугольник не существует.";
        System.out.println(message);
    }
}
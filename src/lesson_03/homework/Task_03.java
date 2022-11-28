package lesson_03.homework;

import java.util.Scanner;

public class Task_03 {
//    Написать программу, которая, в зависимости от того числа, которое мы ей подадим (год)
//, будет определять количество дней в году. Результат вывести на экран в следующем виде:
//    количество дней в этом году: x
//, где
//    х - 366 для високосного года,
//    х - 365 для обычного года.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите год: ");

        int year = Integer.parseInt(input.nextLine());
        int result;

        if (year%400 == 0) {
            result = 366;
        } else if (year%100 == 0) {
            result = 365;
        } else if (year%4 == 0) {
            result = 366;
        } else result = 365;

        System.out.println("количество дней в этом году: "+result);
    }
}

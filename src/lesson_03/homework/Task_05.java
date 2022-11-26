package lesson_03.homework;
import java.util.Scanner;

public class Task_05 {

    public Task_05() {}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");

        String monthStr;

        int monthNum = Integer.parseInt(input.nextLine());
        switch (monthNum) {
            case 1,2,12 -> monthStr = "зима";
            case 3,4,5 -> monthStr = "весна";
            case 6,7,8 -> monthStr = "лето";
            case 9,10,11 -> monthStr = "осень";
            default -> monthStr = "некорректный номер месяца";
        }

        System.out.println(monthStr);
    }
}

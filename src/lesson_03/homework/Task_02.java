package lesson_03.homework;
import java.util.Scanner;

public class Task_02 {
//    Работа светофора для пешеходов запрограммирована следующим образом:
//    в начале каждого часа в течение трех минут горит зелёный сигнал,
//    затем в течение одной минуты - жёлтый,
//    а потом в течение одной минуты - красный,
//    затем опять зелёный горит три минуты и т. д.
//    Подать программе вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
//    Определить, сигнал какого цвета горит для пешеходов в этот момент.
//    Результат вывести на экран в следующем виде:
//          "зелёный" - если горит зелёный цвет,
//          "жёлтый" - если горит жёлтый цвет,
//          "красный" - если горит красный цвет.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите число с начала часа: ");
        double minutes = Double.parseDouble(input.nextLine());

        double cyclePart = minutes%5;
        String result;

        if (cyclePart >=0 & cyclePart <3) {
            result = "зеленый";
        } else if (cyclePart >=3 & cyclePart <4) {
            result = "желтый";
        } else {
            result = "красный";
        }

        System.out.println("На светофоре горит "+ result);

    }

}

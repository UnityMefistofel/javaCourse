package lesson_02.homework;

public class Task_01 {
//    Задача 1. Дано: Хитрый бухгалтер разделил 5 рублей на 2 кассы. Сколько рублей лежит в каждой кассе?
//    Вывести на консоль
    public static void main(String[] args) {
        int totalSum = 5;
        int kassCount = 2;
        System.out.println("В каждую кассу он поровну разложил " + totalSum / kassCount + " руб");
        if ((totalSum % kassCount) !=0) {
            System.out.println("Остаток в виде "+totalSum % kassCount+" руб... \"потерялся\"");
        }
    }
}

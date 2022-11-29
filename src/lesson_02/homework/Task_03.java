package lesson_02.homework;

public class Task_03 {
//    Задача 3. Дано: Голодный Вася съедает за 9 минут 3 банана, а сытый за 15 минут,
//    насколько быстрее голодный Вася съедает один банан?
//    Вывести на консоль
    public static void main(String[] args) {
        int totalTimeHung = 9; // hungry state
        int totalTimeWF = 15;  // well-feed state
        int bananaCount = 3;

        double forOneTimeHung = (double) totalTimeHung / bananaCount;
        double forOneTimeWF = (double) totalTimeWF / bananaCount;

        System.out.println("Разница по времени составляет "+ (forOneTimeWF - forOneTimeHung) +" мин");

    }
}

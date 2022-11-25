package lesson_02.homework;
import java.math.*;

public class Task_03 {
//    Задача 3. Дано: Голодный Вася съедает за 9 минут 3 банана, а сытый за 15 минут,
//    насколько быстрее голодный Вася съедает один банан?
//    Вывести на консоль

    public Task_03() {
    }

    public static void main(String[] args) {
        int totalTimeHung = 9; // hungry state
        int totalTimeWF = 20;  // well-feed state
        int bananaCount = 3;
        String resString = "";

        double forOneTimeHung = (double) totalTimeHung / bananaCount;
        double forOneTimeWF = (double) totalTimeWF / bananaCount;

        if ((forOneTimeHung - forOneTimeWF)%1 !=0 ) {
            long diffTime = -Math.round(forOneTimeHung - forOneTimeWF);
            resString = "примерно "+diffTime;
        } else {
            resString = Double.toString(- (forOneTimeHung - forOneTimeWF));
        }
        System.out.println("Разница по времени составляет "+resString+" мин");

    }
}

package lesson_04.homework;

public class Task_05 {
    // Циклы
    // Задание 5: Вывести на экран таблицу умножения 10х10 используя цикл while.
    // Числа разделить пробелом.

    public Task_05() {}

    public static void main(String[] args) {
        byte x = 1;
        byte y;
        String result = "";

        while (x < 11) {
            y = 1;
            while (y < 11) {
                result = result + (x*y) + " ";
                y++;
            }
            result = result + "\n";
            x++;
        }

        System.out.print(result);
    }
}

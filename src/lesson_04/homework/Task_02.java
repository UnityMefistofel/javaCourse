package lesson_04.homework;

public class Task_02 {
//    Циклы
//    Задание 2: Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.

    public Task_02() {}

    public static void main(String[] args) {
        String result = "";

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                result = result + "8";
            }
            result = result + "\n";
        }

        System.out.print(result);
    }
}

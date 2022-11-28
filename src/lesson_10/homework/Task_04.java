package lesson_10.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_04 {

    // Коллекциия ч.2
    // Задание 4.
    //   1. Введи с клавиатуры 10 слов в список строк.
    //   2. Метод doubleValues должен удваивать слова по принципу:
    //      "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
    //   3. Выведи результат на экран, каждое значение с новой строки.

    public Task_04() {}

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i=i+2) {
            list.add(i+1,list.get(i));
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> arrStr = new ArrayList<>();
        String tmpStr = "";

        do {
            tmpStr = input.nextLine();
            if (!tmpStr.trim().equals("")) {
                arrStr.add(tmpStr);
            }
        } while (!tmpStr.trim().equals(""));

        if (arrStr.size() > 0) {
            arrStr = doubleValues(arrStr);
            for (String str:arrStr) {
                System.out.println(str);
            }
        }

    }

}

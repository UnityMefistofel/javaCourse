package lesson_10.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_01 {
//    Коллекции ч.2
//    Задание 1.
//    Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
    public static void main(String[] args) {
        ArrayList<String> arrLst = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            arrLst.add(input.nextLine());
        }

        arrLst.remove(2);

        for (int i = arrLst.size()-1; i >= 0; i--) {
            System.out.println(arrLst.get(i));
        }

    }
}

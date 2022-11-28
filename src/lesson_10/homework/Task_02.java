package lesson_10.homework;

import java.util.ArrayList;

public class Task_02 {
//    Коллекции ч.2
//    Задание 2.
//        1. Создай список из слов "мама", "мыла", "раму".
//        2. После каждого слова вставь в список строку, содержащую слово "именно".
//        3. Вывести результат на экран, каждый элемент списка с новой строки.
    public static void main(String[] args) {
        ArrayList<String> arrLst = new ArrayList<>();
        final String suff = "именно";

        arrLst.add("мама");
        arrLst.add("мыла");
        arrLst.add("раму");

        for (int i = 0; i< arrLst.size(); i=i+2) {
            arrLst.add(i+1, suff);
        }

        System.out.println(arrLst);

    }
}

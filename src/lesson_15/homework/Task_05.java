package lesson_15.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task_05 {
//    Задача 5
//    Пользователь вводит с клавиатуры список слов (и чисел).
//    Слова вывести в возрастающем порядке, числа - в убывающем.

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> lstInput = new ArrayList<>();
        List<String> lstStrings = new ArrayList<>();
        List<Integer> lstIntegers = new ArrayList<>();
        String strInput = "";

        while (true) {
            strInput = reader.readLine();
            if (strInput.trim().equals("")) break;
            lstInput.add(strInput.trim());
        }

        // вспомогательный массив для хранения порядка чисел/строк
        boolean[] arrIsIntType = new boolean[lstInput.size()];

        // раскладываем строки на два списка (числовой и строковый)
        for (String elem : lstInput) {
            if (isNumeric(elem)) {
                lstIntegers.add(Integer.parseInt(elem));
            } else {
                lstStrings.add(elem);
            }
            arrIsIntType[lstInput.indexOf(elem)] = isNumeric(elem);
        }

        // получаем новые списки через сортировку в потоке
        List<Integer> lstSortInt = lstIntegers.stream().sorted(Comparator.reverseOrder()).toList();
        List<String> lstSortStr = lstStrings.stream().sorted().toList();

        // вспомогательные курсоры для вывода текущего элемента каждого списка
        int idxInt = 0;
        int idxStr = 0;

        // вывод результата в консоль
        for (int i = 0; i < arrIsIntType.length; i++) {
            if (arrIsIntType[i]) {
                System.out.println(lstSortInt.get(idxInt++));
            } else {
                System.out.println(lstSortStr.get(idxStr++));
            }
        }

    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }
}

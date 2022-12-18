package lesson_15.homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Task_01 {
//    Задача 1
//    Введи с клавиатуры 10 строчек и посчитай в них количество различных букв без учета регистра.
//    Результат выведи на экран в алфавитном порядке.

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }

        // решение
        Character chr;
        Map<Character,Integer> tmCharCount = new LinkedHashMap<>();
        alphabet.forEach(elem -> tmCharCount.put(elem.charValue(),0));

        for (String tmpString: list) {
            for (int i = 0; i < tmpString.length(); i++) {
                chr = tmpString.charAt(i);
                if (tmCharCount.containsKey(chr)) {
                    tmCharCount.put(chr, tmCharCount.get(chr)+1);
                }
            }
        }

        for (Map.Entry<Character,Integer> entry: tmCharCount.entrySet()) {
            System.out.println(entry.getKey() + " " +entry.getValue());
        }
    }
}

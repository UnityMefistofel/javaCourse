package lesson_10.homework;

import java.util.ArrayList;

public class Task_03 {

    // Коллекциия ч.2
    // Задание 3.
    //   1. Создай список слов, заполни его самостоятельно.
    //   2. Метод fix должен:
    //   2.1. удалять из списка строк все слова, содержащие букву "р"
    //   2.2. удваивать все слова содержащие букву "л".
    //   2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
    //   2.4. с другими словами ничего не делать.
    public static ArrayList<String> fix(ArrayList<String> strings) {

        for (int i = 0; i < strings.size(); i++) {
            boolean hasP = false;
            boolean hasL = false;

            String str = strings.get(i); // debug string

            hasP = str.contains("р");
            hasL = str.contains("л");

            if (hasP ^ hasL) {
                if (hasP) {
                    strings.remove(i);
                    i--;
                } else {
                    strings.set(i,str+str);
                }
            }
        }

        return strings;
    }

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings.add("коза");
        strings.add("алмаз");
        strings.add("привет");
        strings.add("колокол");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
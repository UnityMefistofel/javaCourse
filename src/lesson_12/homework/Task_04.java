package lesson_12.homework;

import java.util.HashMap;
import java.util.Map;

public class Task_04 {
//    HashMap
//    Задание 4.
//      Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк
//      Вывести содержимое коллекции на экран, каждый элемент с новой строки.
//         Пример вывода (тут показана только одна строка):
//            картофель - клубень


    public static void main(String[] args) {
        HashMap<String,String> hmPairs = new HashMap<>();

        hmPairs.put("арбуз","ягода");
        hmPairs.put("банан","трава");
        hmPairs.put("вишня","ягода");
        hmPairs.put("груша","фрукт");
        hmPairs.put("дыня","овощ");
        hmPairs.put("ежевика","куст");
        hmPairs.put("жень-шень","корень");
        hmPairs.put("земляника","ягода");
        hmPairs.put("ирис","цветок");
        hmPairs.put("картофель","клубень");

        for (Map.Entry<String,String> pair : hmPairs.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

}

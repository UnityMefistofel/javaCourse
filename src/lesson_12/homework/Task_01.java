package lesson_12.homework;

import java.util.HashMap;
import java.util.Map;

public class Task_01 {
//    HashMap
//    Задание 1.
//      1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
//      2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
//      3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
//      4. Вывести содержимое Map на экран.

    public static void main(String[] args) {
        HashMap<String,String> hmPeople = new HashMap<>();

        hmPeople.put("Нестеров","Пётр");
        hmPeople.put("Семенов","Виктор");
        hmPeople.put("Иванов","Александр");
        hmPeople.put("Лаптев","Сергей");
        hmPeople.put("Ревин","Михаил");
        hmPeople.put("Войтов","Алексей");
        hmPeople.put("Семенов","Андрей"); // переопределение ключа
        hmPeople.put("Щукин","Сергей");
        hmPeople.put("Еременко","Олег");
        hmPeople.put("Назаренко","Илья");

        for (Map.Entry<String,String> elem : hmPeople.entrySet()) {
            System.out.println(""+ elem.getKey()+" "+elem.getValue());
        }


    }

}

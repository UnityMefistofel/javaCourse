package lesson_12.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;

public class Task_03 {
//    HashMap
//    Задание 3.
//      Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
//      Новая задача: Программа должна работать не с номерами домов, а с городами:

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, String> map = new HashMap<>();

        System.out.println("- Заполнение справочника -");
        while (true) {
            System.out.print("Введите название города: ");
            String city = getString(reader);
            if (city.isEmpty()) {
                break;
            }

            System.out.print("Введите фамилию жителя: ");
            String family = getString(reader);

            map.put(city, family);
        }

        System.out.println("\n-Поиск значения по ключу -");
        System.out.print("Введите ключ: ");
        String city = getString(reader);

        if (map.containsKey(city)) {
            String familyName = map.get(city);
            System.out.println("Значение: " + familyName);
        }
    }

    public static String getString(BufferedReader reader) {

        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }


}

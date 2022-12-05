package lesson_12.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Task_03 {
//    HashMap
//    Задание 3.
//      Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
//      Новая задача: Программа должна работать не с номерами домов, а с городами:

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, String> map = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            String family = reader.readLine();

            map.put(city, family);
        }

        String city = reader.readLine();

        if (map.containsKey(city)) {
            String familyName = map.get(city);
            System.out.println(familyName);
        }
    }


}

package lesson_12.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Month;
import java.util.HashMap;

public class Task_02 {
//    HashMap
//    Задание 2.
//      Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
//      Используй коллекции.

    public static void main(String[] args) {
        HashMap<Integer,String> hmMonth = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 1; i < 13; i++) {
            hmMonth.put(i,Month.of(i).toString()); // да, я поленился расписывать каждый месяц отдельно :)
        }

        try {
            System.out.print("Enter the month number: ");
            int input = Integer.parseInt(reader.readLine());
            if (hmMonth.containsKey(input)) {
                System.out.println(hmMonth.get(input) + " is the " + input + " month");
            } else {
                System.out.println("The number is out of the range of allowed values");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

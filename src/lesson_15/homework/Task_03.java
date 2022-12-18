package lesson_15.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task_03 {
//    Задача 3.
//    Введи с клавиатуры 30 чисел. Выведи 10-е и 11-е минимальные числа.
//            Пояснение:
//    Самое минимальное число - 1-е минимальное.
//    Следующее минимальное после него - 2-е минимальное.

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer[] arrMain = new Integer[30];
        String strInput = "";

        for (int i = 0; i < arrMain.length; i++) {
            strInput = reader.readLine();
            if (!strInput.trim().equals("")) {
                try {
                    int intValue = Integer.parseInt(strInput);
                    arrMain[i] = intValue;
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    break;
                }
            } else break;
        }

//        fillArray(arrMain);
        customSort(arrMain);

//        for (int i = 0; i < arrMain.length; i++) {
//            if (arrMain[i] == null) break;
//            System.out.print(arrMain[i]+ " ");
//        }

        System.out.print(arrMain[9] + " " + arrMain[10]);

    }

    // профилактика склероза :)
    public static void customSort(Integer[] arrayInt) {
        int num;
        
        for (int i = 0; i < arrayInt.length-1; i++) {
            if (arrayInt[i] == null) break;
            for (int j = i; j < arrayInt.length; j++) {
                if (arrayInt[j] == null) break;
                if (arrayInt[i] > arrayInt[j]) {
                    num = arrayInt[i];
                    arrayInt[i] = arrayInt[j];
                    arrayInt[j] = num;
                }
            }
        }
    }

//    public static void fillArray(Integer[] arrayInt) {
//        Random rand = new Random();
//        for (int i = 0; i < arrayInt.length; i++) {
//            arrayInt[i] = rand.nextInt(99);
//        }
//    }


}

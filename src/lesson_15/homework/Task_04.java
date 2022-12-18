package lesson_15.homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task_04 {
//    Задание 4
//    Написать программу, которая вводит с клавиатуры строку текста.
//    Программа должна вывести на экран две строки:
//      1. первая строка содержит только гласные буквы из введённой строки.
//      2. вторая - только согласные буквы и знаки препинания из введённой строки.
//      Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        final char WHITESPACE = '\u0020';
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strVowelLetters = "";
        String strConsonantLetters = "";

        String strInput = reader.readLine();
        char chr;

        for (int i = 0; i < strInput.length(); i++) {
            chr = strInput.charAt(i);
            if (chr == WHITESPACE) continue; // выкидываем пробел
            if (isVowel(chr)) {
                strVowelLetters = strVowelLetters + chr + WHITESPACE;
            } else {
                strConsonantLetters = strConsonantLetters + chr + WHITESPACE;
            }
        }

        System.out.println(strVowelLetters);
        System.out.println(strConsonantLetters);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character); // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) { // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}

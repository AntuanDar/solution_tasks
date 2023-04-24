package ru.spb.taranenkoant.solution.tasks.strings;

import java.util.Scanner;

public class Caps {
    public static String getSentence(String phrase) {
        String input = "this is test sentence with lot of words";//наша строчка
        String output = "";//все слова с заглавной буквы.
        String[] words = input.split(" ");//разделяем на массив из слов
        for (String word : words) {
            String first = word.substring(0, 1).toUpperCase();
            String all = word.substring(1);
            output += first + all;
        }

        return input;
    }
}


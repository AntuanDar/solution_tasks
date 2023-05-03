package ru.spb.taranenkoant.solution.tasks.strings;

/**
 * Класс должен называться CountString
 *
 * Count_String - snake case используется только для констант, например
 *
 * private final static String DEFAULT_TEXT = "константы пишутся обычно final static (могут быть не static) и всегда заглавными буквами";
 * */

// Посчитать количество строк в тексте
/**public class CountString {

    public static <Count_String> void main(String[] args) {
        String day = "День и ночь а делаю домашку";
        String[] day = str.split(" ");


        //int chCount = 0;
        for (int i = 0; i < day.length(); i++) {
            i++;
            System.out.println("К-во строк: " + i);
        }

        /**
         * Вроде колчество строк надо посчитать по заданию, но этот класс делает что-то не то
         * Сначала ты берешь длину строки (общее количество символов) а потом просто делаешь столько итераций сколько символов
         * получилось
         * */

import java.util.Arrays;

/**
 * это что-то левое кажется
 * */
//import static jdk.internal.org.jline.utils.InfoCmp.Capability.lines;

/**
        Count_String count_string = new Count_String();
        int lines = count_string.clone();
        System.out.println(lines);
    }
    * */


public class CountString {
    public static void main(String[] args) {
        // String str = "День и ночь а делаю домашку";
        String str = "День и ночь а делаю домашку";

        /**
         * Метод нашел правильный, но \s по regex это пробел
         * получается ты разделил строку на слова и посчитал их количество
         * а если мы хотим найти строки нам нужна регулярка на перенос строки
         * и тут подвох перенос строки в unix и винде отличаются
         * надо учесть оба варианта переноса строк
         * */

        String[] words = str.split("\\s"); //splits the string based on whitespace
        System.out.println("Количество строк " + (words.length));
    }
}



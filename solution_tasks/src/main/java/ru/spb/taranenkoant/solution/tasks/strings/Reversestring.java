package ru.spb.taranenkoant.solution.tasks.strings;

//Развернуть строку
//Наверное надо было строку через input передать но я пока тренируюсь так

// Реверс строки доработан 17.04.2023
public class Reversestring {
    public static void main(String  [] args) {

        String day = "    День и ночь а делаю домашку     ";
        new StringBuilder(day).reverse().toString();
        String result = new StringBuffer(day).reverse().toString();

        System.out.println(result);

    }

}



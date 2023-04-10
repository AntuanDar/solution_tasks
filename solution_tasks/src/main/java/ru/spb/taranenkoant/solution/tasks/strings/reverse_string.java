package ru.spb.taranenkoant.solution.tasks.strings;

//Развернуть строку
//Наверное надо было строку через input передать но я пока тренируюсь так

public class reverse_string {
    public static void main(String  [] args) {

        String day = "День и ночь а делаю домашку";
        new StringBuilder(day).reverse().toString();
        String result = new StringBuffer(day).reverse().toString();

        //boolean String;
        System.out.println(result);

    }

}



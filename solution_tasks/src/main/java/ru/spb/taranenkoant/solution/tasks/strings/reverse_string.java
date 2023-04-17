package ru.spb.taranenkoant.solution.tasks.strings;

//Развернуть строку
//Наверное надо было строку через input передать но я пока тренируюсь так

public class reverse_string {
    public static void main(String  [] args) {

        String day = "    День и ночь а делаю домашку     ";
        new StringBuilder(day).reverse().toString();
        String result = new StringBuffer(day).reverse().toString();

        /**
         * что значит  //boolean String;
         * */
        //boolean String;
        System.out.println(result);

    }

    /**
     * Вроде работает правильно только название исправить надо с заглавной буквы и без снейк-кейса
     * */
}



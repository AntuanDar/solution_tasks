package ru.spb.taranenkoant.solution.tasks.strings;

//Развернуть строку
//Наверное надо было строку через input передать но я пока тренируюсь так

// Реверс строки доработан 17.04.2023

/**
 * Ну почти, camelCase подразумевает, что каждое новое слово начинается с заглавной буквы ReverseString
 * */
public class Reversestring {
    public static void main(String  [] args) {

        String day = "    День и ночь а делаю домашку     ";
        /**
         * Обрати внимание идея выделяет .toString(); если навести на лампочку курсор, то будет написано, что
         * возвращаемый результат игнорируется и это действительно так
         * new StringBuilder(day).reverse().toString(); - строчка здесь лишняя, только отъедает процессорное время
         * */
        // new StringBuilder(day).reverse().toString();
        String result = new StringBuffer(day).reverse().toString();

        System.out.println(result);

    }

}



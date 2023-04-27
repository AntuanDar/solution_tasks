package ru.spb.taranenkoant.solution.tasks.strings;

import java.util.Scanner;

/**
 * Классы должны ьназываться с Заглавной буквы, когда будешь изучать работу ClassLoader станет понятно почему
 * */

//Скорректировать регистр у ФИО
public class registr {

    /**
     * Чето я не понял
     * задача называется Скорректировать регистр у ФИО
     * Берем ФИО ИВаНОв иВаН ИВАНовиЧ и должно получиться Иванов Иван Иванович
     * почему System.out.print("Введите  число: "); ??
     *
     * и не работает вставит ИВаНОв иВаН ИВАНовиЧ он мне вывел Иванов иван иванович только фамилия с Заглавной буквы
     * здесь так же можно разбить текст на слова в классе String есть метод и потом просто первый символ сделать заглавным
     * */

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите  число: ");
        String str = scan.nextLine();
        scan.close();

        System.out.print("Возвращаемое значение: " + str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase());
       // String Str = null;
       // System.out.println(Str.toLowerCase());
    }
}
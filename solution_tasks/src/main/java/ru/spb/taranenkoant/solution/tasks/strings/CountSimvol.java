package ru.spb.taranenkoant.solution.tasks.strings;
//  К-во символов протатип -пока на символ А
 //используя цикл for, и для каждого встречающегося символа увеличивайте счетчик
 // (начиная с 0), если он совпадает с данным символом.

//Указывай название задачи из списка, чтобы мне легче было ориентироваться, что конкретно я проверяю
/**Кол-во вхождений каждого символа */
import java.util.Scanner;

/** CountSimvol - стараемся избегать опечаток, чтобы потом с ревьюверами не ругаться (CountSymbol) */

/**
 * class CountSimvolф
 * {
 *
 * for (int i = 0; i < str.length(); i++)
 *{                                            - неправильно это стиль C#
 *
 * class CountSimvol {
 *  * for (int i = 0; i < str.length(); i++) {  - правильно это стиль java
 * */
class CountSimvol
{

    // этот метод на уровне пакета, его мы и будем тестировать, он несет в себе основную логику
    int countOccurrences(String str, char ch) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ch) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        //работаем в стиле ООП классы, объекты и т.д.
        CountSimvol countSimvol = new CountSimvol();
        countSimvol.count();
    }
    /**
     * По хорошему надо попросить ввести два слова в консоль
     * 1 вводит строку второй символ который ищем
     * ну и завершать приложение можно по слову exit
     * а не сразу после поиска
     * */
    public void count() {
        Scanner sc = new Scanner(System.in);
        //Вводим предложение в консоль
        System.out.println("Введите слова одной строкой через пробел");
        String input = sc.nextLine();
        //String str = "ABAACBDD";
        char ch = 'A';

        System.out.println(" Результат  " + ch + " символов " + countOccurrences(input, ch) + " times.");
    }
}
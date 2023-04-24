package ru.spb.taranenkoant.solution.tasks.strings;

import java.util.Scanner;
import java.util.List;

/**
 * Created by Anton on 22.03.2023
 * description:
 */

/**
 * Finalized by Sergey on 24.04.2023
 * description:
 */

/**
 * Подсчет к-ва слов в введенном тексте
 */
public class CountWordsSentence {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите любой текст :");

        String input = sc.nextLine();

        int count = 0;

        if (input.length() != 0) {
            count++;

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    count++;
                }
            }
        }

        System.out.println("Вы ввели " + count + " слов");


    }
}
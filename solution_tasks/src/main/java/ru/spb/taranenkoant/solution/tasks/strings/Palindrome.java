package ru.spb.taranenkoant.solution.tasks.strings;

import java.util.Scanner;

//  Проверка на полиндром (не количество)

public class Palindrome{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст");
        // String text = "Madam, I'm Adam!";
        String text = in.nextLine();
        String text1 =text.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String text2 = new StringBuilder(text1).reverse().toString();
        boolean a = text1.equals(text2);

        System.out.println(a);

    }
}
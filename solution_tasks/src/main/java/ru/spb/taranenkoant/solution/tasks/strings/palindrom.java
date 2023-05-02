package ru.spb.taranenkoant.solution.tasks.strings;

import java.util.Scanner;


//Проверка что введенное слово палиндром версия сырая 25.04.2023
//Будет доработана

/**
 * Нейминг
 *
 * Класс рабочий, но чтобы потренироваться можно развернуть слово используя цикл for без отдельного метода
 * */
public class palindrom
{
    public static void main(String[] args) {

        System.out.print("Введите текст : ");
        Scanner in = new Scanner(System.in);

        //Строка без изменений
        String origString = in.nextLine();

        //Строка развернутая
        String reverseString = new StringBuilder(origString).reverse().toString();

        // Проверка на полиндром
        if (origString.equals(reverseString)) {
            System.out.println("Полиндром 1");
        } else {
            System.out.println(" Не полиндром 2");
        }
    }
}
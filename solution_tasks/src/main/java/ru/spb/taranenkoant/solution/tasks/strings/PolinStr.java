package ru.spb.taranenkoant.solution.tasks.strings;

import java.util.Scanner;

public class PolinStr
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
            System.out.println("Полиндром");
        } else {
            System.out.println(" Не полиндром");
        }
    }
}
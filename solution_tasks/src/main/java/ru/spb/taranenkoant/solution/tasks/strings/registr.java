package ru.spb.taranenkoant.solution.tasks.strings;

import java.util.Locale;
import java.util.Scanner;

//Скорректировать регистр у ФИО
public class registr {
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
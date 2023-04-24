package ru.spb.taranenkoant.solution.tasks.strings;

import java.util.Scanner;

public class count_S {
    public static void main(String[] args) {
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите  число: ");
        str = scan.nextLine();
        scan.close();
        //int n = str.length();
        str = str.replaceAll("[^0-9]+", " ");
       // str = str.replaceAll("((0|1\\d{0,2}|2([0-4][0-9]|5[0-5]))\\.){3}(0|1\\d{0,2}|2([0-4][0-9]|5[0-5]))");
        if (str.length() < 0)
            System.out.println("Число отрицательное" + str);
        if (str.length() > 0)
            System.out.println("Число положительное " + str);
        if (str.length()  % 1 == 0)
            System.out.println("Число целое" + str);
        if (str.length()  % 1 != 0)
            System.out.println("Число десятичное" + str);
        int x = Integer.valueOf(str);
    }
}
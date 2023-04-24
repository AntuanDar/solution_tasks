package ru.spb.taranenkoant.solution.tasks.strings;

import java.util.Scanner;

/**
 * Исправил 17.04.2023 разбил текст типа форма регистрации- введите фамилию имя отчество...
 */

//Скорректировать регистр у ФИО
public class Registr {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите  Фамилию : ");
        String fam = scan.nextLine();
        System.out.print("Введите  Имя : ");
        String name = scan.nextLine();
        System.out.print("Введите  Отчество: ");
        String othc = scan.nextLine();


        System.out.print("Возвращаемое значение: " + fam.substring(0, 1).toUpperCase() + fam.substring(1).toLowerCase());
        System.out.print(" " + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase());
        System.out.print(" " + othc.substring(0, 1).toUpperCase() + othc.substring(1).toLowerCase());

    }
}
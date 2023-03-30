package ru.spb.taranenkoant.solution.tasks.others;

import java.util.Scanner;
// Отработка условного оператора

public class iff {
    public static void main(String[] args) {
        // int house = 10;
        System.out.println("Введите к-во этажей: ");
        Scanner sc = new Scanner(System.in);
        int house = sc.nextInt();
        if (house <= 3) {
            System.out.println("Маленький домик");
        } else if (house <= 8) {
            System.out.println("Маленький домик");
        } else if (house >= 10) {
            System.out.println(" Жилой дом");
        }
    }
}
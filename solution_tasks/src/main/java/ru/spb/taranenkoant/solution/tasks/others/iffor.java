package ru.spb.taranenkoant.solution.tasks.others;

import java.util.Scanner;
// Отработка условного оператора
//Есть два числа, которые задаются пользователем через консоль (назовем эти два числа a и b). Используя цикл for, вывести все числа из диапазона между a и b, которые делятся на 5 без остатка, но при этом не делятся на 10 без остатка. Например, число 15 подходит под наше условие (делится на 5 без остатка и не делится на 10 без остатка), но число 20 не подходит под наше условие (делится на 5 без остатка и делится на 10 без остатка). Сами числа a и b в диапазоне не учитывать.
//Если a >= b вывести сообщение "Некорректный ввод".
public class iffor {
    public static void main(String[] args) {
        // int house = 10;
        System.out.println("Введите число а и b: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a >= b) {
            System.out.println("Какая то ошибка");
        } else {
            for (int i = a + 1; i < b; i++) {
                if (i % 5 == 0 && i % 10 != 0) { //делится на 5 без остатка и не делиться на 10
                    System.out.println(i + " ");
                }
            }
        }
    }
}
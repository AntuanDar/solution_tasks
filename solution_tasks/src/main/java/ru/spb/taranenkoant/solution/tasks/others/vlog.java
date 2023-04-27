package ru.spb.taranenkoant.solution.tasks.others;

public class vlog {
    public static void main(String[] args) {

        int weight = 750; // Объявили переменную веса Байта и присвоили ей значение
        if (weight < 800) { // Цикл сработает, только если вес Байта меньше 800 грамм
            for (int i = 1; i < 6; i = i + 1) {
                System.out.println("Байт съел " + i + "-ю морковку");
            }
        } else {
            System.out.println("Разгрузочный день. Пьём водичку, крутим колесо!");
        }
    }
}
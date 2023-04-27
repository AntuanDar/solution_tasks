//Яндекс практикум отработка цикла

package ru.spb.taranenkoant.solution.tasks.others;

public class Praktikum {

    public static void main(String[] args) {
        int money = 500; // Деньги на корм
        int foodPerDay = 100; // Стоимость пачки корма
        int days = 0; // Дни, когда вы сможете покупать корм

        // Здесь опишите цикл, начинаем с 500 рублей 

        for(int i = money; (i-foodPerDay) >=0; i=i-foodPerDay) {
            // Здесь отразите, что вы будете покупать корм каждые три дня
            days = days + 3;
            // Опишите строку вывода
            System.out.println("На " + days + "-й день останется " +  (i -100) + " рублей");
            // Цикл оканчивается здесь 
        }

        System.out.println("Денег хватит на " + days + " дней.");
    }
}


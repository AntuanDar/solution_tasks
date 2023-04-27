package ru.spb.taranenkoant.solution.tasks.others;

public class vlog2 {
    public static void main(String[] args) {

        int days = 3; // Количество дней, в которые Байт будет тренироваться
        int run = 2; // Число пробежек в день

        for (int i = 1; i <= days; i++) { // Внешний цикл для смены дней
            System.out.println("День " + i);
            for (int j = 1; j <= run; j++) { // Вложенный цикл для пробежек с новой переменной
                System.out.println("  Пробежка " + j);
            }
        }
    }
}
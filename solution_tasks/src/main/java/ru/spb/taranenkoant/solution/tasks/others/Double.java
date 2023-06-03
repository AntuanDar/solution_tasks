package ru.spb.taranenkoant.solution.tasks.others;



//Метод получения квадратного корня числа
public class Double {

    public static double sqrt(double x) throws IllegalAccessException {

        if (x < 0){
            throw new IllegalAccessException("Ожидаемое отрицательное число :" + x);
        }
        return Math.sqrt(x);
    }
}

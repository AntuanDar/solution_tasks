package ru.spb.taranenkoant.solution.tasks.others;


//Используя цикл while, выведите в столбик строки вида “Олимпиада year года”, где year - э
// то число, которое принимает значения, начиная от 1980 до 2020, с шагом увеличения равным 4.
public class Olimp_W
{
    public static void main(String[] args) {
        int i = 1980;
        int b = 2022;
        do {
            System.out.println("Олимпиада " + i);
            //i++;
            i+=4;
        } while (i < b);
    }
}
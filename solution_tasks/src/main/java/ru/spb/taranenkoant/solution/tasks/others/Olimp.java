package ru.spb.taranenkoant.solution.tasks.others;


//Используя цикл for, выведите в столбик строки вида “Олимпиада year года”,
// где year - это число, которое принимает значения, начиная от 1980 до 2020, с шагом увеличения равным 4.
public class Olimp {

    public static void main(String[] args) {

        //String s = ("Java");
        for (int i = 1980; i <= 2020; i+=4) {
            System.out.println("Олимпиада  "+i+" года");
        }
    }
}

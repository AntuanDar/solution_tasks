package ru.spb.taranenkoant.solution.tasks.others;


//Вывести на экран слово “JAVA”, в строку, чтобы оно повторилось 10 раз, используя цикл while.av
public class Java_10
{
    public static void main(String[] args) {
        int i = 0;
        int b = 10;
        do {
            System.out.println("Java");
            i++;
        } while (i < b);
    }
}
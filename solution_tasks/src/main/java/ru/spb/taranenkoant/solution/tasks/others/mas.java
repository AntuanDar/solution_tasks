package ru.spb.taranenkoant.solution.tasks.others;

//import com.sun.java.util.jar.pack.AdaptiveCoding;

import java.util.Random;
import java.util.Scanner;

public class mas {
    public static <AdaptiveCoding> void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();

        Random random = new Random();
        int[] array = new int[0];


        int i1 = 10;
        for (int i = 0; i < arrayLength; i++)
            array[i] = random.nextInt(10);

        AdaptiveCoding Array = null;
        System.out.println(Array.toString());
    }
}

package ru.spb.taranenkoant.solution.tasks.strings;

/**
 * C классом что-то не так, возможно неудачный мердж
 * <p>
 * по классу самому нейминг Randomstring -> RandomString
 * <p>
 * <p>
 * String str = "ddgdgdgehdhsh45fhfhdhs"; - почему именно такой набор символов?
 * Выравнивание StringBuffer sb=new StringBuffer(); -> StringBuffer sb = new StringBuffer();
 * <p>
 * for(int i =0, i<lenght ++){ -> for(int i = 0, i < lenght ++) {
 * <p>
 * for(int i =0, i<lenght ++){ - с этой строкой совсем все плохо
 * откуда взялась переменная lenght, после нее так же нет ; ++ - непонятно к чему относится
 * <p>
 * выравнивание можно поправить по ctrl + alt + L
 */

import java.util.Random;

// Generation to String 11.05.2023
public class Randomstring {
    String getRandomString(int lenght) {
        String str = "ddgdgdgehdhsh45fhfhdhs";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lenght; i++) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();

    }
}

package ru.spb.taranenkoant.solution.tasks.strings;

/**
 * C классом что-то не так, возможно неудачный мердж
 *
 * по классу самому нейминг Randomstring -> RandomString
 *
 *
 * String str = "ddgdgdgehdhsh45fhfhdhs"; - почему именно такой набор символов?
 *  Выравнивание StringBuffer sb=new StringBuffer(); -> StringBuffer sb = new StringBuffer();
 *
 *  for(int i =0, i<lenght ++){ -> for(int i = 0, i < lenght ++) {
 *
 *  for(int i =0, i<lenght ++){ - с этой строкой совсем все плохо
 *  откуда взялась переменная lenght, после нее так же нет ; ++ - непонятно к чему относится
 *
 *  выравнивание можно поправить по ctrl + alt + L
 */

import java.util.Random;

// Generation to String 11.05.2023
public class Randomstring { String getRandomString(int lenght){
    String str = "ddgdgdgehdhsh45fhfhdhs";
    Random random = new Random();
    StringBuffer sb=new StringBuffer();
    for(int i =0, i<lenght ++){
        int number=random.nextline(62);
        sb.append(str.charAt(number));
        }
    return sb.toString();

}

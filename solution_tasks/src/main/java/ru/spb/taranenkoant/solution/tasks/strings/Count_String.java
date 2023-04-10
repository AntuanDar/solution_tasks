package ru.spb.taranenkoant.solution.tasks.strings;


// Посчитать количество строк в тексте
public class Count_String {

    public static void main(String[] args) {
        String day = "День и ночь а делаю домашку";
        // String dayAndNight = day + " " + and + " " + night;
        //System.out.println(day + " " + and + " " + night );

        int chCount = 0;
        for(int i=0; i<day.length(); i++){
            chCount ++;
            System.out.println("К-во строк: " + chCount );
        }
    }
}

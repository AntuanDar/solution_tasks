package ru.spb.taranenkoant.solution.tasks.strings;

/**
 * Класс должен называться CountString
 *
 * Count_String - snake case используется только для констант, например
 *
 * private final static String DEFAULT_TEXT = "константы пишутся обычно final static (могут быть не static) и всегда заглавными буквами";
 * */

// Посчитать количество строк в тексте
public class Count_String {

    public static void main(String[] args) {
        String day = "День и ночь а делаю домашку";
        // String dayAndNight = day + " " + and + " " + night;
        //System.out.println(day + " " + and + " " + night );

        /**
         * Зачем здесь переменная chCount?
         * i - же выполняет функцию счетчика
         * */
        int chCount = 0;
        for(int i = 0; i < day.length(); i++) {
            chCount ++;
            System.out.println("К-во строк: " + chCount);
        }

        /**
         * Вроде колчество строк надо посчитать по заданию, но этот класс делает что-то не то
         * Сначала ты берешь длину строки (общее количество символов) а потом просто делаешь столько итераций сколько символов
         * получилось
         * */

        Count_String count_string = new Count_String();
        int lines = count_string.countLines("Здесь наш текст " +
                "Много строчный " +
                "Строки которого мы и должны посчитать");
        System.out.println(lines);
    }


    public int countLines(String text) {
        /**
         * Напиши решение здесь
         * сначала разбей текст на отдельные строки у класса String есть такой метод найди его
         * Дальше просто считаешь сколько получилось строк
         * */
        return 0;
    }
}

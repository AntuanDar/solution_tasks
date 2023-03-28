//Сгенировать случайную строку заданой длины

package ru.spb.taranenkoant.solution.tasks.strings;// генерация строки заданной длины

import java.nio.charset.Charset;
import java.util.Random;

//Обьявляем класс я его назвал тестинг

/**
 * ЧТО ДОДЕЛАТЬ:
 * 1. длину строки передать через аргументы
 * 2. сделать второй вариант где передать через консоль длину строки
 * тебе понадобится объект, логику вынести из main в метод объекта
 * если аргумента нет, то предлагать ввести через консоль, если есть, то
 * консольный ввод не предлагать
 * в методе мейн только создание объекта и вызов его метода, класс использовать этот, другой создавать не нужно
 * */
class Texting
{
    public static void main(String[] args) {
        byte[] array = new byte[8]; // длина ограничена 8
        new Random().nextBytes(array);  // генерация строчки
        /**
         * StandardCharsets.UTF_8 - лучше юзать стандартный enum - чтобы быть уверенным что на всех jvm будет работать
         * одинаково
         * */
        String generatedString = new String(array, Charset.forName("UTF-8")); // формат строки

        System.out.println(generatedString);
    }
}


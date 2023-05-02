package ru.spb.taranenkoant.solution.tasks.strings;

import java.util.Scanner;
 // Калькулятор на поколдовать на работе 02.05.2023

public class Calculator {

    /**
     * Статические поля класса, которые не изменяются лучше объявлять как private final static Scanner scanner = new Scanner(System.in);
     * private - дает нам инкапсуляцию
     * final - говорит, что объект этот никто не сможет изменить
     * */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.println("Результат операции: "+result);
    }

    /**
     * Неплохо!!!!
     * */
    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }

    /**
     * switch очень архаичная штука лучше избегать его использования
     * https://everychild.ru/reyting/pochemu-switch-case-eto-ploho/
     * но опять таки, правильного ответа нет, это как говорится откуда руки растут
     * */
    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());//рекурсия
        }
        return result;


    }

    /**
     * Все методы у тебя здесь статичные, это называется прогрммирвать на уровне классов, но мы же все таки ООП
     * лучше програмировать на уровне объектов, а на C-подобные штуки лучше не скатываться
     * а то однажды осознаешь что твоя програма это файл с 5тыщами строк и тольо статичными методами
     * */
}
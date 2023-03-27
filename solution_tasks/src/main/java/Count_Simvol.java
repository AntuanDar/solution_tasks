
 //  К-во символов протатип -пока на символ А

import java.util.Scanner;

class Count_Simvol
{
    private static int countOccurrences(String str, char ch) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ch) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //Вводим предложение в консоль
        System.out.println("Введите слова одной строкой через пробел");
        String input = sc.nextLine();
        //String str = "ABAACBDD";
        char ch = 'A';

        System.out.println(" Результат" + ch + " символов " + countOccurrences(input, ch) + " times.");
    }
}
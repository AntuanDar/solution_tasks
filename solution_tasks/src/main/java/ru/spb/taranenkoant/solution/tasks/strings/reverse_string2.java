package ru.spb.taranenkoant.solution.tasks.strings;


// Развернуть слова в предложении
//Последовательность слов не нарушена а слова развернуты
public class reverse_string2 {
    public static void main(String[] args) {
        String str3 = "Сегодня ветер и пыль летит в глаза";
        String[] words = new StringBuilder(str3).reverse().toString().split(" ");
        StringBuilder newStr = new StringBuilder();

        /**
         * Вот так лучше не писать, не читаемо, главное помнить мы пишем код, который могут читать другие люди
         * добавит {} после объявления цикла и плюс ты используешь разное написание, как будто копируешь откудать
         * старайся писать весь код сам, перебивать его руками, даже если используешь чужие наработки
         *
         *
         * сам код вроде работает правильно
         * */
        for (int i = words.length - 1; i >= 0; i--) newStr.append(words[i]).append(" ");
        System.out.println(newStr);
    }

}

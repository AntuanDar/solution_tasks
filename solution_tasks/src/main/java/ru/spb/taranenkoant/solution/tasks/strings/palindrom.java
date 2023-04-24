package ru.spb.taranenkoant.solution.tasks.strings;

public class palindrom {
    public static void main(String[] args) {
        if(args.length == 0) System.out.println("no data");
        else System.out.println(isPalindrome(args[0]));
    }

    private static boolean isPalindrome(String data) {
        data = data.toLowerCase();
        data = data.replace(" ", "");
        int dataLen = data.length();
        for(int i = 0; i < dataLen / 2; i++)
            if(data.charAt(i) != data.charAt(dataLen - i - 1))
                return false;
        return true;
    }
}
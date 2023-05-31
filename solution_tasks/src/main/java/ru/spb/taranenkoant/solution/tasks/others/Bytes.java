package ru.spb.taranenkoant.solution.tasks.others;

public class Bytes {

    // Какими байтами представляется символ "Ы" в кодировке ЮТФ-8

    public static void main(String args[]) {
        String s = "Ы";

    byte [] b = s.getBytes();
    for (int i = 0; i < b.length; i ++) {
        System.out.print(((int)b[i] ^ -1 <<8)+" ");
    }
    }
}

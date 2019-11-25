package com.ifmo.lesson1;

public class IsEven {
    /*
    Напишите программу, которая выводит true, если число четное и false, если нет.
    Попробуйте сделать при помощи битовых операций.
     */
    public static void main(String[] args) {
        int n = 12;
        boolean res = isEven(n);
        System.out.println(res);
    }

    public static boolean isEven(int n) {
        // TODO implement
        if (n % 2 == 0) return true;
        return false;
    }
}

package com.ifmo.lesson2;

public class First55 {
    /*
    Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
     */
    public static void main(String[] args) {
        // TODO implement
        int i = 1;
        for (int c = 0; c < 55; c++) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();
    }
}

package com.ifmo.lesson1;

public class TwoDigitsSum {
    /*
    В переменной n хранится натуральное двузначное число.
    Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
     */
    public static void main(String[] args) {
        int n = 13;

        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
            System.out.println(sum);

        }
    }

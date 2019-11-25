package com.ifmo.lesson2;

public class Fibonacci {
    /*
     Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что
     первый и второй члены последовательности равны единицам, а каждый следующий — сумме
     двух предыдущих.
     */
    public static void main(String[] args) {
        // TODO implement
        int f1 = 1;
        int f2 = 1;
        System.out.print(f1 + " " + f2 + " ");
        for (int i = 2; i < 11; i++) {
            int f = f2;
            f2 = f1 + f2;
            f1 = f;
            System.out.print(f2 + " ");
        }
    }
}

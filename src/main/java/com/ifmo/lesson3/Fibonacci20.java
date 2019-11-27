package com.ifmo.lesson3;

public class Fibonacci20 {
    /*
    Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. Напоминаем,
    что первый и второй члены последовательности равны единицам, а каждый следующий —
    сумме двух предыдущих.
     */
    public static void main(String[] args) {
        int[] fibonacciNumbers = fibonacciNumbers();

        // TODO implement
        for (int i = 0; i < 20; i++)
            System.out.print(fibonacciNumbers[i] + " ");
    }

    public static int[] fibonacciNumbers() {
        // TODO implement
        int[] fib = new int[20];
        for (int i = 0; i < fib.length; i++) {
            if (i < 2)
                fib[i] = 1;
            else fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

}

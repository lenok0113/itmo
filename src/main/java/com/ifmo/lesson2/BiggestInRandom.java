package com.ifmo.lesson2;

import java.util.Random;

public class BiggestInRandom {
    /*
     Создать программу, выводящую на экран случайно сгенерированное трёхзначное
     натуральное число и его наибольшую цифру.Примеры работы программы:
     В числе 208 наибольшая цифра 8.
     В числе 774 наибольшая цифра 7.
     В числе 613 наибольшая цифра 6.
     */
    public static void main(String[] args) {
        int rnd = threeDigitRandom();

        String largestDigit = largestDigit(rnd);

        System.out.println(largestDigit);
    }

    public static int threeDigitRandom() {
        // TODO implement

        Random randomGenerator = new Random();
        int first = randomGenerator.nextInt(9) + 1;
        int second = randomGenerator.nextInt(11);
        int third = randomGenerator.nextInt(11);

        return (first * 100 + second * 10 + third);
    }

    public static String largestDigit(int rnd) {
        // TODO implement

        int n = rnd;
        int max = 0;
        max = n % 10;
        for (int i = 0; i < 2; i++) {
            n -= n % 10;
            n /= 10;
            if (n % 10 > max) {
                max = n % 10;
            }
        }
        return "В числе " + rnd + " наибольшая цифра " + max + ".";
    }
}

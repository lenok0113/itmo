package com.ifmo.lesson3;

import java.util.Arrays;
import java.util.Random;

public class Random8 {
    /*
    Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран
    в строку. Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на
    экран на отдельной строке.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();

        // TODO implement
        System.out.println(Arrays.toString(randomNumbers));

        int[] replacedWithZeros = replaceWithZeros(randomNumbers);

        // TODO implement
        System.out.println(Arrays.toString(replacedWithZeros));
    }

    public static int[] randomNumbers() {
        // TODO implement
        Random rnd = new Random();
        int[] num = new int[8];
        for (int i = 0; i < 8; i++) {
            num[i] = rnd.nextInt(9 + 1) + 1;
            if (num[i] > 10)
                num[i] %= 10;
        }
        return num;

    }

    public static int[] replaceWithZeros(int[] randomNumbers) {
        // TODO implement
        for (int i = 0; i < randomNumbers.length; i++) {
            if (i % 2 == 1)
                randomNumbers[i] = 0;
        }
        return randomNumbers;
    }
}

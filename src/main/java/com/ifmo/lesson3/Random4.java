package com.ifmo.lesson3;

import java.util.Arrays;
import java.util.Random;

public class Random4 {
    /*
    Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в
    строку. Определить и вывести на экран сообщение о том, является ли массив строго
    возрастающей последовательностью.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();

        // TODO implement
        System.out.println(Arrays.toString(randomNumbers));
        System.out.println(isIncreasingSequence(randomNumbers));
    }

    public static int[] randomNumbers() {
        // TODO implement
        Random rnd = new Random();
        int[] num = new int[4];
        for (int i = 0; i < 4; i++) {
            num[i] = rnd.nextInt(89 + 1) + 10;
            if (num[i] > 99)
                num[i] %= 99;
        }
        return num;
    }

    public static boolean isIncreasingSequence(int[] randomNumbers) {
        // TODO implement
        int a = randomNumbers[0];
        for (int i = 1; i < randomNumbers.length; i++) {
            if (randomNumbers[i] < a)
                return false;
            a = randomNumbers[i];
        }
        return true;
    }
}

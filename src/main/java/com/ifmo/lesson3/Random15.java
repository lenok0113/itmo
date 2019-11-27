package com.ifmo.lesson3;

import java.util.Arrays;
import java.util.Random;

public class Random15 {
    /*
     Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
     Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на
     отдельной строке.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();

        // TODO implement
        System.out.println(Arrays.toString(randomNumbers));

        int evens = evens(randomNumbers);

        // TODO implement
        System.out.println(evens);

    }

    public static int[] randomNumbers() {
        // TODO implement
        Random rnd = new Random();
        int[] num = new int[15];
        for (int i = 0; i < 15; i++) {
            num[i] = rnd.nextInt(9 + 1);
            if (num[i] > 9)
                num[i] %= 9;
        }
        return num;
    }

    private static int evens(int[] arr) {
        // TODO implement
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 2 == 0)
                count++;
        return count;
    }
}

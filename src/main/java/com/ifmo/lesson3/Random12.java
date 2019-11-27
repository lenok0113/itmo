package com.ifmo.lesson3;

import java.util.Random;

public class Random12 {
    /*
    Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой
    элемент является в этом массиве максимальным и сообщите индекс его последнего
    вхождения в массив.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();

        // TODO implement
        for (int i = 0; i < 12; i++)
            System.out.print(randomNumbers[i] + " ");

        int max = max(randomNumbers);
        int maxLastIndex = lastIndexOf(randomNumbers, max);

        // TODO implement
        System.out.println(maxLastIndex);
    }

    public static int[] randomNumbers() {
        // TODO implement
        Random rnd = new Random();
        int[] num = new int[12];
        for (int i = 0; i < 12; i++) {
            num[i] = rnd.nextInt(30 + 1) - 15;
            if (num[i] > 15)
                num[i] %= 15;
        }
        return num;
    }

    public static int max(int[] randomNumbers) {
        // TODO implement
        int max = randomNumbers[0];
        for (int i = 1; i < randomNumbers.length; i++) {
            if (randomNumbers[i] > max)
                max = randomNumbers[i];
        }
        return max;
    }

    public static int lastIndexOf(int[] randomNumbers, int max) {
        // TODO implement
        int k = -1;
        for (int i = 0; i < randomNumbers.length; i++)
            if (randomNumbers[i] == max)
                k = i;
        return k;
    }
}

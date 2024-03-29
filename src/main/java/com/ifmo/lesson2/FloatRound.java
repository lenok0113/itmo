package com.ifmo.lesson2;

public class FloatRound {
    /*
    В переменной n хранится вещественное число с ненулевой дробной частью.
    Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.
     */
    public static void main(String[] args) {
        float n = 12.4F;

        float rounded = round(n);

        System.out.println(rounded);
    }

    public static float round(float n) {
        // TODO implement
        int digit = (int) ((n * 10) % 10);

        if (digit < 0) digit = -digit;

        if (n > 0) {
            if (digit < 5)
                return (int) (n - (n % 1));
            else return (int) ((n - (n % 1)) + 1);
        }

        if (digit < 5)
            return (int) (n - (n % 1));
        return n - (n % 1) - 1;
    }
}

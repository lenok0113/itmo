package com.ifmo.lesson2;

public class SymmetricClocks {
    /*
    Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько
    раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация
    для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51)
     */
    public static void main(String[] args) {
        System.out.println(symmetricTimes());
    }

    public static int symmetricTimes() {
        // TODO implement
        int sum = 0;
        for (int i = 0; i <= 23 * 60 + 59; i++) {
            int hours = i / 60;
            int minutes = i % 60;
            if ((hours % 10 == minutes / 10) && (hours / 10 == minutes % 10))
                sum++;
        }
        return sum;
    }
}

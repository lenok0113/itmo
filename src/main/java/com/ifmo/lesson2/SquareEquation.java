package com.ifmo.lesson2;

import java.util.Arrays;

public class SquareEquation {
    /*
     В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
     будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
     либо сообщать, что корней нет.
     */
       public static void main(String[] args) {
        double a = 2;
        double b = -9;
        double c = 9;

        double[] roots = squareEquationRoots(a, b, c);

        System.out.println(Arrays.toString(roots));
    }

    /*
    Возвращает массив из двух корней или null, если таковых нет.
     */
        public static double[] squareEquationRoots(double a, double b, double c) {
        // TODO implement
            if (a == 0.0) {
                double x = - c / b;
                double[] roots = new double[1];
                roots[0] = x;
                return roots;
            }
            else {
                double d = b * b - 4 * a * c;
                if (d == 0.0) {
                    double x = -b / (2 * a);
                    double[] roots = new double[1];
                    roots[0] = x;
                    return roots;
                }
                if (d > 0.0) {
                    double[] roots = new double[2];
                    d = Math.sqrt(d);
                    roots[0] = (- b - d) / (2 * a);
                    roots[1] = (- b + d) / (2 * a);
                    return roots;
                }
            }
            return null;
    }

}

package ru.ssau.tk.sergunin.practoop.MyArray;

import java.util.Arrays;

public class MyArray {
    private MyArray() {
        ;
    }

    public static double[] GeneratorNewArray(int count) {
        double[] yValues = new double[count];
        for (int i = 0; i < (count); i++) {
            yValues[i] = 0;
        }
        return yValues;
    }

    public static double[] GeneratorTwoOneTwo(int count) {
        double[] yValues = new double[count];
        if (count > 0) {
            yValues[0] = 2;
            yValues[count - 1] = 2;
            for (int i = 1; i < (count - 1); i++) {
                yValues[i] = 1;
            }
        }
        return yValues;
    }

    public static double[] GeneratorSqr(int count) {
        double[] yValues = new double[count];
        for (int i = 0; i < count; i++) {
            yValues[i] = i * i;
        }
        return yValues;
    }

    public static double[] GeneratorOdd(int count) {
        double[] yValues = new double[count];
        for (int i = 0; i < count; i++) {
            yValues[i] = (2 * i + 1);
        }
        return yValues;
    }

    public static double[] GeneratorDecreasingEven(int count) {
        double[] yValues = new double[count];
        for (int i = 0; i < count; i++) {
            yValues[i] = (2 * (count - i));
        }
        return yValues;
    }

    public static double[] GeneratorFibonacciNumbers(int count) {
        double[] yValues = new double[count];
        if (count > 0) {
            yValues[0] = 1;
            if (count > 1) {
                yValues[1] = 1;
                if (count > 2) {
                    for (int i = 2; i < count; i++) {
                        yValues[i] = (yValues[i - 2] + yValues[i - 1]);
                    }
                }
            }
        }
        return yValues;
    }

    public static double[] GeneratorQuadraticEquation(double a, double b, double c) {
        if (a > 0) {
            double[] yValues = new double[2];
            yValues[0] = -b / (2 * a) + Math.pow((Math.pow(b, 2) - 4 * a * c) / (4 * a * a),1./2);
            yValues[1] = -b / (2 * a) - Math.pow((Math.pow(b, 2) - 4 * a * c) / (4 * a * a),1./2);
            return yValues;
        } else {
            double[] yValues = new double[1];
            yValues[0] = (-c / b);
            return yValues;
        }
    }
}

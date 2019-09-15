package ru.ssau.tk.sergunin.practoop.MyArray;

import java.util.Arrays;

public class MyArray {
    private MyArray() {
        ;
    }

    public double[] GeneratorNewArray(int count) {
        double[] yValues = new double[count];
        for (int i = 0; i < (count); i++) {
            yValues[i] = 0;
        }
        return yValues;
    }

    public double[] GeneratorTwoOneTwo(int count) {
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

    public double[] GeneratorSqr(int count) {
        double[] yValues = new double[count];
        for (int i = 0; i < count; i++) {
            yValues[i] = i * i;
        }
        return yValues;
    }

    public double[] GeneratorOdd(int count) {
        double[] yValues = new double[count];
        for (int i = 0; i < count; i++) {
            yValues[i] = (2 * i + 1);
        }
        return yValues;
    }

    public double[] GeneratorDecreasingEven(int count) {
        double[] yValues = new double[count];
        for (int i = 0; i < count; i++) {
            yValues[i] = (2 * (count - i));
        }
        return yValues;
    }

    public double[] GeneratorFibonacciNumbers(int count) {
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
}

package ru.ssau.tk.sergunin.practoop.MyArray;

import java.util.Arrays;

public class MyArray {
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

    public static double[] GeneratorNatMod3(int count) {
        double[] yValues = new double[count];
        int j = 1;
        for (int i = 0; i < count; i++) {
            while (j == j) {
                if (j % 3 == 0) {
                    yValues[i] = j;
                    j++;
                    break;
                } else {
                    j++;
                }
            }
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
            yValues[0] = -b / (2 * a) + Math.pow((Math.pow(b, 2) - 4 * a * c) / (4 * a * a), 1. / 2);
            yValues[1] = -b / (2 * a) - Math.pow((Math.pow(b, 2) - 4 * a * c) / (4 * a * a), 1. / 2);
            return yValues;
        } else {
            double[] yValues = new double[1];
            yValues[0] = (-c / b);
            return yValues;
        }
    }

    public static double[] GeneratorProgressAriF(int count, int b, int q) {
        double[] yValues = new double[count];
        for (int i = 0; i < count; i++) {
            yValues[i] = b + i * q;
        }
        return yValues;
    }

    public static double[] GeneratorProgressGeom(int count, int b, int q) {
        double[] yValues = new double[count];
        for (int i = 0; i < count; i++) {
            yValues[i] = b * Math.pow(q, i);
        }
        return yValues;
    }

    public static double[] GeneratorDeliteli(int count) {
        double[] zValues = new double[0];
        int j = 0;
        for (int i = 1; i <= count; i++) {
            if (count % i == 0) {
                double[] xValues = new double[zValues.length + 1];
                System.arraycopy(zValues, 0, xValues, 0, zValues.length);
                xValues[j] = i;
                zValues = xValues;
                j++;
            }
        }
        return zValues;
    }

    public static double[] GeneratorProstoe(int count) {
        double[] zValues = new double[0];
        int j = 0;
        for (int i = 3; i <= count; i++) {
            if (MyArray.GeneratorDeliteli(i).length == 2) {
                double[] xValues = new double[zValues.length + 1];
                System.arraycopy(zValues, 0, xValues, 0, zValues.length);
                xValues[j] = i;
                zValues = xValues;
                j++;
            }
        }
        return zValues;
    }

    public static double[] GeneratorLestnica(int count) {
        double[] zValues = new double[count];
        for (int i = 0; i < count; i++) {
            if ((double) i <= (double) (count / 2)) {
                if ((double) i == (double) (count / 2)) {
                    zValues[i] = i;
                } else {
                    zValues[i] = i + 1;
                }
            } else {
                zValues[i] = zValues[i - 1] - 1;
            }
        }
        return zValues;
    }

    public static void GeneratorMinus(double[] zValues) {
        for (int i = 0; i < zValues.length; i++) {
            zValues[i] = -zValues[i];
        }
    }

    public static boolean GeneratorProverkaNaChislo(double[] zValues, double x) {
        for (int i = 0; i < zValues.length; i++) {
            if (zValues[i] == x) {
                return true;
            }
        }
        return false;
    }

    public static boolean GeneratorIntNull(Integer[] zValues) {
        for (int i = 0; i < zValues.length; i++) {
            if (zValues[i] == null) {
                return true;
            }
        }
        return false;
    }

    public static int CountChet(Integer[] zValues) {
        int j = 0;
        for (int i = 0; i < zValues.length; i++) {
            if (zValues[i] % 2 == 0) {
                j++;
            }
        }
        return j;
    }

    public static Integer CountMax(Integer[] zValues) {
        if (zValues.length == 0) {
            return null;
        }
        Integer j = Integer.MIN_VALUE;
        for (int i = 0; i < zValues.length; i++) {
            if (zValues[i] > j) {
                j = zValues[i];
            }
        }
        return j;
    }

    public static int SumCountChet(Integer[] zValues) {
        int j = 0;
        for (int i = 0; i < zValues.length; i++) {
            if (i % 2 == 0) {
                j += zValues[i];
            }
        }
        return j;
    }
}


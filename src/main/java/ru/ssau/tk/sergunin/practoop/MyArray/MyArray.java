package ru.ssau.tk.sergunin.practoop.MyArray;

import java.util.Arrays;

public class MyArray {
    public static double[] generatorNewArray(int count) {
        double[] yValues = new double[count];
        for (int i = 0; i < (count); i++) {
            yValues[i] = 0;
        }
        return yValues;
    }

    public static double[] generatorTwoOneTwo(int count) {
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

    public static double[] generatorSqr(int count) {
        double[] yValues = new double[count];
        for (int i = 0; i < count; i++) {
            yValues[i] = i * i;
        }
        return yValues;
    }

    public static double[] generatorOdd(int count) {
        double[] yValues = new double[count];
        for (int i = 0; i < count; i++) {
            yValues[i] = (2 * i + 1);
        }
        return yValues;
    }

    public static double[] generatorNatMod3(int count) {
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

    public static double[] generatorDecreasingEven(int count) {
        double[] yValues = new double[count];
        for (int i = 0; i < count; i++) {
            yValues[i] = (2 * (count - i));
        }
        return yValues;
    }

    public static double[] generatorFibonacciNumbers(int count) {
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

    public static double[] generatorQuadraticEquation(double a, double b, double c) {
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

    public static double[] generatorProgressAriF(int count, int b, int q) {
        double[] yValues = new double[count];
        for (int i = 0; i < count; i++) {
            yValues[i] = b + i * q;
        }
        return yValues;
    }

    public static double[] generatorProgressGeom(int count, int b, int q) {
        double[] yValues = new double[count];
        for (int i = 0; i < count; i++) {
            yValues[i] = b * Math.pow(q, i);
        }
        return yValues;
    }

    public static double[] generatorDeliteli(int count) {
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

    public static double[] generatorProstoe(int count) {
        double[] zValues = new double[0];
        int j = 0;
        for (int i = 3; i <= count; i++) {
            if (MyArray.generatorDeliteli(i).length == 2) {
                double[] xValues = new double[zValues.length + 1];
                System.arraycopy(zValues, 0, xValues, 0, zValues.length);
                xValues[j] = i;
                zValues = xValues;
                j++;
            }
        }
        return zValues;
    }

    public static double[] generatorLestnica(int count) {
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

    public static void generatorMinus(double[] zValues) {
        for (int i = 0; i < zValues.length; i++) {
            zValues[i] = -zValues[i];
        }
    }

    public static boolean generatorProverkaNaChislo(double[] zValues, double x) {
        for (int i = 0; i < zValues.length; i++) {
            if (zValues[i] == x) {
                return true;
            }
        }
        return false;
    }

    public static boolean generatorIntNull(Integer[] zValues) {
        for (int i = 0; i < zValues.length; i++) {
            if (zValues[i] == null) {
                return true;
            }
        }
        return false;
    }

    public static int countChet(Integer[] zValues) {
        int j = 0;
        for (int i = 0; i < zValues.length; i++) {
            if (zValues[i] % 2 == 0) {
                j++;
            }
        }
        return j;
    }

    public static Integer countMax(Integer[] zValues) {
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

    public static int sumCountChet(Integer[] zValues) {
        int j = 0;
        for (int i = 0; i < zValues.length; i++) {
            if (i % 2 == 0) {
                j += zValues[i];
            }
        }
        return j;
    }

    public static boolean booleanCountChet(Integer[] zValues) {
        int j = 0;
        int m = 0;
        for (int i = 0; i < zValues.length; i++) {
            if (i % zValues[0] == 0) {
                j++;
            }
            if (i % zValues[zValues.length - 1] == 0) {
                m++;
            }
        }
        if (j > m) {
            return true;
        }
        return false;
    }

    public static int sortCountMax(Integer[] zValues) {
        int j = 0;
        int s = 0;
        Integer[][] yValues = new Integer[zValues.length][2];
        Arrays.sort(zValues);
        yValues[s][0] = zValues[0];
        for (int i = 1; i < zValues.length; i++) {
            if (zValues[i] == zValues[i - 1]) {
                j++;
            } else {
                yValues[s][1] = j + 1;
                s++;
                j = 0;
                yValues[s][0] = zValues[i];
                yValues[s][1] = 1;
            }
        }
        s = 0;
        int max = 0;
        int max_s = 0;
        while (yValues[s][0] != null) {
            if (yValues[s][1] > max) {
                max = yValues[s][1];
                max_s=s;
            }
            s++;
        }
        return yValues[max_s][0];
    }
}



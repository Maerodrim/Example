package ru.ssau.tk.sergunin.practoop.MyArray;
import java.util.Arrays;
public class MyArray {
        private double[] xValues;
        private int count;

    MyArray(double[] xValues) {
            this.count = xValues.length;
            this.xValues = Arrays.copyOf(xValues, count);
        }
    MyArray(int count) {
        double[] yValues= new double[count];
        for (int i=0;i<count;i++) {yValues[i]=i;}
        this.count = yValues.length;
        this.xValues = Arrays.copyOf(yValues, count);
    }
    }

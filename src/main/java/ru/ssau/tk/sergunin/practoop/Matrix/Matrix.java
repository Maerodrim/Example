package ru.ssau.tk.sergunin.practoop.Matrix;

import java.util.StringJoiner;

public class Matrix {
    private double[][] matrix;
    private int n, m;

    Matrix(int n, int m) {
        this.matrix = new double[n][m];
        this.n = n;
        this.m = m;
    }

    Matrix(Matrix matrix) {
        this.matrix = matrix.matrix;
        this.n = matrix.getN();
        this.m = matrix.getM();
    }


    public void setMatrix(double[][] matrix) {
        this.matrix = matrix;
    }

    public void setMatrixValues(int n, int m, double values) {
        this.matrix[n][m] = values;
    }

    public double getMatrixValues(int n, int m) {
        return matrix[n][m];
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    @Override
    public String toString(){
        StringJoiner outerJoiner = new StringJoiner(";\n");
        StringJoiner innerJoiner = new StringJoiner(",");
        for (double[] row : matrix) {
            for (double element : row) {
                innerJoiner.add(element + "");
            }
            outerJoiner.add(innerJoiner.toString());
            innerJoiner = new StringJoiner(",");
        }
        return outerJoiner.toString() + ";";
    }
}

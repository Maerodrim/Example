package ru.ssau.tk.sergunin.practoop.Matrix;

public class Matrix {
    private double[][] matrix;
    private int n, m;

    Matrix(int n, int m) {
        this.matrix = new double[n][m];
        this.n = n;
        this.m = m;
    }

    Matrix(Matrix matrix) {
        this.matrix = new double[matrix.getN()][matrix.getM()];
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
}

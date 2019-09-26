package ru.ssau.tk.sergunin.practoop.Matrix;

public class Matrices {

    public static Matrix matrixAddition(Matrix a, Matrix b) {
        if ((a.getM() == b.getM()) && (a.getN() == b.getN())) {
            Matrix c = new Matrix(a.getN(), a.getM());
            for (int i = 0; i < a.getN(); i++) {
                for (int j = 0; j < a.getM(); j++) {
                    c.setMatrixValues(i, j, a.getMatrixValues(i, j) + b.getMatrixValues(i, j));
                }
            }
            return c;
        } else {
            return null;
        }
    }

    public static Matrix matrixSubtraction(Matrix a, Matrix b) {
        if ((a.getM() == b.getM()) && (a.getN() == b.getN())) {
            Matrix c = new Matrix(a.getN(), a.getM());
            for (int i = 0; i < a.getN(); i++) {
                for (int j = 0; j < a.getM(); j++) {
                    c.setMatrixValues(i, j, a.getMatrixValues(i, j) - b.getMatrixValues(i, j));
                }
            }
            return c;
        } else {
            return null;
        }
    }

    public static Matrix matrixMultiplication(Matrix a, Matrix b) {
        if ((a.getM() == b.getN())) {
            Matrix c = new Matrix(a.getN(), b.getM());
            for (int i = 0; i < a.getN(); i++) {
                for (int j = 0; j < b.getN(); j++) {
                    for (int p = 0; p < a.getM(); p++) {
                        c.setMatrixValues(i, j, c.getMatrixValues(i, j) + a.getMatrixValues(i, p) * b.getMatrixValues(p, j));
                    }
                }
            }
            return c;
        } else {
            return null;
        }
    }

    public static Matrix matrixMultiplication(Matrix a, double b) {
        Matrix c = new Matrix(a.getN(), a.getM());
        for (int i = 0; i < a.getN(); i++) {
            for (int j = 0; j < a.getM(); j++) {
                c.setMatrixValues(i, j, b * a.getMatrixValues(i, j));
            }
        }
        return c;
    }

    public static Matrix matrixTranspose(Matrix a) {
        Matrix c = new Matrix(a.getM(), a.getN());
        for (int i = 0; i < a.getN(); i++) {
            for (int j = 0; j < a.getM(); j++) {
                c.setMatrixValues(j, i, a.getMatrixValues(i, j));
            }
        }
        return c;
    }

    public static Matrix gaussMethod(Matrix a) {
        if (a.getN() == (a).getM() - 1) {
            double k = 0;
            for (int i = 0; i < a.getN(); i++) {
                for (int j = i + 1; j < a.getN(); j++) {
                    k = a.getMatrixValues(j, i) / a.getMatrixValues(i, i);
                    for (int n = 0; n < a.getM(); n++) {
                        a.setMatrixValues(j, n, a.getMatrixValues(j, n) - a.getMatrixValues(i, n) * k);
                    }
                }
            }
            Matrix x = new Matrix(a.getN(), 1);
            x.setMatrixValues(a.getN() - 1, 0, a.getMatrixValues(a.getN() - 1, a.getN()) / a.getMatrixValues(a.getN() - 1, a.getN() - 1));
            for (int i = a.getN() - 2; i >=0; i--) {
                k = 0;
                for (int j = i; j < a.getN(); j++) {
                    k = k + a.getMatrixValues(i, j) * x.getMatrixValues(j, 0);
                }
                x.setMatrixValues(i , 0, (a.getMatrixValues(i, a.getN()) - k) / a.getMatrixValues(i, i));
            }
            return x;
        } else {
            return null;
        }
    }

    public static double matrixDeterminant(Matrix matrix) {
        if (matrix.getN() == (matrix).getM()) {
            return Double.parseDouble(null);
        }
        double Det = 0;
        if (matrix.getN() == 2) {
            return matrix.getMatrixValues(0, 0) * matrix.getMatrixValues(1, 1) - matrix.getMatrixValues(0, 1) * matrix.getMatrixValues(1, 0);
        } else {
            int k;
            for (int j = 0; j < matrix.getN(); j++) {
                k = j % 2 == 0 ? 1 : -1;
                Det += k * matrix.getMatrixValues(0, j) * matrixDeterminant(getMinor(matrix, 0, j));
            }
        }
        return Det;
    }

    private static Matrix getMinor(Matrix matrix, int row, int column) {
        int minorLength = matrix.getN() - 1;
        Matrix minor = new Matrix(minorLength, minorLength);
        int a = 0;
        int b;
        for (int i = 0; i <= minorLength; i++) {
            b = 0;
            for (int j = 0; j <= minorLength; j++) {
                if (i == row) {
                    a = 1;
                } else {
                    if (j == column) {
                        b = 1;
                    } else {
                        minor.setMatrixValues(i - a, j - b, matrix.getMatrixValues(i, j));
                    }
                }
            }
        }
        return minor;
    }
}



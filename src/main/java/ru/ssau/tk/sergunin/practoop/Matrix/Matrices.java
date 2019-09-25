package ru.ssau.tk.sergunin.practoop.Matrix;

public class Matrices {

    public Matrix matrixAddition(Matrix a, Matrix b) {
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

    public Matrix matrixSubtraction(Matrix a, Matrix b) {
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

    public Matrix matrixMultiplication(Matrix a, Matrix b) {
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

    public Matrix matrixMultiplication(Matrix a, double b) {
        Matrix c = new Matrix(a.getN(), a.getM());
        for (int i = 0; i < a.getN(); i++) {
            for (int j = 0; j < a.getM(); j++) {
                c.setMatrixValues(i, j, b * a.getMatrixValues(i, j));
            }
        }
        return c;
    }

    public Matrix matrixTranspose(Matrix a) {
        Matrix c = new Matrix(a.getM(), a.getN());
        for (int i = 0; i < a.getN(); i++) {
            for (int j = 0; j < a.getM(); j++) {
                c.setMatrixValues(i, j, a.getMatrixValues(j, i));
            }
        }
        return c;
    }

    public Matrix gaussMethod(Matrix a) {
        if (a.getN() == (a).getM() - 1) {
            double k = 0;
            for (int i = 0; i < a.getN(); i++) {
                for (int o = i + 1; o < a.getN(); o++) {
                    k = a.getMatrixValues(o, i) / a.getMatrixValues(i, i);
                    for (int n = 0; n < a.getM(); n++) {
                        a.setMatrixValues(o, n, a.getMatrixValues(o, n) - a.getMatrixValues(i, n) * k);
                    }
                }
            }
            Matrix x = new Matrix(a.getN(), 1);
            x.setMatrixValues(a.getN(), 1, a.getMatrixValues(a.getN() - 1, a.getN()) / a.getMatrixValues(a.getN() - 1, a.getN() - 1));
            for (int i = a.getN() - 1; i > 0; i--) {
                k = 0;
                for (int o = i + 1; i < a.getN(); i++) {
                    k = k + a.getMatrixValues(i, o) * x.getMatrixValues(o, 1);
                }
                x.setMatrixValues(i, 1, (a.getMatrixValues(i, a.getN() + 1) - k) / a.getMatrixValues(i, i));
            }
            return x;
        } else {
            return null;
        }
    }

    public double matrixDeterminant(Matrix matrix) {
        if (matrix.getN() == (matrix).getM() - 1) {
            return Double.parseDouble(null);
        }
        double Det = 0;
        if (matrix.getN() == 2) {
            return matrix.getMatrixValues(1, 1) * matrix.getMatrixValues(2, 2) - matrix.getMatrixValues(1, 2) * matrix.getMatrixValues(2, 1);
        } else {
            int k;
            for (int j = 0; j < matrix.getN(); j++) {
                k = j % 2 == 0 ? 1 : -1;
                Det += k * matrix.getMatrixValues(1, j + 1) * matrixDeterminant(getMinor(matrix, 0, j));
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
                        minor.setMatrixValues(i - a + 1, j - b + 1, matrix.getMatrixValues(i + 1, j + 1));
                    }
                }
            }
        }
        return minor;
    }
}



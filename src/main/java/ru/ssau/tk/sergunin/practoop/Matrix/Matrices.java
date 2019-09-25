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

    public double matrixDeterminant(Matrix a) {
        if (a.getN() == (a).getM() - 1) {
            double c = 0;
            Matrix buff=new Matrix(a.getN(),1);
            for (int i = 0; i < a.getN(); i++) {
                for (int j = 0; j < a.getM(); j++) {
                    c += Math.pow(-1, i + j) * a.getMatrixValues(j, i);
                }
            }
            return c;
        } else {
            return Double.NaN;
        }
    }
}



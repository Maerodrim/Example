package ru.ssau.tk.sergunin.practoop.Matrix;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MatrixTest {

    @Test
    public void testTestToString() {
            Matrix firstMatrix = new Matrix(2, 2);
            firstMatrix.setMatrixValues(0, 0, 1);
            firstMatrix.setMatrixValues(0, 1, 1);
            firstMatrix.setMatrixValues(1, 0, 2);
            firstMatrix.setMatrixValues(1, 1, 4);
            System.out.println(firstMatrix + "\n");
            Matrix secondMatrix = new Matrix(3, 3);
            secondMatrix.setMatrixValues(0, 0, 1);
            secondMatrix.setMatrixValues(0, 1, 1);
            secondMatrix.setMatrixValues(0, 2, 2);
            secondMatrix.setMatrixValues(1, 1, 4);
            secondMatrix.setMatrixValues(1, 1, 10);
            secondMatrix.setMatrixValues(1, 2, 11);
            secondMatrix.setMatrixValues(2, 1, -7);
            secondMatrix.setMatrixValues(2, 1, 8);
            secondMatrix.setMatrixValues(2, 2, -9);
            System.out.println(secondMatrix);
    }
}
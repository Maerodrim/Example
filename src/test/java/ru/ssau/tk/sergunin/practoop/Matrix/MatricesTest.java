package ru.ssau.tk.sergunin.practoop.Matrix;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MatricesTest {

    @Test
    public void testMatrixAddition() {
        Matrix firstMatrix = new Matrix(2, 2);
        firstMatrix.setMatrixValues(0, 0, 1);
        firstMatrix.setMatrixValues(0, 1, 2);
        firstMatrix.setMatrixValues(1, 0, 3);
        firstMatrix.setMatrixValues(1, 1, 4);
        Matrix secondMatrix = new Matrix(2, 2);
        secondMatrix.setMatrixValues(0, 0, -1);
        secondMatrix.setMatrixValues(0, 1, 3);
        secondMatrix.setMatrixValues(1, 0, 5);
        secondMatrix.setMatrixValues(1, 1, -4);
        Matrix thirdMatrix = new Matrix(1, 1);
        thirdMatrix.setMatrixValues(0, 0, -1);

        Matrix firstResult = Matrices.matrixAddition(firstMatrix, thirdMatrix);
        assertNull(firstResult);

        Matrix secondResult = Matrices.matrixAddition(firstMatrix, secondMatrix);
        assertEquals(secondResult.getMatrixValues(0, 0), 0);
    }

    @Test
    public void testMatrixSubtraction() {
        Matrix firstMatrix = new Matrix(2, 2);
        firstMatrix.setMatrixValues(0, 0, 1);
        firstMatrix.setMatrixValues(0, 1, 2);
        firstMatrix.setMatrixValues(1, 0, 3);
        firstMatrix.setMatrixValues(1, 1, 4);
        Matrix secondMatrix = new Matrix(2, 2);
        secondMatrix.setMatrixValues(0, 0, -1);
        secondMatrix.setMatrixValues(0, 1, 3);
        secondMatrix.setMatrixValues(1, 0, 5);
        secondMatrix.setMatrixValues(1, 1, -4);
        Matrix thirdMatrix = new Matrix(1, 1);
        thirdMatrix.setMatrixValues(0, 0, -1);

        Matrix firstResult = Matrices.matrixSubtraction(firstMatrix, thirdMatrix);
        assertNull(firstResult);

        Matrix secondResult = Matrices.matrixSubtraction(firstMatrix, secondMatrix);
        assertEquals(secondResult.getMatrixValues(1, 1), 8);
    }

    @Test
    public void testMatrixMultiplication() {
        Matrix firstMatrix = new Matrix(2, 2);
        firstMatrix.setMatrixValues(0, 0, 1);
        firstMatrix.setMatrixValues(0, 1, 2);
        firstMatrix.setMatrixValues(1, 0, 3);
        firstMatrix.setMatrixValues(1, 1, 4);
        Matrix secondMatrix = new Matrix(2, 2);
        secondMatrix.setMatrixValues(0, 0, -1);
        secondMatrix.setMatrixValues(0, 1, 3);
        secondMatrix.setMatrixValues(1, 0, 5);
        secondMatrix.setMatrixValues(1, 1, -4);
        Matrix thirdMatrix = new Matrix(1, 1);
        thirdMatrix.setMatrixValues(0, 0, -1);

        Matrix firstResult = Matrices.matrixMultiplication(firstMatrix, thirdMatrix);
        assertNull(firstResult);

        Matrix secondResult = Matrices.matrixMultiplication(firstMatrix, secondMatrix);
        assertEquals(secondResult.getMatrixValues(1, 1), -7);
        Matrix thirdResult = Matrices.matrixMultiplication(firstMatrix, 5);
        assertEquals(thirdResult.getMatrixValues(1, 1), 20);
    }

    @Test
    public void testMatrixTranspose() {
            Matrix firstMatrix = new Matrix(2, 2);
            firstMatrix.setMatrixValues(0, 0, 1);
            firstMatrix.setMatrixValues(0, 1, 2);
            firstMatrix.setMatrixValues(1, 0, 3);
            firstMatrix.setMatrixValues(1, 1, 4);

            Matrix secondResult = Matrices.matrixTranspose(firstMatrix);
            assertEquals(secondResult.getMatrixValues(1, 0), 2);
    }

    @Test
    public void testGaussMethod() {
        Matrix firstMatrix = new Matrix(2, 3);
        firstMatrix.setMatrixValues(0, 0, 1);
        firstMatrix.setMatrixValues(0, 1, 2);
        firstMatrix.setMatrixValues(1, 0, 3);
        firstMatrix.setMatrixValues(1, 1, 4);
        firstMatrix.setMatrixValues(0, 2, 7);
        firstMatrix.setMatrixValues(1, 2, 4);
        Matrix secondResult = Matrices.gaussMethod(firstMatrix);
        assertEquals(secondResult.getMatrixValues(0, 0), -10);
    }

    @Test
    public void testMatrixDeterminant() {
        Matrix firstMatrix = new Matrix(2, 3);
        firstMatrix.setMatrixValues(0, 0, 1);
        firstMatrix.setMatrixValues(0, 1, 2);
        firstMatrix.setMatrixValues(1, 0, 3);
        firstMatrix.setMatrixValues(1, 1, 4);
        double secondResult = Matrices.matrixDeterminant(firstMatrix);
        assertEquals(secondResult, -2);
    }
}
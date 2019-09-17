package ru.ssau.tk.sergunin.practoop.MyArray;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MyArrayTest {
    int count = 10;
    double[] yValues = new double[count];

    @Test
    public void testGeneratorNewArray() {
        yValues = MyArray.GeneratorNewArray(count);
        for (int i = 0; i < count; i++) {
            assertEquals(yValues[i], 0, 0.0001);
        }
    }

    @Test
    public void testGeneratorTwoOneTwo() {
        yValues = MyArray.GeneratorTwoOneTwo(count);
        for (int i = 1; i < count - 1; i++) {
            assertEquals(yValues[i], 1, 0.0001);
        }
    }

    @Test
    public void testGeneratorSqr() {
        yValues = MyArray.GeneratorSqr(count);
        for (int i = 0; i < count; i++) {
            assertEquals(yValues[i], i * i, 0.0001);
        }
    }

    @Test
    public void testGeneratorOdd() {
        yValues = MyArray.GeneratorOdd(count);
        for (int i = 0; i < count; i++) {
            assertEquals(yValues[i], (2 * i + 1), 0.0001);
        }
    }

    @Test
    public void testGeneratorDecreasingEven() {
        yValues = MyArray.GeneratorDecreasingEven(count);
        for (int i = 0; i < count; i++) {
            assertEquals(yValues[i], (2 * (count - i)), 0.0001);
        }
    }

    @Test
    public void testGeneratorFibonacciNumbers() {
        yValues = MyArray.GeneratorFibonacciNumbers(count);
        if (count > 0) {
            assertEquals(yValues[0], 1, 0.0001);
            if (count > 1) {
                assertEquals(yValues[1], 1, 0.0001);
                if (count > 2) {
                    for (int i = 2; i < count; i++) {
                        assertEquals(yValues[i], (yValues[i - 2] + yValues[i - 1]), 0.0001);
                    }
                }
            }
        }
    }

    @Test
    public void testGeneratorQuadraticEquation() {
        yValues = MyArray.GeneratorQuadraticEquation(1, 0, -4);

        assertEquals(yValues[0], 2, 0.0001);
        assertEquals(yValues[1], -2, 0.0001);
    }

    @Test
    public void testGeneratorNatMod3() {
        yValues = MyArray.GeneratorNatMod3(count);
        int j = 1;
        for (int i = 0; i < count; i++) {
            while (j == j) {
                if (j % 3 == 0) {
                    assertEquals(yValues[i], j, 0.0001);
                    j++;
                    break;
                } else {
                    j++;
                }
            }
        }
    }

    @Test
    public void testGeneratorProgressAriF() {
        yValues = MyArray.GeneratorProgressAriF(count, 5, 5);
        for (int i = 0; i < count; i++) {
            assertEquals(yValues[i], (5 + 5 * i), 0.0001);
        }
    }

    @Test
    public void testGeneratorProgressGeom() {
        yValues = MyArray.GeneratorProgressGeom(count, 5, 5);
        for (int i = 0; i < count; i++) {
            assertEquals(yValues[i], 5 * Math.pow(5, i), 0.0001);
        }
    }

    @Test
    public void testGeneratorDeliteli() {
        yValues = MyArray.GeneratorDeliteli(3);

        assertEquals(yValues[0], 1, 0.0001);
        assertEquals(yValues[1], 3, 0.0001);
        assertEquals(yValues.length, 2, 0.0001);
    }

    @Test
    public void testGeneratorProstoe() {
        yValues = MyArray.GeneratorProstoe(20);
        assertEquals(yValues[0], 3, 0.0001);
        assertEquals(yValues.length, 7, 0.0001);
    }

    @Test
    public void testGeneratorLestnica() {
        yValues = MyArray.GeneratorLestnica(20);
        assertEquals(yValues[0], 1, 0.0001);
        assertEquals(yValues[19], 1, 0.0001);
        assertEquals(yValues.length, 20, 0.0001);
    }

    @Test
    public void testGeneratorMinus() {
        yValues = MyArray.GeneratorLestnica(20);
        MyArray.GeneratorMinus(yValues);
        assertEquals(yValues[0], -1, 0.0001);
        assertEquals(yValues[19], -1, 0.0001);
        assertEquals(yValues.length, 20, 0.0001);
    }

    @Test
    public void testGeneratorProverkaNaChislo() {
        yValues = MyArray.GeneratorLestnica(10);
        MyArray.GeneratorProverkaNaChislo(yValues, 5);
        assertFalse(MyArray.GeneratorProverkaNaChislo(yValues, 9));
        assertTrue(MyArray.GeneratorProverkaNaChislo(yValues, 5));
    }

    @Test
    public void testGeneratorIntNull() {
        Integer[] yValues = new Integer[]{4, 6, 3, 6, null};
        assertTrue(MyArray.GeneratorIntNull(yValues));
        Integer[] zValues = new Integer[]{4, 6, 3, 6, 7};
        assertFalse(MyArray.GeneratorIntNull(zValues));
    }
    @Test
    public void testCountChet() {
        Integer[] yValues = new Integer[]{9, 1, 3, 5, 7};
        assertEquals(MyArray.CountChet(yValues),0,0.00001);
        Integer[] zValues = new Integer[]{4, 6, 3, 6, 7};
        assertEquals(MyArray.CountChet(zValues),3,0.00001);
    }
}
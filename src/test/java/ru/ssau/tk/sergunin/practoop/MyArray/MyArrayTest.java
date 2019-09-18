package ru.ssau.tk.sergunin.practoop.MyArray;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MyArrayTest {
    int count = 10;
    double[] yValues = new double[count];

    @Test
    public void testGeneratorNewArray() {
        yValues = MyArray.generatorNewArray(count);
        for (int i = 0; i < count; i++) {
            assertEquals(yValues[i], 0, 0.0001);
        }
    }

    @Test
    public void testGeneratorTwoOneTwo() {
        yValues = MyArray.generatorTwoOneTwo(count);
        for (int i = 1; i < count - 1; i++) {
            assertEquals(yValues[i], 1, 0.0001);
        }
    }

    @Test
    public void testGeneratorSqr() {
        yValues = MyArray.generatorSqr(count);
        for (int i = 0; i < count; i++) {
            assertEquals(yValues[i], i * i, 0.0001);
        }
    }

    @Test
    public void testGeneratorOdd() {
        yValues = MyArray.generatorOdd(count);
        for (int i = 0; i < count; i++) {
            assertEquals(yValues[i], (2 * i + 1), 0.0001);
        }
    }

    @Test
    public void testGeneratorDecreasingEven() {
        yValues = MyArray.generatorDecreasingEven(count);
        for (int i = 0; i < count; i++) {
            assertEquals(yValues[i], (2 * (count - i)), 0.0001);
        }
    }

    @Test
    public void testGeneratorFibonacciNumbers() {
        yValues = MyArray.generatorFibonacciNumbers(count);
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
        yValues = MyArray.generatorQuadraticEquation(1, 0, -4);

        assertEquals(yValues[0], 2, 0.0001);
        assertEquals(yValues[1], -2, 0.0001);
    }

    @Test
    public void testGeneratorNatMod3() {
        yValues = MyArray.generatorNatMod3(count);
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
        yValues = MyArray.generatorProgressAriF(count, 5, 5);
        for (int i = 0; i < count; i++) {
            assertEquals(yValues[i], (5 + 5 * i), 0.0001);
        }
    }

    @Test
    public void testGeneratorProgressGeom() {
        yValues = MyArray.generatorProgressGeom(count, 5, 5);
        for (int i = 0; i < count; i++) {
            assertEquals(yValues[i], 5 * Math.pow(5, i), 0.0001);
        }
    }

    @Test
    public void testGeneratorDeliteli() {
        yValues = MyArray.generatorDeliteli(3);

        assertEquals(yValues[0], 1, 0.0001);
        assertEquals(yValues[1], 3, 0.0001);
        assertEquals(yValues.length, 2, 0.0001);
    }

    @Test
    public void testGeneratorProstoe() {
        yValues = MyArray.generatorProstoe(20);
        assertEquals(yValues[0], 3, 0.0001);
        assertEquals(yValues.length, 7, 0.0001);
    }

    @Test
    public void testGeneratorLestnica() {
        yValues = MyArray.generatorLestnica(20);
        assertEquals(yValues[0], 1, 0.0001);
        assertEquals(yValues[19], 1, 0.0001);
        assertEquals(yValues.length, 20, 0.0001);
    }

    @Test
    public void testGeneratorMinus() {
        yValues = MyArray.generatorLestnica(20);
        MyArray.generatorMinus(yValues);
        assertEquals(yValues[0], -1, 0.0001);
        assertEquals(yValues[19], -1, 0.0001);
        assertEquals(yValues.length, 20, 0.0001);
    }

    @Test
    public void testGeneratorProverkaNaChislo() {
        yValues = MyArray.generatorLestnica(10);
        MyArray.generatorProverkaNaChislo(yValues, 5);
        assertFalse(MyArray.generatorProverkaNaChislo(yValues, 9));
        assertTrue(MyArray.generatorProverkaNaChislo(yValues, 5));
    }

    @Test
    public void testGeneratorIntNull() {
        Integer[] yValues = new Integer[]{4, 6, 3, 6, null};
        assertTrue(MyArray.generatorIntNull(yValues));
        Integer[] zValues = new Integer[]{4, 6, 3, 6, 7};
        assertFalse(MyArray.generatorIntNull(zValues));
    }

    @Test
    public void testCountChet() {
        Integer[] yValues = new Integer[]{9, 1, 3, 5, 7};
        assertEquals(MyArray.countChet(yValues), 0, 0.00001);
        Integer[] zValues = new Integer[]{4, 6, 3, 6, 7};
        assertEquals(MyArray.countChet(zValues), 3, 0.00001);
    }

    @Test
    public void testCountMax() {
        Integer[] yValues = new Integer[]{9, 1, 3, 5, 7};
        assertEquals(MyArray.countMax(yValues), 9, 0.00001);
        Integer[] zValues = new Integer[]{};
        assertNull(MyArray.countMax(zValues));
    }

    @Test
    public void testSumCountChet() {
        Integer[] yValues = new Integer[]{9, 1, 3, 5, 7};
        assertEquals(MyArray.sumCountChet(yValues), 19, 0.00001);
        Integer[] zValues = new Integer[]{4, 6, 3, 6, 7};
        assertEquals(MyArray.sumCountChet(zValues), 14, 0.00001);
    }

    @Test
    public void testBooleanCountChet() {
        Integer[] yValues = new Integer[]{9, 1, 3, 5, 1};
        assertFalse(MyArray.booleanCountChet(yValues));
        Integer[] zValues = new Integer[]{1, 6, 3, 6, 7};
        assertTrue(MyArray.booleanCountChet(zValues));
    }

    @Test
    public void testSortCountMax() {
        Integer[] yValues = new Integer[]{9, 1, 3, 5, 1};
        assertEquals(MyArray.sortCountMax(yValues), 1, 0.00001);
        Integer[] zValues = new Integer[]{1, 6, 3, 6, 7};
        assertEquals(MyArray.sortCountMax(zValues), 6, 0.00001);

    }

    @Test
    public void testProverkaFirstVhod() {
        double[] yValues = new double[]{9, 1, 3, 5, 1};
        assertEquals(MyArray.proverkaFirstVhod(yValues, 3), 2, 0.00001);
        double[] zValues = new double[]{1, 6, 3, 6, 7};
        assertEquals(MyArray.proverkaFirstVhod(zValues, 1), 0, 0.00001);
    }

    @Test
    public void testFirstOnLast() {
        double[] yValues = new double[]{9, 1, 3, 5, 1};
        MyArray.firstOnLast(yValues);
        assertEquals(yValues[0], 1, 0.00001);
        double[] zValues = new double[]{1, 6, 3, 6, 7};
        MyArray.firstOnLast(zValues);
        assertEquals(zValues[0], 7, 0.00001);
    }

    @Test
    public void testGeneratorBitMinus() {
        int[] yValues = new int[]{9, 1, 3, 5, 1};
        MyArray.generatorBitMinus(yValues);
        assertEquals(yValues[0], -10, 0.00001);
        int[] zValues = new int[]{1, 6, 3, 6, 7};
        MyArray.generatorBitMinus(zValues);
        assertEquals(zValues[0], -2, 0.00001);
        MyArray.generatorBitMinus(zValues);
        assertEquals(zValues[0], 1, 0.00001);
    }

    @Test
    public void testGeneratorArrayBitMinus() {
        int[] yValues = new int[]{9, 1, 3, 5, 1};
        int[] zValues = new int[yValues.length];
        zValues = MyArray.generatorArrayBitMinus(yValues);
        assertEquals(yValues[0], 9, 0.00001);
        assertEquals(zValues[0], -10, 0.00001);
        zValues = MyArray.generatorArrayBitMinus(zValues);
        assertEquals(zValues[0], 9, 0.00001);
    }

    @Test
    public void testGeneratorPlusTwo() {
        int[] yValues = new int[]{9, 1, 3, 5, 1};
        int[] zValues = MyArray.generatorPlusTwo(yValues);
        assertEquals(zValues[0], 10, 0.00001);
        assertEquals(zValues[2], 1, 0.00001);
        int[] oValues = new int[]{9, 1, 3, 5, 1, 6};
        int[] nValues = MyArray.generatorPlusTwo(oValues);
        assertEquals(nValues[2], 7, 0.00001);
    }

    @Test
    public void testBooleanChet() {
        Integer[] yValues = new Integer[]{9, 1, 3, 5, 1};
        assertFalse(MyArray.booleanChet(yValues)[0]);
        Integer[] zValues = new Integer[]{1, 6, 3, 6, 7};
        assertTrue(MyArray.booleanChet(zValues)[1]);
    }
}
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
}
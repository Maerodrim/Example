package ru.ssau.tk.sergunin.practoop.Generator;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ResettableIntGeneratorTest {

    @Test
    public void testReset() {
        ResettableIntGenerator FuncH = new ResettableIntGenerator();
        assertEquals(FuncH.nextInt(), 0, 0.0001);
        assertEquals(FuncH.nextInt(), 1, 0.0001);
        assertEquals(FuncH.nextInt(), 2, 0.0001);
        assertEquals(FuncH.nextInt(), 3, 0.0001);
        FuncH.reset();
        assertEquals(FuncH.nextInt(), 0, 0.0001);
    }

    @Test
    public void testNextInt(){
        IntGenerator FuncH = new ResettableIntGenerator();
        assertEquals(FuncH.nextInt(), 0, 0.0001);
        assertEquals(FuncH.nextInt(), 1, 0.0001);
        assertEquals(FuncH.nextInt(), 2, 0.0001);
        assertEquals(FuncH.nextInt(), 3, 0.0001);
    }
}
package ru.ssau.tk.sergunin.practoop.MyArray;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MyArrayTest {

    @Test
    public void testGetCount() {
        MyArray yValues= new MyArray(10);
        assertEquals(yValues.getCount(),10, 0.0001);
    }
}
package ru.ssau.tk.sergunin.practoop.Point;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointTest {

    @Test
    public void testTestToString() {
            assertEquals(new Point(1,4,3).toString(), "[1.0, 4.0, 3.0]");
            assertEquals(new Point(-1,0,5).toString(), "[-1.0, 0.0, 5.0]");
    }
}
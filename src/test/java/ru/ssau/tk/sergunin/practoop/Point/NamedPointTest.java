package ru.ssau.tk.sergunin.practoop.Point;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NamedPointTest {
    NamedPoint firstOperation = new NamedPoint();
    NamedPoint secondOperation = new NamedPoint(1, 1, 1);
    NamedPoint thirdOperation = new NamedPoint("Tocha", 1, 1, 1);

    @Test(groups = {"unit1"})
    public void testgetNamedPoint() {
        secondOperation.setNamedPoint("Gans");
        assertEquals(firstOperation.getNamedPoint(), "Origin");
        assertEquals(secondOperation.getNamedPoint(), "Gans");
        assertEquals(thirdOperation.getNamedPoint(), "Tocha");
    }
}

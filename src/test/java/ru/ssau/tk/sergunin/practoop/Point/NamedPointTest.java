package ru.ssau.tk.sergunin.practoop.Point;

import org.testng.annotations.Test;
import ru.ssau.tk.sergunin.practoop.Generator.Resettable;

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

    @Test
    public void testReset() {
        NamedPoint FuncH = new NamedPoint("Tocha", 1, 1, 1);
        FuncH.reset();
        assertEquals(FuncH.getNamedPoint(), "Absent");
    }

    @Test
    public void testToString() {
        assertEquals(new NamedPoint("x", 1, 4, 3).toString(), "x [1.0, 4.0, 3.0]");
        assertEquals(new NamedPoint(-1, 0, 5).toString(), "[-1.0, 0.0, 5.0]");
    }
}

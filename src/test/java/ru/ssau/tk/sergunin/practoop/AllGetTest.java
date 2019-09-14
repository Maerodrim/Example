package ru.ssau.tk.sergunin.practoop;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AllGetTest {

    @Test
    public void testPrintType() {
        AllGet.printType(5);
        AllGet.printType(5.);
        AllGet.printType("string");
        AllGet.printType('c');
        AllGet.printType(true);
        AllGet.printType(763098);
        AllGet.printType(5);
    }
}
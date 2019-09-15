package ru.ssau.tk.sergunin.practoop;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AllGetTest {
  //TODO
    @Test
    public void testPrintType() {
        AllGet.printType(5);
        AllGet.printType(5.);
        AllGet.printType((String)"stri");
        AllGet.printType('c');
        AllGet.printType(true);
        AllGet.printType((long) 763098);
        AllGet.printType((float) 5);
    }
}
package ru.ssau.tk.sergunin.practoop.Strings;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringsTest {

    @Test
    public void testReturnString() {
        String str ="testReturnString";
        Strings.returnString(str);
    }

    @Test
    public void testPrintBytes() {
        String str ="testПринтBytes";
        Strings.printBytes(str);
    }

    @Test
    public void testStringEquals() {
        Strings.stringEquals();
    }

    @Test
    public void testPalindromString() {
        String str ="False";
        String str2 ="TrueeurT";
        System.out.println(Strings.palindromString(str));
        System.out.println(Strings.palindromString(str2));
    }

    @Test
    public void testEqualsCaseString() {
        String firstString = "TEST";
        String secondString = "test";
        String thirdString = "false";
        assertTrue(Strings.equalsCaseString(firstString, secondString));
        assertFalse(Strings.equalsCaseString(secondString, secondString));
        assertFalse(Strings.equalsCaseString(secondString, thirdString));
        assertFalse(Strings.equalsCaseString(null, secondString));
        assertFalse(Strings.equalsCaseString(firstString, null));
        assertFalse(Strings.equalsCaseString(null, null));
    }

    @Test
    public void testPrintChars() {
        Strings.printChars();
    }
}
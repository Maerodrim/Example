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
}
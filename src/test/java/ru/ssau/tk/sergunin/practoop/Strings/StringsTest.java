package ru.ssau.tk.sergunin.practoop.Strings;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringsTest {

    @Test
    public void testReturnString() {
        String str ="testReturnString";
        Strings.returnString(str);
    }
}
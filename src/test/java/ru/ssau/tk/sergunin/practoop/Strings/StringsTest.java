package ru.ssau.tk.sergunin.practoop.Strings;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.sergunin.practoop.Matrix.Matrix;
import ru.ssau.tk.sergunin.practoop.Person.Person;
import ru.ssau.tk.sergunin.practoop.Point.NamedPoint;
import ru.ssau.tk.sergunin.practoop.Point.Point;

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

    @Test
    public void testFirstOccurrenceString() {
        String first = "Такой вот парадокс: мы совершаем подвиги для тех, кому до нас нет никакого дела, а любят нас те, кому мы нужны и без всяких подвигов...";
        String second = "Я просто выгляжу как лось, а в душе я бабочка.";
        assertEquals(Strings.firstOccurrenceString(first, "во"), 6);
        assertEquals(Strings.firstOccurrenceString(second, "ри"), -1);
    }

    @Test
    public void testIndexOfFirstEntryInSecondPartOfBase() {
        String first = "Иногда случается, что вещи теряют свой смысл. Вот смысл окна, например, чтобы в него смотреть. А порой смотришь в него, а смотреть там нечего. Ничего интересного.\n" +
                "Или вот, какой смысл умываться по утрам? Чтобы быть бодрым? А какой смысл быть по утрам бодрым? Какой вообще смысл БЫТЬ по утрам? Непонятно.\n" +
                "И непонятно, то ли жизнь всегда была бессмысленной, а ты просто не замечал этого, то ли смысл был, но куда-то затерялся.";
        String second = "А климат переменится - вот увидишь";
        assertEquals(Strings.indexOfFirstEntryInSecondPartOfBase(first, "жи"), 323);
        assertEquals(Strings.indexOfFirstEntryInSecondPartOfBase(second, "мир"), -1);
    }
    @Test
    public void testIndexOfLastEntryInFirstPartOfBase() {
        String first = "Иногда случается, что вещи теряют свой смысл. Вот смысл окна, например, чтобы в него смотреть. А порой смотришь в него, а смотреть там нечего. Ничего интересного.\n" +
                "Или вот, какой смысл умываться по утрам? Чтобы быть бодрым? А какой смысл быть по утрам бодрым? Какой вообще смысл БЫТЬ по утрам? Непонятно.\n" +
                "И непонятно, то ли жизнь всегда была бессмысленной, а ты просто не замечал этого, то ли смысл был, но куда-то затерялся.";
        String second = "А климат переменится - вот увидишь";
        assertEquals(Strings.indexOfLastEntryInFirstPartOfBase(first, "мер"), 67);
        assertEquals(Strings.indexOfLastEntryInFirstPartOfBase(first, "мон"), -1);
    }

    @Test
    public void testPreficsAndPostfics() {
        String[] strings = {"Only","a","slight","light","was","getting","into","sight"};
        assertEquals(Strings.preficsAndPostfics(strings, "s", "t"), 2);
        assertEquals(Strings.preficsAndPostfics(strings, "r", "i"), 0);
    }

    @Test
    public void testPreficsAndPostficsNoProbel() {
        String[] strings = {"    Only  ","  a  ","  slight  ","  light  "," was","getting","into","sight"};
        assertEquals(Strings.preficsAndPostfics(strings, "s", "t"), 1);
        assertEquals(Strings.preficsAndPostfics(strings, "r", "i"), 0);
    }

    @Test
    public void testRecursiveReplaceAll() {
        Assert.assertEquals(Strings.recursiveReplaceAll("opopopopo", "opo", "po"), "popppo");
    }

    @Test
    public void testExtendedSubstring() {
        String string = "imperturbability";
        assertEquals(Strings.extendedSubstring(string, -2, 18), string);
        assertEquals(Strings.extendedSubstring(string, 18, -2), "");
        assertEquals(Strings.extendedSubstring(string, 2, 18), string.substring(2));
        assertEquals(Strings.extendedSubstring(string, -2, 14), string.substring(0, 14));
        assertEquals(Strings.extendedSubstring(string, 2, 14), string.substring(2, 14));
    }
    @Test
    public void testDisplayTheObjectInConsole() {
        Matrix matrix = new Matrix(2, 2);
        matrix.setMatrixValues(0, 1, 1);
        matrix.setMatrixValues(0, 0, 2);
        matrix.setMatrixValues(1, 1, 1);
        matrix.setMatrixValues(1, 0, 2);
        Strings.printObjectInConsole(matrix);
        Strings.printObjectInConsole(new Person("James", "Hawkins", 236232));
        Strings.printObjectInConsole(new Point(1, 4, 3));
        Strings.printObjectInConsole(new NamedPoint("x", 1, 4, 3));
        Strings.printObjectInConsole(7);
        Strings.printObjectInConsole(9.);
    }

    @Test
    public void testUpperCaseSplit() {
        String first = "Такой вот парадокс: мы совершаем подвиги для тех, кому до нас нет никакого дела, а любят нас те, кому мы нужны и без всяких подвигов...";
        String second = "Я просто выгляжу как лось, а в душе я бабочка.";
        String[] firstStrings = Strings.upperCaseSplit(first);
        String[] secondStrings = Strings.upperCaseSplit(second);
        for (String string : firstStrings) {
            System.out.println(string);
        }
        for (String string : secondStrings) {
            System.out.println(string);
        }
    }

    @Test
    public void testConcatArray() {
        String[] strings = {"Я", "просто", "выгляжу", "как", "лось", "а", "в", "душе", "я", "бабочка"};
        assertEquals(Strings.concatArray(strings), "Я, просто, выгляжу, как, лось, а, в, душе, я, бабочка");
    }

    @Test
    public void testReplaceNumbersAndRevert() {
        assertEquals(Strings.replaceNumbersAndRevert("imperturbability"), "y41i21i01a8r6t4e2m0");
    }
}
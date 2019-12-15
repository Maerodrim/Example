package ru.ssau.tk.sergunin.practoop.Strings;

import org.testng.Assert;
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
}
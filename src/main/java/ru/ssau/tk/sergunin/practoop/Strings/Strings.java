package ru.ssau.tk.sergunin.practoop.Strings;

import java.nio.charset.Charset;
import java.util.Objects;

public class Strings {
    public static void returnString(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static void printBytes(String string) {
        byte[] bytes = string.getBytes();
        for (int i = 0; i < string.length(); i++) {
            System.out.println(bytes[i]);
        }
    }

    public static void stringEquals() {
        String first = "testEquals";
        String second = new String(first);
        System.out.println(first == second);
        System.out.println(first.equals(second));
    }

    public static boolean palindromString(String str) {
        for (int i = 0; i < (str.length() / 2); i++) {
            if (!(str.charAt(i) == str.charAt(str.length() - 1 - i))) return false;
        }
        return true;
    }

    public static boolean equalsCaseString(String str, String str2) {

        if (!Objects.equals(null, str) && !Objects.equals(null, str2) && !str.equals(str2) && str.equalsIgnoreCase(str2))
            return true;
        return false;
    }

    public static void printChars() {
        int i = 0;
        System.out.println("Символ\t№" + ++i);
        System.out.println("Символ\b№" + ++i);
        System.out.println("Символ\n№" + ++i);
        System.out.println("Символ\r№" + ++i);
        System.out.println("Символ\'№" + ++i);
        System.out.println("Символ\"№" + ++i);
        System.out.println("Символ\\№" + ++i);
    }

    public static int firstOccurrenceString(String str, String str2) {
        return str.indexOf(str2);
    }

    public static int indexOfFirstEntryInSecondPartOfBase(String str, String str2) {
        return str.indexOf(str2, str.length() / 2);
    }

    public static int indexOfLastEntryInFirstPartOfBase(String str, String str2) {
        return str.lastIndexOf(str2, str.length() / 2);
    }

    public static int preficsAndPostfics(String[] str, String startWith, String endsWith) {
        int value = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].startsWith(startWith) && str[i].endsWith(endsWith)) value++;
        }
        return value;
    }

    public static int preficsAndPostficsNoProbel(String[] str, String startWith, String endsWith) {
        int value = 0;
        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].trim();
        }
        return preficsAndPostfics(str, startWith, endsWith);
    }

    public static String recursiveReplaceAll(String str, String replaceable, String replacer){
        for (int i = 0; i < 100 && str.contains(replaceable); i++){
            str = str.replaceAll(replaceable, replacer);
        }
        return str;
    }

    public static String extendedSubstring(String str, int from, int to) {
        if (from >= to) return "";
        if (from < 0) from = 0;
        if (to > str.length()) to = str.length();
        return str.substring(from, to);
    }

    public static void printObjectInConsole(Object obj) {
        System.out.println(obj);
    }

    public static String[] upperCaseSplit(String string) {
        String[] strings = string.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (!strings[i].isEmpty()) {
                strings[i] = strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1);
            }
        }
        return strings;
    }

    public static String concatArray(String[] array) {
        return String.join(", ", array);
    }

    public static String replaceNumbersAndRevert(String string) {
        StringBuilder builder = new StringBuilder(string);
        int j = -2;
        int t;
        for (int i = 0; i < string.length(); i += 2) {
            j += 2;
            builder.replace(j, j + 1, i + "");
            t = j;
            while (t > 9) {
                t /= 10;
                j++;
            }
        }
        return builder.reverse().toString();
    }

    public static String getStrEnumOfNumsInAscOrder(int to) throws IllegalArgumentException{
        if (to < 0) {
            throw new IllegalArgumentException();
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < to; i++) {
            builder.append(i);
        }
        return builder.toString();
    }

    public static void printDefaultCharset() {
     System.out.println(java.nio.charset.Charset.defaultCharset());
    }

    public static void defaultCharsetToCharset(String str, Charset one, Charset two) {
      String str2 = new String(str.getBytes(one),two);
        System.out.println(java.nio.charset.Charset.defaultCharset());
        System.out.println(str2);
    }
}

package ru.ssau.tk.sergunin.practoop.Strings;

public class Strings {
    public static void returnString(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void printBytes(String string) {
        byte[] bytes = string.getBytes();
        for (int i = 0; i < string.length(); i++) {
            System.out.println(bytes[i]);
        }
    }
    public static void stringEquals(){
        String first = "testEquals";
        String second = new String(first);
        System.out.println(first == second);
        System.out.println(first.equals(second));
    }
}

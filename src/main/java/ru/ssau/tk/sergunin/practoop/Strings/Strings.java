package ru.ssau.tk.sergunin.practoop.Strings;

import java.util.Objects;

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
    public static boolean palindromString(String str){
        for(int i=0;i<(str.length()/2);i++){
            if(!(str.charAt(i)==str.charAt(str.length()-1-i))) return false;
        }
        return true;
    }
    public static boolean equalsCaseString(String str,String str2){

        if(!Objects.equals(null, str) && !Objects.equals(null, str2)&&!str.equals(str2) && str.equalsIgnoreCase(str2)) return true;
        return false;
    }
}

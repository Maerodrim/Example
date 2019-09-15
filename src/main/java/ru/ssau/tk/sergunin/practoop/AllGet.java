package ru.ssau.tk.sergunin.practoop;

public class AllGet {
    private AllGet() {
        ;
    }

    public static void printType(byte x) {
        System.out.println("byte");
    }

    public static void printType(boolean x) {
        System.out.println("boolean");
    }

    public static void printType(double x) {
        System.out.println("double");
    }

    public static void printType(int x) {
        System.out.println("int");
    }

    public static void printType(char x) {
        System.out.println("char");
    }

    public static void printType(long x) {
        System.out.println("long");
    }

    public static void printType(float x) {
        System.out.println("float");
    }

    public static void printType(short x) {
        System.out.println("short");
    }

    public static void printType(Object x) {
        if (x == null) {
            System.out.println("null");
        } else {
            x.getClass();
        }
    }

}

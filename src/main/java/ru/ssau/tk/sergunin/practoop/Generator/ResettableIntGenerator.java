package ru.ssau.tk.sergunin.practoop.Generator;

public class ResettableIntGenerator implements IntGenerator, Resettable {
    public void reset() {
        x = 0;
    }

    ;
    private int x;

    public int nextInt() {
        return x++;
    }
}

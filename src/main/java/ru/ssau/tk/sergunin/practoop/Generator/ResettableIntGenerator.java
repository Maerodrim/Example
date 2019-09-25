package ru.ssau.tk.sergunin.practoop.Generator;

public class ResettableIntGenerator implements IntGenerator, Resettable {
    private int x;

    public void reset() {
        x = 0;
    }

    public int nextInt() {
        return x++;
    }
}

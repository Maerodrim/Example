package ru.ssau.tk.sergunin.practoop.Generator;

public class IntGeneratorImpl implements IntGenerator{
    private int x=0;
    public int nextInt() {
        return x++;
    }

}

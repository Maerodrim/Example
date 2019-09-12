package ru.ssau.tk.sergunin.practoop.Operation;

public abstract class Operation {
    public abstract double apply(double number);

    double applyTriple(double number) {
        for (int i = 0; i < 3; i++) {
            number = apply(number);
        }
        return number;
    }

}

package ru.ssau.tk.sergunin.practoop.Point;

import ru.ssau.tk.sergunin.practoop.Generator.Resettable;

public class NamedPoint extends Point implements Resettable {
    private String name;

    public NamedPoint(String name, double pointX, double pointY, double pointZ) {
        super(pointX, pointY, pointZ);
        this.name = name;
    }

    public NamedPoint(double pointX, double pointY, double pointZ) {
        super(pointX, pointY, pointZ);
    }

    public String getNamedPoint() {
        return name;
    }


    public String setNamedPoint(String name) {
        this.name = name;
        return name;
    }


    public NamedPoint() {
        this("Origin", 0., 0., 0.);
    }

    public void reset() {
        name = "Absent";
    }
}

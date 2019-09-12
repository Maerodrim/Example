package ru.ssau.tk.sergunin.practoop.Point;

public class Points {
    private Points() {
        ;
    }

    public static Point sum(Point a, Point b) {
        return new Point((a.pointX + b.pointX), (a.pointY + b.pointY), (a.pointZ + b.pointZ));
    }

    public static Point subtract(Point a, Point b) {
        return new Point((a.pointX - b.pointX), (a.pointY - b.pointY), (a.pointZ - b.pointZ));
    }

    public static Point multiply(Point a, Point b) {
        return new Point((a.pointX * b.pointX), (a.pointY * b.pointY), (a.pointZ * b.pointZ));
    }

    public static Point divide(Point a, Point b) {
        return new Point((a.pointX / b.pointX), (a.pointY / b.pointY), (a.pointZ / b.pointZ));
    }

    public static Point enlarge(Point a, double b) {
        return new Point((a.pointX * b), (a.pointY * b), (a.pointZ * b));
    }

    public static Point opposite(Point a) {
        return new Point((-a.pointX), (-a.pointY), (-a.pointZ));
    }

    public static Point inverse(Point a) {
        return new Point((1 / a.pointX), (1 / a.pointY), (1 / a.pointZ));
    }

    public static double scalarProduct(Point a, Point b) {
        return ((a.pointX * b.pointX) + (a.pointY * b.pointY) + (a.pointZ * b.pointZ));
    }

    public static Point vectorProduct(Point a, Point b) {
        return new Point(a.pointY * b.pointZ - a.pointZ * b.pointY, a.pointZ * b.pointX - a.pointX * b.pointZ, a.pointX * b.pointY - a.pointY * b.pointX);
    }
}


package ru.ssau.tk.sergunin.practoop.Point;

public class Point  {
    public final double pointX;
    public final double pointY;
    public final double pointZ;
    public final double length = length(this);
    public Point (double pointX , double pointY , double pointZ){
        this.pointX=pointX;
        this.pointY=pointY;
        this.pointZ=pointZ;
    }
    public static double length(Point a){ return (Math.sqrt(a.pointX*a.pointX+a.pointY*a.pointY+a.pointZ*a.pointZ));}
}

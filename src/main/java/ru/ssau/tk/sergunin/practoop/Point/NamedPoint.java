package ru.ssau.tk.sergunin.practoop.Point;

public class NamedPoint extends Point {
    private String Name;
    public NamedPoint ( String Name, double pointX , double pointY , double pointZ){
        super(pointX, pointY, pointZ);
        this.Name=Name;
    }
    public NamedPoint (double pointX , double pointY , double pointZ){
        super(pointX, pointY, pointZ);
    }
    public String  getNamedPoint(){return Name;};
    public String setNamedPoint(String Name){
        this.Name=Name;
        return Name;
    };
    public NamedPoint (){
        this("Origin",0.,0.,0.);
    }
}

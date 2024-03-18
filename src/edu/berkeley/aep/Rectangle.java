package edu.berkeley.aep;


public class Rectangle {
    int length;
    int width;

    public static Rectangle createSquare(int side){
        return new Rectangle(side,side);
    }

    public Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }
    public int area() {
        return length*width;
    }
}

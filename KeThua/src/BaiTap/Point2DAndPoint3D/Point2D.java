package BaiTap.Point2DAndPoint3D;

import java.util.Arrays;

public class Point2D {
    private float x ;
    private float y;

    public Point2D(float x, float  y) {
        this.x = x;
        this.y = y;
    }
    public Point2D(){

    }
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY() {
        float arr [] = {this.x,this.y};
        return arr;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public void display(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "(" +
                "x: " + x +
                ", y: " + y +
                ')';
    }

}

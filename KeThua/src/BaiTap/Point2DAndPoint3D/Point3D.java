package BaiTap.Point2DAndPoint3D;

import java.util.Arrays;

public class Point3D extends Point2D {
    public float z ;

    public Point3D(float x,float y,float z) {
        super(x,y);
        this.z = z;
    }

    public Point3D() {

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ() {
        float arr [] = {this.getX(),this.getY(),this.z};
        return arr;
    }

    public void setXYZ(float z) {
        this.z = z;
    }
    public void display(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return Arrays.toString(getXYZ());
    }
}

package BaiTap.ClassCircleAndCylinder;

public class Cylinder extends Circle{
    private double height = 7;
    public Cylinder(){

    }
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight(double height) {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume(){
        return Math.pow(this.getRadius(),2) * Math.PI * this.height;
    }
    void display(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", volume=" + volume() +
                '}';
    }
}

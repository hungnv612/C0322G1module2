package BaiTap.ClassCircleAndCylinder;

public class Circle {
    private double radius=6;
    private String color="red";

    public Circle(){

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double Acreage(){
        return Math.pow(this.radius,2) * Math.PI;
    }
    void display(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", Acreage=" + Acreage() +
                ", color='" + color + '\'' +
                '}';
    }
}

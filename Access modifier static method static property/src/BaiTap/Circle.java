package BaiTap;

public class Circle {
    private double radius =1.0;
    private String color="red";
    public  Circle(){

    }

    public Circle(double radius, String color) {
        this.radius=radius;
        this.color=color;
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
    public double getArea(){
        return (this.radius * this.radius)*Math.PI;
    }
    void display(){
        System.out.println("Bán kính: " + this.radius);
        System.out.println("Màu: "+ this.color);
        System.out.println("Area: "+ getArea());
    }
}

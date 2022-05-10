package BaiTap.AccessModifier;

import BaiTap.AccessModifier.Circle;

import java.util.Scanner;

public class MainCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle= new Circle();
        circle.display();
        System.out.println("----------------------");
        System.out.println("Nhập bán kính");
        double radius = scanner.nextDouble();
        System.out.println("Nhập Màu của hình tròn");
        String color = scanner.next();
        circle.setRadius(radius);
        circle.setColor(color);
        circle.display();
    }
}

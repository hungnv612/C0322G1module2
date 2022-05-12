package BaiTap.ClassCircleAndCylinder;

import java.util.Scanner;

public class MainCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new  Cylinder();
        Scanner scanner = new Scanner(System.in);
        cylinder.display();
        System.out.println("Nhập height: ");
        double height = scanner.nextDouble();
        cylinder.setHeight(height);
        cylinder.display();
    }
}

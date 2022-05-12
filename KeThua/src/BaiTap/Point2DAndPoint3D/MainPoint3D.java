package BaiTap.Point2DAndPoint3D;

import java.util.Scanner;

public class MainPoint3D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point3D point3D = new Point3D();
        point3D.display();
        System.out.println("---------------------------");
        System.out.println("nhập X ");
        float x = scanner.nextFloat();
        System.out.println("nhập y ");
        float y = scanner.nextFloat();
        System.out.println("nhập z ");
        float z = scanner.nextFloat();
        point3D.setX(x);
        point3D.setY(y);
        point3D.setZ(z);
        point3D.display();
    }
}
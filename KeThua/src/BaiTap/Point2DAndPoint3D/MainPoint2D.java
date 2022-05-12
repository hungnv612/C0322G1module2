package BaiTap.Point2DAndPoint3D;

import java.util.Scanner;

public class MainPoint2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point2D point2D = new Point2D();
        point2D.display();
        System.out.println("---------------------------");
        System.out.println("nhập X ");
        float x = scanner.nextFloat();
        System.out.println("nhập y ");
        float y = scanner.nextFloat();
        point2D.setX(x);
        point2D.setY(y);
        point2D.display();
    }
}

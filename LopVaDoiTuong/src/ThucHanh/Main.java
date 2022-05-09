package ThucHanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập width");
        double width = scanner.nextDouble();
        System.out.println("Nhập height");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println(rectangle.display());
        System.out.println("chu vi: "+rectangle.getPerimeter());
        System.out.println("diện tích: "+rectangle.getArea());

    }
}

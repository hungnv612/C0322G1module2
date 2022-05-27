package BaiTap.ClassIllegalTriangleException;

import java.util.Scanner;

public class MainCheck {
    
    public static void main(String[] args) {
        boolean flag;
        Scanner scanner = new Scanner(System.in);
        do {
            flag = false;
            System.out.println("Nhập 3 cạnh tam giác");
            try {
                System.out.println("Nhập cạnh thứ nhất ");
                double edge1 = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập cạnh thứ hai ");
                double edge2 = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập cạnh thứ ba ");
                double edge3 = Double.parseDouble(scanner.nextLine());
                checkEdge(edge1, edge2, edge3);
            } catch (NumberFormatException e) {
                System.out.println("ko dc nhập ký tự");
                flag = true;
//                System.exit(0);
            } catch (IllegalTriangleException e) {
                System.out.println("Nhập lại");
                System.out.println("-------------------------");
                flag = true;
            }

//            finally {
//                System.out.println("chạy");
//            }
        } while (flag);
    }

    public static void checkEdge(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Cạnh tam giác phải lớn hơn 0");
        } else if (a + b <= c || b + c <= a || a + c <= b) {
            throw new IllegalTriangleException("tổng 2 cạnh phải lớn hơn cạnh còn lại");
        } else {
            System.out.println("đã NHập đúng");
        }
    }
}

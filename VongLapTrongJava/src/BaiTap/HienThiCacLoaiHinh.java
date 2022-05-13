package BaiTap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        int cao;
        int rong;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. In hình chữ nhật");
            System.out.println("2. In hình tam giác vuông");
            System.out.println("3. In hình tam giác cân");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhap chiều cao");
                    cao = input.nextInt();
                    System.out.println("Nhap chiều rồng");
                    rong = input.nextInt();
                    for (int i = 0; i < cao; i++) {
                        for (int j = 0; j < rong; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("1. In hình tam giác vuông botton-left");
                    System.out.println("2. In hình tam giác vuông top-left");
                    System.out.println("Enter your choice: ");
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Nhap chiều cao");
                            cao = input.nextInt();
                            for(int i=1; i<=cao; i++) {
                                for (int j = 1; j < i; j++){
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            System.out.println("Nhap chiều rong");
                            rong= input.nextInt();
                            for(int i=rong;i>=1;i--) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                    }
                    break;
                case 3:
                    System.out.printf("Nhập vào chiều cao của kim tự tháp: ");
                    cao = input.nextInt();
                    int k=0;
                    for (int i = 1; i <= cao; ++i, k = 0) {
                        for (int j = 1; j <= cao - i; ++j) {
                            System.out.print("  ");
                        }
                        while (k != 2 * i - 1) {
                            System.out.print("* ");
                            ++k;
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}

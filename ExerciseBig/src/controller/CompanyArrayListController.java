package controller;

import service.CompanyManagerArrayList;

import java.util.Scanner;

public class CompanyArrayListController {
    public static Scanner scanner = new Scanner(System.in);
    static CompanyManagerArrayList companyManagerArrayList = new CompanyManagerArrayList();

    public static void menu() {
        while (true) {
            System.out.println("-------------------------");
            System.out.println(" Quản lý Nhân viên");
            System.out.println(" 1.Danh sách Nhân viên ALL");
            System.out.println(" 2.Danh sách Nhân viên Công nhật");
            System.out.println(" 3.Danh sách Nhân viên Quản Lý");
            System.out.println(" 4.Danh sách Nhân viên Sản xuất");
            System.out.println(" 5.Sắp xếp theo Tên");
            System.out.println(" 6.Sắp xếp theo lương");
            System.out.println(" 0.Thoát chương trình");
            System.out.println("Chọn option: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    companyManagerArrayList.displayArrayList();
                    break;
                case 2:
                    companyManagerArrayList.displayNVCongNhat();
                    break;
                case 3:
                    companyManagerArrayList.displayNVQuanLy();
                    break;
                case 4:
                    companyManagerArrayList.displayNVSanXuat();
                    break;
                case 5:
                    companyManagerArrayList.sapXepTheoName();
                    break;
                case 6:
                    companyManagerArrayList.sapXepTheoLuong();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập lại");
                    break;
            }
        }
    }
}

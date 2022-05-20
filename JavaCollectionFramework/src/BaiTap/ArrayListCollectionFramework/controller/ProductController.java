package BaiTap.ArrayListCollectionFramework.controller;

import BaiTap.ArrayListCollectionFramework.service.ProductManager;

import java.util.Scanner;

public class ProductController {
    public static Scanner scanner = new Scanner(System.in);
    static ProductManager productManager = new ProductManager();

    public static void menu()  {
        while (true) {
            System.out.println("-------------------------");
            System.out.println(" Quản lý sản phẩm");
            System.out.println(" 1.Danh sách sản phẩm");
            System.out.println(" 2.Thêm sản phẩm");
            System.out.println(" 3.Xóa sản phẩm");
            System.out.println(" 4.Update sản phẩm");
            System.out.println(" 5.Tìm kiếm sản phẩm");
            System.out.println(" 6.Sắp xếp sản phẩm");
            System.out.println(" 0.Thoát chương trình");
            System.out.println("Chọn option: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    productManager.display();
                    break;
                case 2:
                    productManager.add();
                    break;
                case 3:
                    productManager.delete();
                    break;
                case 4:
                    productManager.update();
                    break;
                case 5:
                    productManager.search();
                    break;
                case 6:
                    System.out.println("----------------------------");
                    System.out.println(" 1.Xắp xếp theo giá tăng dần");
                    System.out.println(" 2.Xắp xếp theo giá giảm dần");
                    System.out.println(" 3.Xắp xếp ID");
                    System.out.println("Chọn option: ");
                    int chooseIn = Integer.parseInt(scanner.nextLine());
                    switch (chooseIn) {
                        case 1:
                            productManager.sortUp();
                            break;
                        case 2:
                            productManager.sortLow();
                            break;
                        case 3:
                            productManager.sortId();
                            break;
                        default:
                            System.out.println("Nhập lại");
                            break;
                    }
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


package controllers;

import services.Impl.ManageServiceImpl;
import services.Impl.ProductionServiceImpl;

import java.util.Scanner;

public class menu {
    static Scanner scanner = new Scanner(System.in);
    static ProductionServiceImpl productionService = new ProductionServiceImpl();
    static ManageServiceImpl manageService = new ManageServiceImpl();

    public static void main(String[] args) {
        do {
            try {
                System.out.println("Menu\n" +
                        "1. Thêm mới quản lý hoặc nhân viên\n" +
                        "2. Xóa quản lý hoặc nhân viên\n" +
                        "3. Xem danh sách quản lý hoặc nhân viên\n" +
                        "4. Tìm kiếm quản lý hoặc nhân viên\n" +
                        "5. Exit");
                int choice;
                System.out.println("Nhấn để chọn chức năng");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        add();
                        break;
                    case 2:
                        delete();
                        break;
                    case 3:
                        display();
                        break;
                    case 4:
                        search();
                        break;
                    case 5:
                        System.err.println("Kết thúc chương trình");
                        System.exit(0);
                    default:
                        System.err.println("Chức năng này hiện ko có");
                }
            } catch (NumberFormatException e) {
                System.err.println("Sai định dạng mời nhập lại");
            }
        } while (true);
    }

    public static void add() {
        do {
            try {
                System.out.println("1.Add new Manage\n" +
                        "2.Add new Production\n" +
                        "3.Return main menu");
                System.out.println("Nhập để chọn tính năng: ");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("====Add new Manage====");
                        manageService.add();
                        break;
                    case 2:
                        System.out.println("====Add new Production====");
                        productionService.add();
                        break;
                    case 3:
                        return;
                    default:
                        System.err.println("Chức năng này hiện ko có");
                }
            } catch (Exception e) {
                System.err.println("Sai định dạng mời nhập lại");
            }
        } while (true);
    }

    public static void delete() {
        do {
            try {
                System.out.println("1.Delete Manage\n" +
                        "2.Delete Production\n" +
                        "3.Return main menu");
                System.out.println("Nhập để chọn tính năng: ");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("====Delete Manage====");
                        manageService.delete();
                        break;
                    case 2:
                        System.out.println("====Delete Production====");
                        productionService.delete();
                        break;
                    case 3:
                        return;
                    default:
                        System.err.println("Chức năng này hiện ko có");
                }
            } catch (Exception e) {
                System.err.println("Sai định dạng mời nhập lại");
            }
        } while (true);
    }

    public static void display() {
        do {
            try {
                System.out.println("1.Display Manage\n" +
                        "2.Display Production\n" +
                        "3.Display ALL\n" +
                        "4.Return main menu");
                System.out.println("Nhập để chọn tính năng: ");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("====Display Manage====");
                        manageService.display();
                        break;
                    case 2:
                        System.out.println("====Display Production====");
                        productionService.display();
                        break;
                    case 3:
                        System.out.println("====Display ALL====");
                        manageService.display();
                        productionService.display();
                        break;
                    case 4:
                        return;
                    default:
                        System.err.println("Chức năng này hiện ko có");
                }
            } catch (Exception e) {
                System.err.println("Sai định dạng mời nhập lại");
            }
        } while (true);
    }

    public static void search() {
        do {
            try {
                System.out.println("1.Search Manage\n" +
                        "2.Search Production\n" +
                        "3.Return main menu");
                System.out.println("Nhập để chọn tính năng: ");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("====search Manage====");
                        manageService.search();
                        break;
                    case 2:
                        System.out.println("====search Production====");
                        productionService.search();
                        break;
                    case 3:
                        return;
                    default:
                        System.err.println("Chức năng này hiện ko có");
                }
            } catch (Exception e) {
                System.err.println("Sai định dạng mời nhập lại");
            }
        } while (true);
    }
}

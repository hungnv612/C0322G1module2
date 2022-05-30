package controllers;


import services.ImpI.EmployeeServiceIpl;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);
    public static EmployeeServiceIpl employeeServiceIpl = new EmployeeServiceIpl();

    public static void displayMainMenu() {
        do {
            try {
                System.out.println("Menu\n" +
                        "1. Employee Management\n" +
                        "2. Customer Management\n" +
                        "3. Facility Management\n" +
                        "4. Booking Management\n" +
                        "5. Promotion Management\n" +
                        "6. Exit");
                int choice;
                System.out.println("Nhấn để chọn chức năng");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        displayEmployee();
                        break;
                    case 2:
                        displayCustomer();
                        break;
                    case 3:
                        displayFacility();
                        break;
                    case 4:
                        displayBooking();
                        break;
                    case 5:
                        displayPromotion();
                        break;
                    case 6:
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

    public static void displayEmployee() {
        do {
            try {
                System.out.println("1.Display list employees\n" +
                        "2.Add new employee\n" +
                        "3.Edit employee\n" +
                        "4.Return main menu");
                System.out.println("Nhập để chọn tính năng: ");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("====Display list employees====");
                        employeeServiceIpl.display();
                        break;
                    case 2:
                        System.out.println("====Add new employee====");
                        employeeServiceIpl.add();
                        break;
                    case 3:
                        System.out.println("====Edit employee====");
                        employeeServiceIpl.update();
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

    public static void displayCustomer() {
        do {
            try {
                System.out.println("1.Display list customers\n" +
                        "2.Add new customer\n" +
                        "3.Edit customer\n" +
                        "4.Return main menu\n");
                System.out.println("Nhập để chọn tính năng: ");
                int choose1 = Integer.parseInt(scanner.nextLine());
                switch (choose1) {
                    case 1:
                        System.out.println("====Display list customers====");

                        break;
                    case 2:
                        System.out.println("====Add new customer====");

                        break;
                    case 3:
                        System.out.println("====Edit customer====");

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

    public static void displayFacility() {
        do {
            try {
                System.out.println("1.Display list facility\n" +
                        "2.Add new facility\n" +
                        "3.Display list facility maintenance\n" +
                        "4.Return main menu\n");
                System.out.println("Nhập để chọn tính năng: ");
                int choose2 = Integer.parseInt(scanner.nextLine());
                switch (choose2) {
                    case 1:
                        System.out.println("====Display list facility====");

                        break;
                    case 2:
                        System.out.println("====Add new facility====");

                        break;
                    case 3:
                        System.out.println("====Display list facility maintenance====");

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

    public static void displayBooking() {
        do {
            try {
                System.out.println("1.Add new booking\n" +
                        "2.Display list booking\n" +
                        "3.Create new contracts\n" +
                        "4.Display list contracts\n" +
                        "5.Edit contracts\n" +
                        "6.Return main menu");
                System.out.println("Nhập để chọn tính năng: ");
                int choose3 = Integer.parseInt(scanner.nextLine());
                switch (choose3) {
                    case 1:

                        System.out.println("====Add new booking====");
                        break;
                    case 2:

                        System.out.println("====Display list booking==== ");
                    case 3:

                        System.out.println("====Create new contracts====");
                        break;
                    case 4:
                        System.out.println("====Display list contracts====");
                        break;
                    case 5:
                        System.out.println("====Edit contracts====");
                        break;
                    case 6:
                        return;
                    default:
                        System.err.println("Chức năng này hiện ko có");
                }
            } catch (Exception e) {
                System.err.println("Sai định dạng mời nhập lại");
            }
        } while (true);
    }

    public static void displayPromotion() {
        do {
            try {
                System.out.println("1.Display list customers use service\n" +
                        "2.Display list customers get voucher\n" +
                        "3.Return main menu");
                System.out.println("Nhập để chọn tính năng: ");
                int choose4 = Integer.parseInt(scanner.nextLine());
                switch (choose4) {
                    case 1:
                        System.out.println("====Display list customers use service====");
                        break;
                    case 2:
                        System.out.println("====Display list customers get voucher====");
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

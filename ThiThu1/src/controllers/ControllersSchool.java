package controllers;

import java.util.Scanner;

public class ControllersSchool {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            try {
                System.out.println("Menu\n" +
                        "1. Thêm mới giảng viên hoặc học sinh\n" +
                        "2. Xóa giảng viên hoặc học sinh\n" +
                        "3. Xem danh sách giảng viên hoặc học sinh\n" +
                        "4. Tìm kiếm giảng viên hoặc học sinh\n" +
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
                System.out.println("1.Add new Student\n" +
                        "2.Add new Teacher\n" +
                        "3.Return main menu");
                System.out.println("Nhập để chọn tính năng: ");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("====Add new Student====");

                        break;
                    case 2:
                        System.out.println("====Add new Teacher====");

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
                System.out.println("1.Delete Student\n" +
                        "2.Delete Teacher\n" +
                        "3.Return main menu");
                System.out.println("Nhập để chọn tính năng: ");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("====Delete Student====");

                        break;
                    case 2:
                        System.out.println("====Delete Teacher====");

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
                System.out.println("1.Display Student\n" +
                        "2.Display Teacher\n" +
                        "3.Display ALL\n" +
                        "4.Return main menu");
                System.out.println("Nhập để chọn tính năng: ");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("====Display Student====");

                        break;
                    case 2:
                        System.out.println("====Display Teacher====");

                        break;
                    case 3:
                        System.out.println("====Display ALL====");

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
                System.out.println("1.Search Student\n" +
                        "2.Search Teacher\n" +
                        "3.Return main menu");
                System.out.println("Nhập để chọn tính năng: ");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("====search Student====");

                        break;
                    case 2:
                        System.out.println("====search Teacher====");

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




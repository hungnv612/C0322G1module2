package controller;



import service.StudentService;
import service.StudentServiceImpl;

import java.util.Scanner;

public class StudentController {

    public static Scanner scanner = new Scanner(System.in);
    //      Dependency Injection
    static StudentService studentService = new StudentServiceImpl();

    public static void menu() {
        while (true) {
            System.out.println(" Quản lý học sinh");
            System.out.println(" 1.Danh sách học sinh");
            System.out.println(" 2.Thêm học sinh");
            System.out.println(" 3.Xóa học sinh");
            System.out.println(" 4.Tìm kiếm học sinh");
            System.out.println(" 0.Thoát chương trình");
            System.out.println("Chọn option: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    studentService.displayListStudent();
                    break;
                case 2:
                    studentService.addNewStudent();
                    break;
                case 3:
                    studentService.removeStudent();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Nhap lai");
                    break;
            }
        }
    }
}

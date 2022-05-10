package BaiTap.ClassJava;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student=new Student();
        student.display();
        System.out.println("-------------------");
        System.out.println("Nhập Tên ");
        String name = scanner.next();
        System.out.println("Nhập lớp ");
        String classes = scanner.next();
        student.setName(name);
        student.setClasses(classes);
        student.display();
    }
}

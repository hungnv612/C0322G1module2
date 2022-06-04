package services.Impl;

import models.Student;
import services.StudentServices;
import until.SaveAndDisplayData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentServicesImpl implements StudentServices {
    private static Scanner scanner = new Scanner(System.in);
    String link = "src/Data/Student.csv";
    List<String[]> list = new ArrayList<>();
    List<Student> studentList = new ArrayList<>();

    @Override
    public void display() {
        readFiles();
        System.out.println("Danh sách ");
        for (Student item : studentList) {
            System.out.println(item);
        }
    }

    @Override
    public void add() throws IOException {
        readFiles();
        System.out.print("Nhập tên học sinh: ");
        String name = scanner.nextLine();

        System.out.print("Nhập ngày sinh học sinh: ");
        String date = scanner.nextLine();

        System.out.print("Nhập giới tính học sinh: ");
        String gender = scanner.nextLine();

        System.out.print("Nhập lớp của học sinh: ");
        String classMe = scanner.nextLine();

        System.out.print("Nhập điểm của học sinh: ");
        Double num = Double.parseDouble(scanner.nextLine());

        int max = 0;
        int id = 0;
        if (studentList.size() == 0) {
            id = 1;
        } else {
            for (Student item : studentList) {
                if (item.getId() > max ) {
                    max = item.getId();
                }
            }
            id = max + 1;
        }
        Student student = new Student(id, name, date, gender, classMe, num);
        studentList.add(student);

        String line = student.getLine();

        SaveAndDisplayData.writeFile(link,line);
        System.out.println("Thêm thành công");


    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void search() {

    }

    void readFiles() {
        list = SaveAndDisplayData.readerFile(link);
        studentList.clear();
        for (String[] item : list) {
            Student student = new Student(Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    Double.parseDouble(item[5]));
            studentList.add(student);
        }
    }
}

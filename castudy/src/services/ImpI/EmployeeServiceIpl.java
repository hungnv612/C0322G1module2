package services.ImpI;


import models.Employee;
import services.EmployeeService;
import until.EmployeeUntil;
import until.SaveAndDisplayData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceIpl implements EmployeeService {
    private static Scanner scanner = new Scanner(System.in);
    String link = "src/Data/EmployeeData";
    List<String[]> list = new ArrayList<>();
    List<Employee> employeeList = new ArrayList<>();

    @Override
    public void display() {
        list = SaveAndDisplayData.readerFile("src/Data/EmployeeData");
        employeeList.clear();
        for (String[] item : list) {
            Employee employee = new Employee(Integer.parseInt(item[0]), item[1], item[2], Integer.parseInt(item[3]), Integer.parseInt(item[4]), item[5], item[6], item[7], Float.parseFloat(item[8]));
            employeeList.add(employee);
        }
        System.out.println("Danh sách ");
        for (Employee item : employeeList) {
            System.out.println(item);
        }
    }

    @Override
    public void add() throws IOException {
        list = SaveAndDisplayData.readerFile("src/Data/EmployeeData");
        employeeList.clear();
        for (String[] item : list) {
            Employee employee = new Employee(Integer.parseInt(item[0]), item[1], item[2], Integer.parseInt(item[3]), Integer.parseInt(item[4]), item[5], item[6], item[7], Float.parseFloat(item[8]));
            employeeList.add(employee);
        }
        System.out.print("Nhập mã số nhân viên nhân viên: ");
        int code = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập họ tên nhân viên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập giới tính nhân viên: ");
        String gender = scanner.nextLine();

        System.out.print("Nhập số điện thoại: ");
        int phone = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập Email: ");
        String email = scanner.nextLine();

        System.out.print("Nhập lương nhân viên: ");
        int salary = Integer.parseInt(scanner.nextLine());
        int max = 0;
        int id = 0;
        if (employeeList.size() == 0) {
            id = 1;
        } else {
            for (Employee item: employeeList) {
                if (item.getId()>max){
                    max=item.getId();
                }
            }
            id = max+1;
            System.out.println(id);
        }
        Employee employee = new Employee(code, name, gender, id, phone, email, EmployeeUntil.level(), EmployeeUntil.location(), salary);
        employeeList.add(employee);
        String line = "";
        for (int i = 0; i < employeeList.size(); i++) {
            line += employeeList.get(i).getCode()
                    + "," + employeeList.get(i).getFullName()
                    + "," + employeeList.get(i).getGenDer()
                    + "," + employeeList.get(i).getId()
                    + "," + employeeList.get(i).getNumberPhone()
                    + "," + employeeList.get(i).getEmail()
                    + "," + employeeList.get(i).getLevel()
                    + "," + employeeList.get(i).getLocation()
                    + "," + employeeList.get(i).getSalary() + "\n";
        }
        SaveAndDisplayData.writeFile("src/Data/EmployeeData", line);
        System.out.println("Thêm thành công");
    }

    @Override
    public void update() throws IOException {
        list = SaveAndDisplayData.readerFile("src/Data/EmployeeData");
        employeeList.clear();
        for (String[] item : list) {
            Employee employee = new Employee(Integer.parseInt(item[0]), item[1], item[2], Integer.parseInt(item[3]), Integer.parseInt(item[4]), item[5], item[6], item[7], Float.parseFloat(item[8]));
            employeeList.add(employee);
        }
        System.out.println("Nhập ID cần update");
        boolean check = false;
        int index = 0;
        int idUpdate = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == idUpdate) {
                check = true;
                index = i;
                break;
            }
        }
        if (check) {
            System.out.print("Nhập mã số nhân viên nhân viên: ");
            int code = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập họ tên nhân viên: ");
            String name = scanner.nextLine();
            System.out.print("Nhập giới tính nhân viên: ");
            String gender = scanner.nextLine();
            System.out.print("Nhập số điện thoại: ");
            int phone = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập Email: ");
            String email = scanner.nextLine();
            String level = EmployeeUntil.level();
            String location = EmployeeUntil.location();
            System.out.print("Nhập lương nhân viên: ");
            int salary = Integer.parseInt(scanner.nextLine());

            employeeList.get(index).setCode(code);
            employeeList.get(index).setFullName(name);
            employeeList.get(index).setGenDer(gender);
            employeeList.get(index).setNumberPhone(phone);
            employeeList.get(index).setEmail(email);
            employeeList.get(index).setLevel(level);
            employeeList.get(index).setLocation(location);
            employeeList.get(index).setSalary(salary);

            String line = "";
            for (int i = 0; i < employeeList.size(); i++) {
                line += employeeList.get(i).getCode()
                        + "," + employeeList.get(i).getFullName()
                        + "," + employeeList.get(i).getGenDer()
                        + "," + employeeList.get(i).getId()
                        + "," + employeeList.get(i).getNumberPhone()
                        + "," + employeeList.get(i).getEmail()
                        + "," + employeeList.get(i).getLevel()
                        + "," + employeeList.get(i).getLocation()
                        + "," + employeeList.get(i).getSalary() + "\n";
            }
            SaveAndDisplayData.writeFile("src/Data/EmployeeData", line);
            System.out.println("update thành công");
        } else {
            System.out.println("ID ko tồn tại");
        }

    }

}

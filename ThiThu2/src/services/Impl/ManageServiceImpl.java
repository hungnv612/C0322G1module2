package services.Impl;

import models.Manage;
import services.ManageService;
import until.Regex;
import until.SaveAndDisplayData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageServiceImpl implements ManageService {
    private static Scanner scanner = new Scanner(System.in);
    String link = "src/Data/manageData.csv";
    List<String[]> list = new ArrayList<>();
    List<Manage> manageList = new ArrayList<>();

    @Override
    public void add() throws IOException {
        readFiles();

        String code;
        do {
            System.out.print("Nhập mã nv quản lý: (theo định dạng VIP-*****)* là số");
            code = scanner.nextLine();
            if (Regex.codeQl(code)) {
                break;
            } else {
                System.err.println("Nhập sai định dạng nhập lại");
            }
        } while (true);

        System.out.print("Nhập tên quản lý: ");
        String name = scanner.nextLine();

        String date;
        do {
            System.out.print("Nhập ngày sinh quản lý: (dd/mm/yy)");
            date = scanner.nextLine();
            if (Regex.date(date)) {
                break;
            } else {
                System.err.println("Nhập sai định dạng nhập lại");
            }
        } while (true);

        System.out.print("Nhập địa chỉ quản lý: ");
        String address = scanner.nextLine();

        int salary;
        do {
            System.out.print("Nhập lương quản lý: ");
            salary = Integer.parseInt(scanner.nextLine());
            if (salary > 0) {
                break;
            } else {
                System.err.println("Nhập sai định dạng nhập lại");
            }
        } while (true);

        int Coefficients;
        do {
            System.out.print("Nhập hệ số nhân lương quản lý: ");
            Coefficients = Integer.parseInt(scanner.nextLine());
            if (Coefficients > 0) {
                break;
            } else {
                System.err.println("Nhập sai định dạng nhập lại");
            }
        } while (true);

        int max = 0;
        int id = 0;
        if (manageList.size() == 0) {
            id = 1;
        } else {
            for (Manage item : manageList) {
                if (item.getId() > max) {
                    max = item.getId();
                }
            }
            id = max + 1;
        }
        Manage manage = new Manage(id, code, name, date, address, salary, Coefficients);
        manageList.add(manage);

        String line = manage.getLine();

        SaveAndDisplayData.writeFile(link, line);
        System.out.println("Thêm thành công");
    }

    @Override
    public void display() {
        readFiles();
        System.out.println("Danh sách ");
        for (Manage item : manageList) {
            System.out.println(item);
        }
    }

    @Override
    public void update() throws IOException {
        readFiles();
        System.out.println("Nhập ID cần update");
        boolean check = false;
        int index = 0;
        int idUpdate = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < manageList.size(); i++) {
            if (manageList.get(i).getId() == idUpdate) {
                check = true;
                index = i;
                break;
            }
        }
        if (check) {
            String code;
            do {
                System.out.print("Nhập mã nv quản lý: (theo định dạng VIP-*****)* là số");
                code = scanner.nextLine();
                if (Regex.codeQl(code)) {
                    break;
                } else {
                    System.err.println("Nhập sai định dạng nhập lại");
                }
            } while (true);

            System.out.print("Nhập tên quản lý: ");
            String name = scanner.nextLine();

            String date;
            do {
                System.out.print("Nhập ngày sinh quản lý: (dd/mm/yy)");
                date = scanner.nextLine();
                if (Regex.date(date)) {
                    break;
                } else {
                    System.err.println("Nhập sai định dạng nhập lại");
                }
            } while (true);

            System.out.print("Nhập địa chỉ quản lý: ");
            String address = scanner.nextLine();

            int salary;
            do {
                System.out.print("Nhập lương quản lý: ");
                salary = Integer.parseInt(scanner.nextLine());
                if (salary > 0) {
                    break;
                } else {
                    System.err.println("Nhập sai định dạng nhập lại");
                }
            } while (true);

            int Coefficients;
            do {
                System.out.print("Nhập hệ số nhân lương quản lý: ");
                Coefficients = Integer.parseInt(scanner.nextLine());
                if (Coefficients > 0) {
                    break;
                } else {
                    System.err.println("Nhập sai định dạng nhập lại");
                }
            } while (true);

            manageList.get(index).setCode(code);
            manageList.get(index).setName(name);
            manageList.get(index).setDate(date);
            manageList.get(index).setAddress(address);
            manageList.get(index).setSalary(salary);
            manageList.get(index).setCoefficients(Coefficients);


            SaveAndDisplayData.clearFile(link);

            for (Manage item : manageList) {
                String line = item.getLine();

                SaveAndDisplayData.writeFile(link, line);
            }
            System.out.println("cập nhập thành công");
        } else {
            System.out.println("ID ko tồn tại");
        }
    }

    @Override
    public void delete() throws IOException {
        readFiles();
        System.out.println("Nhập ID cần xóa");
        boolean check = false;
        int index = 0;
        int idUpdate = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < manageList.size(); i++) {
            if (manageList.get(i).getId() == idUpdate) {
                check = true;
                index = i;
                break;
            }
        }
        if (check) {
            manageList.remove(index);
            SaveAndDisplayData.clearFile(link);

            for (Manage item : manageList) {
                String line = item.getLine();

                SaveAndDisplayData.writeFile(link, line);
            }
            System.out.println("xóa thành công");
        } else {
            System.out.println("ID ko tồn tại");
        }
    }

    @Override
    public void search() {
        readFiles();
        boolean check = false;
        System.out.println("nhập Tên cần tìm");
        String input = scanner.nextLine();
        for (Manage manage : manageList) {
            if (manage.getName().contains(input) ||
                    manage.getDate().contains(input) ||
                    manage.getCode().contains(input) ||
                    manage.getAddress().contains(input)) {
                System.out.println(manage);
                check = true;
            }
        }
        if (check = false) {
            System.out.println("Ko tìm thấy ");
        }
    }

    void readFiles() {
        list = SaveAndDisplayData.readerFile(link);
        manageList.clear();
        for (String[] item : list) {
            Manage manage = new Manage(Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    Integer.parseInt(item[5]),
                    Integer.parseInt(item[6]));
            manageList.add(manage);
        }
    }
}

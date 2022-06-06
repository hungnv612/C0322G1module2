package services.Impl;

import models.Production;
import services.ProductionService;
import until.Regex;
import until.SaveAndDisplayData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductionServiceImpl implements ProductionService {
    private static Scanner scanner = new Scanner(System.in);
    String link = "src/Data/ProductionData.csv";
    List<String[]> list = new ArrayList<>();
    List<Production> productionList = new ArrayList<>();

    @Override
    public void add() throws IOException {
        readFiles();
        String code;
        do {
            System.out.println("Nhập mã nhân viên: (theo định dạng ABC-*****)* là số ");
            code = scanner.nextLine();
            if (Regex.code(code)) {
                break;
            } else {
                System.err.println("Nhập sai định dạng nhập lại");
            }
        } while (true);

        System.out.print("Nhập tên nhân viên: ");
        String name = scanner.nextLine();

        String date;
        do {
            System.out.println("Nhập ngày sinh nhân viên: (dd/mm/yy) ");
            date = scanner.nextLine();
            if (Regex.date(date)) {
                break;
            } else {
                System.err.println("Nhập sai định dạng nhập lại");
            }
        } while (true);

        System.out.print("Nhập địa chỉ nhân viên: ");
        String address = scanner.nextLine();

        int number;
        do {
            System.out.println("Nhập số lượng sản phẩm: ");
            number = Integer.parseInt(scanner.nextLine());
            if (number > 0) {
                break;
            } else {
                System.err.println("Nhập sai định dạng nhập lại");
            }
        } while (true);

        int price;
        do {
            System.out.println("Nhập giá mỗi sản phẩm: ");
            price = Integer.parseInt(scanner.nextLine());
            if (price > 0) {
                break;
            } else {
                System.err.println("Nhập sai định dạng nhập lại");
            }
        } while (true);

        int max = 0;
        int id = 0;
        if (productionList.size() == 0) {
            id = 1;
        } else {
            for (Production item : productionList) {
                if (item.getId() > max) {
                    max = item.getId();
                }
            }
            id = max + 1;
        }

        Production production = new Production(id, code, name, date, address, number, price);
        productionList.add(production);

        String line = production.getLine();

        SaveAndDisplayData.writeFile(link, line);
        System.out.println("Thêm thành công");
    }

    @Override
    public void display() {
        readFiles();
        System.out.println("Danh sách ");
        for (Production item : productionList) {
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
        for (int i = 0; i < productionList.size(); i++) {
            if (productionList.get(i).getId() == idUpdate) {
                check = true;
                index = i;
                break;
            }
        }
        if (check) {
            String code;
            do {
                System.out.println("Nhập mã nhân viên: (theo định dạng ABC-*****)* là số ");
                code = scanner.nextLine();
                if (Regex.code(code)) {
                    break;
                } else {
                    System.err.println("Nhập sai định dạng nhập lại");
                }
            } while (true);

            System.out.println("Nhập tên nhân viên: ");
            String name = scanner.nextLine();

            String date;
            do {
                System.out.println("Nhập ngày sinh nhân viên: (dd/mm/yy) ");
                date = scanner.nextLine();
                if (Regex.date(date)) {
                    break;
                } else {
                    System.err.println("Nhập sai định dạng nhập lại");
                }
            } while (true);

            System.out.println("Nhập địa chỉ nhân viên: ");
            String address = scanner.nextLine();

            int number;
            do {
                System.out.println("Nhập số lượng sản phẩm: ");
                number = Integer.parseInt(scanner.nextLine());
                if (number > 0) {
                    break;
                } else {
                    System.err.println("Nhập sai định dạng nhập lại");
                }
            } while (true);

            int price;
            do {
                System.out.println("Nhập giá mỗi sản phẩm: ");
                price = Integer.parseInt(scanner.nextLine());
                if (price > 0) {
                    break;
                } else {
                    System.err.println("Nhập sai định dạng nhập lại");
                }
            } while (true);

            productionList.get(index).setCode(code);
            productionList.get(index).setName(name);
            productionList.get(index).setDate(date);
            productionList.get(index).setAddress(address);
            productionList.get(index).setNumber(number);
            productionList.get(index).setPrice(price);


            SaveAndDisplayData.clearFile(link);

            for (Production item : productionList) {
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
        for (int i = 0; i < productionList.size(); i++) {
            if (productionList.get(i).getId() == idUpdate) {
                check = true;
                index = i;
                break;
            }
        }
        if (check) {
            productionList.remove(index);
            SaveAndDisplayData.clearFile(link);

            for (Production item : productionList) {
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
        for (Production manage : productionList) {
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
        productionList.clear();
        for (String[] item : list) {
            Production production = new Production(Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    Integer.parseInt(item[5]),
                    Integer.parseInt(item[6]));
            productionList.add(production);
        }
    }
}

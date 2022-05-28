package BaiTap.QuanLySanPham;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    private static void add() throws IOException {
        List<Product> list = (List<Product>) BinaryFileAndSerialization.readFileBinary("src/BaiTap/QuanLySanPham/hung.csv");
        System.out.println("Nhập ID");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập Nơi sản xuất");
        String producer = scanner.nextLine();
        System.out.println("Nhập Giá ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập ghi chú");
        String describe = scanner.nextLine();
        Product product = new Product(id, name, producer, price, describe);
        list.add(product);
        BinaryFileAndSerialization.writerFileBinary("src/BaiTap/QuanLySanPham/hung.csv", list);
    }

    private static void display() throws IOException {
        List<Product> list = (List<Product>) BinaryFileAndSerialization.readFileBinary("src/BaiTap/QuanLySanPham/hung.csv");
        for (Product item : list) {
            System.out.println(item);
        }
    }

    private static void search() throws IOException {
        List<Product> list = (List<Product>) BinaryFileAndSerialization.readFileBinary("src/BaiTap/QuanLySanPham/hung.csv");
        System.out.println("nhập Tên cần tìm");
        String name = scanner.nextLine();
        for (Product product : list) {
            if (product != null && product.getName().contains(name)) {
                System.out.println(product);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        do {
            System.out.println("--------------Person Managemert--------------------");
            System.out.println("1.Display list Person");
            System.out.println("2.Add new Person");
            System.out.println("3.Search Person");
            System.out.println("0.Exit");
            System.out.println("-----------------------------------------------------");
            System.out.print("chọn Options:   ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {

                case 1:
                    display();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    search();
                    break;
                case 0:
                    System.exit(0);

            }
        } while (true);
    }
}


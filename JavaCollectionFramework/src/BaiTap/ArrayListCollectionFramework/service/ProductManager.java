package BaiTap.ArrayListCollectionFramework.service;

import BaiTap.ArrayListCollectionFramework.model.Product;

import java.util.*;

public class ProductManager extends Product {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Product> list = new ArrayList<>();
    //  public static List<Product> list = new LinkedList<>();i
    public static int count = 6;

    static {
        list.add(new Product(1, "Ịphone11", 16, "apple", 60000));
//        list.add(new Product());
        list.add(new Product(2, "Ịphone12", 10, "apple", 80000));
        list.add(new Product(3, "Ịphonexs", 11, "apple", 1000000));
        list.add(new Product(4, "Ịphone13", 12, "apple", 70000));
        list.add(new Product(5, "Ịphone14", 13, "apple", 90000));
    }


    public void add() {
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập số lượng sản phẩm: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập nhà sản xuất: ");
        String company = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        float money = Integer.parseInt(scanner.nextLine());
        Product product = new Product(count, name, quantity, company, money);
        list.add(product);
        count++;
    }

    public void display() {
        for (Product product : list) {
            if (product.getId() == 0) {
                System.out.println("mang rong");
            } else {
                System.out.println(product);
            }
        }
    }

    public void delete() {
        System.out.println("Nhập id vị trí muốn xoá: ");
        int input = Integer.parseInt(scanner.nextLine());
        if (input >= count) {
            System.out.println("ko tìm thấy");
        } else {
            for (int i = 0; i < count; i++) {
                if (input == list.get(i).getId()) {
                    list.remove(list.get(i));
                    System.out.println("Xoá thành công");
                    break;
                }
            }
        }
    }


    public void update() {
        System.out.println("Nhập id để để tìm vị trí update: ");
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            if (num >= count) {
                System.out.println("ko tìm thấy");
            } else if (num == list.get(i).getId()) {
                System.out.print(" Cập Nhập tên sản phẩm: ");
                String nameCn = scanner.nextLine();
                System.out.print("Cập Nhập số lượng sản phẩm: ");
                int quantityCn = Integer.parseInt(scanner.nextLine());
                System.out.print(" Cập Nhập nhà sản xuất: ");
                String companyCn = scanner.nextLine();
                System.out.print(" Cập Nhập giá sản phẩm: ");
                float moneyCn = Integer.parseInt(scanner.nextLine());
                list.get(i).setName(nameCn);
                list.get(i).setQuantity(quantityCn);
                list.get(i).setCompany(companyCn);
                list.get(i).setPrice(moneyCn);
                System.out.println("Cập nhật thành công");
            }
        }
    }

    public void sortLow() {
        list.sort((o1, o2) -> (int) (o2.getPrice() - o1.getPrice()));
        System.out.println("Xắp xếp thành công");
    }

    public void sortUp() {
        list.sort((o1, o2) -> (int) (o1.getPrice() - o2.getPrice()));
        System.out.println("Xắp xếp thành công");
    }

    public void sortId() {
        list.sort((o1, o2) -> o1.getId() - o2.getId());
        System.out.println("Xắp xếp thành công");
    }

    public void search() {
        System.out.println("Nhập tên để tìm kiếm sản phẩm: ");
        String inputName = scanner.nextLine();
        for (int i = 0; i < count - 1; i++) {
            if (list.get(i).getName().contains(inputName)) {
                System.out.println(list.get(i));
            } else {
                System.out.println("Tên sản phẩm không tìm thấy ");
                break;
            }
        }
    }


}

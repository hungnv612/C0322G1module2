import java.util.Scanner;


public class Main {


    public static Product[] productList = new Product[100];
    public static int count;
    public static boolean flag = true;
    static Scanner scanner = new Scanner(System.in);

    static {
        System.out.println("Block static");
        productList[0] = new Product(1, "Iphone", 1000, 10, "iphone");
        productList[1] = new Product(2, "Iphone", 1000, 10, "iphone");
        productList[2] = new Product(3, "Iphone2", 1000, 10, "iphone");
        productList[3] = new Product(4, "Iphone3", 1000, 10, "iphone");
        productList[4] = new Product(5, "Iphone4", 1000, 10, "iphone");
        count = 5;
    }

    public static void addNewProduct() {
        System.out.println("nhập tên ");
        String name = scanner.nextLine();
        System.out.println("nhập giá ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập số lượng ");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập nhà sản xuất  ");
        String production = scanner.nextLine();

        Product product = new Product(count + 1, name, price, amount, production);
        productList[count] = product;
        count++;
    }

    public static void displayList() {
        System.out.println("---------------------------------------------------");
        for (Product item : productList) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    public static void search() {
        System.out.println("--------------search Managemert--------------------");
        System.out.println("1.search ID");
        System.out.println("2.search Name");
        System.out.println("-----------------------------------------------------");
        System.out.print("chọn Options:   ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("nhập ID cần tìm");
                int id = Integer.parseInt(scanner.nextLine());
                for (Product value : productList) {
                    if (value != null && value.getId() == id) {
                        System.out.println(value);
                        flag = false;
                    }
                }
                if (flag) {
                    System.out.println("Ko tìm thấy ");
                }
                break;
            case 2:
                System.out.println("nhập Tên cần tìm");
                String name = scanner.nextLine();
                for (Product product : productList) {
                    if (product != null && product.getName().contains(name)) {
                        System.out.println(product);
                        flag = false;
                    }
                }
                if (flag) {
                    System.out.println("Ko tìm thấy ");
                }
                break;
        }
    }

    public static void delete() {
        System.out.println("nhập ID cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = id - 1; i < productList.length - 1; i++) {
            if(productList[i] != null ) {
                productList[i] = productList[i + 1];
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Ko tìm thấy ");
        }
    }



    public static void update() {
        System.out.println("nhập ID cần Update");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.length; i++) {
            if (productList[i] != null && productList[i].getId() == id) {
                System.out.println("nhập tên ");
                String name = scanner.nextLine();
                System.out.println("nhập giá ");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("nhập số lượng ");
                int amount = Integer.parseInt(scanner.nextLine());
                System.out.println("nhập nhà sản xuất  ");
                String production = scanner.nextLine();

                Product product = new Product(i + 1, name, price, amount, production);
                productList[i] = product;
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Ko tìm thấy ");
        }
    }

    public static void main(String[] args) {
        do {
            System.out.println("--------------Product Managemert--------------------");
            System.out.println("1.Display list Product");
            System.out.println("2.Add new Product");
            System.out.println("3.Search Product");
            System.out.println("4.Delete Product");
            System.out.println("5.Update Product");
            System.out.println("6.Exit");
            System.out.println("-----------------------------------------------------");
            System.out.print("chọn Options:   ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Display list");
                    displayList();
                    break;
                case 2:
                    System.out.println("Search ");
                    addNewProduct();
                    break;
                case 3:
                    flag = true;
                    System.out.println("Add new ");
                    search();
                    break;
                case 4:
                    flag = true;
                    System.out.println("Delete ");
                    delete();
                    displayList();
                    break;
                case 5:
                    flag = true;
                    System.out.println("Update ");
                    update();
                    displayList();
                    break;
                case 6:
                    System.exit(0);
            }
        } while (true);
    }
}

package services.ImpI;


import models.Customer;

import services.CustomerService;

import until.SaveAndDisplayData;


import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceIpl implements CustomerService {
    private static Scanner scanner = new Scanner(System.in);
    List<String[]> list = new LinkedList<>();
    List<Customer> customersList = new LinkedList<>();

    @Override
    public void display() {

    }

    @Override
    public void add() throws IOException {
        list = SaveAndDisplayData.readerFile("src/Data/CustomersData");
        customersList.clear();
        for (String[] item : list) {
            Customer customer = new Customer(Integer.parseInt(item[0]), item[1], item[2], Integer.parseInt(item[3]), Integer.parseInt(item[4]), item[5], item[6]);
            customersList.add(customer);
        }
        System.out.print("Nhập mã số Khách hàng: ");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên khách hàng: ");
        String name = scanner.nextLine();
        System.out.print("Nhập gới tính khách hàng: ");
        String gender = scanner.nextLine();
        System.out.print("Nhập SDT khách hàng: ");
        int sdt = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập email khách hàng: ");
        String email = scanner.nextLine();
        Customer customer = new Customer(code, name, gender, list.size() + 1, sdt, email);
        customersList.add(customer);
        String line = "";
        for (int i = 0; i < customersList.size(); i++) {
            if (i == (customersList.size() - 1)) {
                line += customersList.get(i).getCode()
                        + "," + customersList.get(i).getCode()
                        + "," + customersList.get(i).getFullName()
                        + "," + customersList.get(i).getGenDer()
                        + "," + customersList.get(i).getId()
                        + "," + customersList.get(i).getNumberPhone()
                        + "," + customersList.get(i).getEmail();
            } else {
                line += customersList.get(i).getCode()
                        + "," + customersList.get(i).getCode()
                        + "," + customersList.get(i).getFullName()
                        + "," + customersList.get(i).getGenDer()
                        + "," + customersList.get(i).getId()
                        + "," + customersList.get(i).getNumberPhone()
                        + "," + customersList.get(i).getEmail() + "\n";
            }
        }
        SaveAndDisplayData.writeFile("src/Data/CustomersData",line);
        System.out.println("Thêm thành công");
    }


    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}

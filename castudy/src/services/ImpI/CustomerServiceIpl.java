package services.ImpI;


import models.Customer;
import models.Employee;
import services.CustomerService;

import until.CustomerUntil;

import until.SaveAndDisplayData;


import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceIpl implements CustomerService {
    private static final Scanner scanner = new Scanner(System.in);
    String link = "src/Data/CustomersData";
    List<String[]> list = new LinkedList<>();
    List<Customer> customersList = new LinkedList<>();

    @Override
    public void display() {
        list = SaveAndDisplayData.readerFile(link);
        customersList.clear();
        for (String[] item : list) {
            Customer customer = new Customer(Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    Integer.parseInt(item[3]),
                    Integer.parseInt(item[4]),
                    item[5],
                    item[6],
                    item[7]);
            customersList.add(customer);
        }
        System.out.println("Danh sách ");
        for (Customer item : customersList) {
            System.out.println(item);
        }
    }

    @Override
    public void add() throws IOException {
        list = SaveAndDisplayData.readerFile(link);
        customersList.clear();
        for (String[] item : list) {
            Customer customer = new Customer(Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    Integer.parseInt(item[3]),
                    Integer.parseInt(item[4]),
                    item[5],
                    item[6],
                    item[7]);
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
        System.out.print("Nhập địa chỉ khách hàng: ");
        String diachi = scanner.nextLine();
        String classify = CustomerUntil.classify();
        int max = 0;
        int id = 0;
        if (customersList.size() == 0) {
            id = 1;
        } else {
            for (Customer item: customersList) {
                if (item.getId()>max){
                    max=item.getId();
                }
            }
            id = max+1;
            System.out.println(id);
        }
        Customer customer = new Customer(code, name, gender, id, sdt, email, classify, diachi);
        customersList.add(customer);
        String line = "";
        for (int i = 0; i < customersList.size(); i++) {
            line += customersList.get(i).getCode()
                    + "," + customersList.get(i).getFullName()
                    + "," + customersList.get(i).getGenDer()
                    + "," + customersList.get(i).getId()
                    + "," + customersList.get(i).getNumberPhone()
                    + "," + customersList.get(i).getEmail()
                    + "," + customersList.get(i).getGuestType()
                    + "," + customersList.get(i).getAddress() + "\n";
        }
        SaveAndDisplayData.writeFile(link, line);
        System.out.println("Thêm thành công");
    }


    @Override
    public void update() throws IOException {
        list = SaveAndDisplayData.readerFile(link);
        customersList.clear();
        for (String[] item : list) {
            Customer customer = new Customer(Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    Integer.parseInt(item[3]),
                    Integer.parseInt(item[4]),
                    item[5],
                    item[6],
                    item[7]);
            customersList.add(customer);
        }

        System.out.println("Nhập ID cần update");
        boolean check = false;
        int index = 0;
        int idUpdate = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customersList.size(); i++) {
            if (customersList.get(i).getId() == idUpdate) {
                check = true;
                index = i;
                break;
            }
        }
        if (check) {
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
            System.out.print("Nhập địa chỉ khách hàng: ");
            String diachi = scanner.nextLine();
            String classify = CustomerUntil.classify();

            customersList.get(index).setCode(code);
            customersList.get(index).setFullName(name);
            customersList.get(index).setGenDer(gender);
            customersList.get(index).setNumberPhone(sdt);
            customersList.get(index).setEmail(email);
            customersList.get(index).setAddress(diachi);
            customersList.get(index).setGuestType(classify);


            String line = "";
            for (int i = 0; i < customersList.size(); i++) {
                line += customersList.get(i).getCode()
                        + "," + customersList.get(i).getFullName()
                        + "," + customersList.get(i).getGenDer()
                        + "," + customersList.get(i).getId()
                        + "," + customersList.get(i).getNumberPhone()
                        + "," + customersList.get(i).getEmail()
                        + "," + customersList.get(i).getGuestType()
                        + "," + customersList.get(i).getAddress() + "\n";
            }
            SaveAndDisplayData.writeFile(link, line);
            System.out.println("update thành công");
        } else {
            System.out.println("ID ko tồn tại");
        }

    }

}
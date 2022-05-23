package service;


import model.Company;
import model.NVCongNhat;
import model.NVQuanLy;
import model.NVSanXuat;
import utils.NameComparator;
import utils.SalaryComparator;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;


public class CompanyManagerArrayList {
    public static List<Company> list = new ArrayList<>();

    static {
        list.add(new NVCongNhat("duc", "6/2/1998", "ĐÀ Nẵng", 10));
        list.add(new NVQuanLy("hung", "8/3/1999", "ĐÀ Nẵng", 200000, 3.5));
        list.add(new NVSanXuat("dat", "4/5/1997", "ĐÀ Nẵng", 30));
        list.add(new NVCongNhat("a", "6/2/1998", "ĐÀ Nẵng", 20));
        list.add(new NVQuanLy("b", "8/3/1999", "ĐÀ Nẵng", 300000, 2.2));
        list.add(new NVSanXuat("c", "4/5/1997", "ĐÀ Nẵng", 40));
    }

    public void displayArrayList() {
        for (Company product : list) {
            System.out.println(product);
        }
    }

    public void displayNVCongNhat() {
        for (Company product : list) {
            if (product instanceof NVCongNhat) {
                System.out.println(product);
            }
        }
    }

    public void displayNVQuanLy() {
        for (Company product : list) {
            if (product instanceof NVQuanLy) {
                System.out.println(product);
            }
        }
    }

    public void displayNVSanXuat() {
        for (Company product : list) {
            if (product instanceof NVSanXuat) {
                System.out.println(product);
            }
        }
    }

    public void sapXepTheoLuong() {
        list.sort(new SalaryComparator());
        System.out.println("Sắp xếp thành công");
    }

    public void sapXepTheoName() {
        list.sort(new NameComparator());
        System.out.println("Sắp xếp thành công");
    }
}

//    Suy nghĩ xem vì sao ArrayList không cần khởi tạo 1000 phần tử trước?
//        Nếu công ty có 1001 nhân viên thì có vấn đề gì không?
//        Nêu ưu và nhược điểm của ArrayList so với Array.
//      Suy nghĩ xem class cha có cần phương thức abstract không? Vì sao?
//Suy nghĩ xem phải tạo ra một interface có phương thức là chấm công rồi cho nhân viên quản lý và nhân viên sản xuất implements lại phương thức này, hay là viết phương thức abstract ở class cha? Vì sao?


//ArrayList có khả năng tự thay đổi kích thước nên ko cần đặt trc 1000 phần tử;
//ArrayList có khả năng thay đổi kích thước nên ko có chuyện gì sảy ra;
// ưu điểm :Kích thước có thể thay đổi được/Có nhiều phương thức để thao tác với dữ liệu.
// nhược :Tốc độ lưu trữ và thao tác chậm hơn/Chỉ có thể lưu trữ dữ liệu kiểu đối tượng.
// Kể từ Java 5, kiểu nguyên thủy được tự động chuyển đổi trong các đối tượng được gọi là auto-boxing.
// cần vì lớp cha nó khá mà bao quát và chung nên ko thể tạo dc đối tượng  nên phải cần phương thức abstract để khỏi tạo đối tượng
// cần phải tạo một interface có phương thức là chấm công rồi cho nhân viên quản lý và nhân viên sản xuất implements lại  nếu viết phương thức abstract ở class cha thì cả 3 thằng con đầu thừa kế phương thức chấm công
package service;

import model.Company;
import model.NVCongNhat;
import model.NVQuanLy;
import model.NVSanXuat;

public class CompanyManagerArray {
    public static Company[] company = new Company[1000];

    static {
        System.out.println("list");
        company[0] = new NVCongNhat("duc", "6/2/1998", "ĐÀ Nẵng", 10);
        company[1] = new NVQuanLy("hung", "8/3/1999", "ĐÀ Nẵng", 20000, 3);
        company[2] = new NVSanXuat("dat", "4/5/1997", "ĐÀ Nẵng", 30);
    }

    public static void display() {
        for (Company item : company) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    public static void displayQuanLy() {
        for (Company quanLy : company) {
            if (quanLy instanceof NVQuanLy) {
                System.out.println(quanLy);
            }
        }
    }

//    Suy nghĩ xem có những khó khăn gì khi hiển thị thông tin (phải check null, …)
//    Suy nghĩ xem từ khóa instanceof làm chức năng gì?
//    Suy nghĩ xem nếu có 1001 nhân viên trong công ty thì chuyện gì xảy ra?
//    Đa hình lúc runtime thể hiện ở đâu?
//    Đa hình lúc compile thể hiện ở đâu?


    // khá bất tiện khi phải check null nếu ko checks null sẽ in ra 1 đống phần tử null nằm trong array
    // instanceof được sử dụng để kiểm tra một đối tượng có cùng kiểu dữ liệu đối tượng hay ko
    //    nếu có 1001 nhân viên trong công ty thì sẽ lỗi
    //    Đa hình lúc compile thể hiện ở lúc thên nhân viên vào list
    //    Đa hình lúc runtime thể hiện ở lúc chạy làm displayQuanLy ;
}

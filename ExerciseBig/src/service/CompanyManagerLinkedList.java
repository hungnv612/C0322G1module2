package service;

import model.Company;
import model.NVCongNhat;
import model.NVQuanLy;
import model.NVSanXuat;


import java.util.LinkedList;
import java.util.List;

public class CompanyManagerLinkedList {
    public static List<Company> list = new LinkedList<>();

    static {
        list.add(new NVCongNhat("duc", "6/2/1998", "ĐÀ Nẵng", 10));
        list.add(new NVQuanLy("hung", "8/3/1999", "ĐÀ Nẵng", 20000, 3));
        list.add(new NVSanXuat("dat", "4/5/1997", "ĐÀ Nẵng", 30));
    }

    public void displayArrayLinkedList() {
        for (Company product : list) {
            System.out.println(product);
        }
    }
}
//    Có nên dùng vòng lặp truyền thống (for i = 0 -> size() – 1 => get(i)) để duyệt qua từng phần tử có trong LinkedList hay không? Lý do?
//        Giả sử công ty ABC thay đổi nhân sự liên tục (xóa và thêm nhân viên) thì nên sử dụng ArrayList hay LinkedList? Lý do?
//        Ưu và nhược điểm của ArrayList và LinkedList.

//ko nên sử dung fori cho LinkedList vì nó truy xuất phần tử chậm hơn vì phải duyệt mảng lại từ đầu
// nên sử dùng LinkedList  vì khí thêm hoặc xóa chỉ cần gắt và gắn các nối liên kết ko cần sắp xếp lại mảng như arrayList nên sẽ nhanh hơn
//  ArrayList: mảng động để lưu trữ các phần tử/ Thao tác với ArrayList chậm vì nó sử dụng một mảng bên trong. Nếu bất kỳ phần tử nào bị xóa khỏi mảng, tất cả các phần tử khác sẽ được chuyển trong bộ nhớ/ Một lớp ArrayList chỉ có thể hoạt động như một danh sách vì nó chỉ thực thi Danh sách/ArrayList tốt hơn để lưu trữ và truy cập dữ liệu
//  LinkedList: LinkedList nội bộ sử dụng danh sách được liên kết kép để lưu trữ các phần tử/Thao tác với LinkedList nhanh hơn ArrayList vì nó sử dụng danh sách được liên kết kép, do đó không cần dịch chuyển bit trong bộ nhớ/Lớp LinkedList có thể hoạt động như một danh sách và hàng đợi vì nó triển khai các giao diện List và Deque/LinkedList tốt hơn để thao tác dữ liệu.
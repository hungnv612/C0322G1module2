package utils;

import model.Company;

import java.util.Comparator;

public class NameComparator implements Comparator<Company> {
    //Có thể dùng sắp xếp lương tăng dần dùng comparator, tên tăng dần dùng comparable
    //Hoặc cả 2 đều dùng comparator với các class implements comparator với tiêu chí khác nhau
    //Khi chỉ có 1 tiêu chí, dùng comparable cho gọn, không phải tạo thêm class
    //Khi có 2 tiêu chí trở lên, phải dùng comparator
    //Comparable triển khai ngay trong class cần sắp xếp -> ghi đè phương thức compareTo, chỉ sắp xếp theo 1 tiêu chí, thuộc thư viện java.lang
    //Comparator tạo 1 class mới rồi triển khai comparator -> ghi đè phương thức compare, từ 2 tiêu chí trở lên, bắt buộc dùng comparator, thuộc thư viện java.util
    @Override
    public int compare(Company o1, Company o2) {
        if (o1.getName().compareTo(o2.getName()) > 0) {
            return 1;
        } else if (o1.getName().compareTo(o2.getName()) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}

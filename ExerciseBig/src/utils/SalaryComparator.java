package utils;

import model.Company;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Company> {
    //Sắp xếp nhân viên theo lương tăng dần nếu lương bằng nhau thì sắp xếp theo tên giảm dần
    //Phải sử dụng comparator vì ở đây có 2 tiêu chí
    @Override
    public int compare(Company o1, Company o2) {
        if (o1.luong() > o2.luong()) {
            return 1;
        } else if (o1.luong() < o2.luong()) {
            return -1;
        } else {
            if (o1.getName().compareTo(o2.getName()) > 0) {
                return 1;
            } else if (o1.getName().compareTo(o2.getName()) < 0) {
                return -1;
            }
        }
        return 0;
    }
}

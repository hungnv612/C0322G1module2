package service;

import model.Company;
import model.NVCongNhat;
import model.NVQuanLy;
import model.NVSanXuat;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CompanyManagerMap {
    static Map<Integer, Company> integerCompanyMap = new LinkedHashMap<>();
    static {
        integerCompanyMap.put(1, new NVQuanLy("hung", "8/3/1999", "ĐÀ Nẵng", 200000, 3.5));
        integerCompanyMap.put(2, new NVSanXuat("dat", "4/5/1997", "ĐÀ Nẵng", 30));
        integerCompanyMap.put(3, new NVCongNhat("a", "6/2/1998", "ĐÀ Nẵng", 20));
    }
    //Dùng containsKey() để kiểm tra xem Mã NV đã tồn tại hay chưa
    public void displayCompanyMap() {
        Set<Integer> keySet = integerCompanyMap.keySet();
        for (Integer item : keySet) {
            System.out.println("Mã NV: " + item + ", " + integerCompanyMap.get(item));
        }
    }
}

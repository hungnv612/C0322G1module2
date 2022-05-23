package model;

import service.ChamCong;

public class NVSanXuat extends Company implements ChamCong {
    private double soSanPham;

    public NVSanXuat() {
    }

    public NVSanXuat(String name, String date, String address, double soSanPham) {
        super(name, date, address);
        this.soSanPham = soSanPham;
    }

    public double getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(double soSanPham) {
        this.soSanPham = soSanPham;
    }

    public double luongNVSanXuat() {
        return this.soSanPham * 50000;
    }

    @Override
    public String
    toString() {
        return "NVSanXuat{ " +
                " name= " + getName() +
                " date= " + getDate() +
                " address= " + getAddress() +
                " soSanPham= " + soSanPham +
                " Lương= " + luong() +
                " Chấm công= " + chamCong() +
                '}';
    }

    @Override
    public String chamCong() {
        return "đã chấm công";
    }

    @Override
    public double luong() {
        return this.soSanPham * 50000;
    }
}

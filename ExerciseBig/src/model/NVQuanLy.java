package model;

import service.ChamCong;

public class NVQuanLy extends Company implements ChamCong {
    private double luongCoBan;
    private double heSoLuong;

    public NVQuanLy() {
    }

    public NVQuanLy(String name, String date, String address, double luongCoBan, double heSoLuong) {
        super(name, date, address);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double luongNVQuangLy() {
        return this.luongCoBan * this.heSoLuong;
    }

    @Override
    public String toString() {
        return "NVQuanLy{ " +
                " name= " + getName() +
                " date= " + getDate() +
                " address= " + getAddress() +
                " luongCoBan= " + luongCoBan +
                " heSoLuong= " + heSoLuong +
                " Lương= " + luong() +
                " Chấm công= " + chamCong() +
                '}';
    }

    @Override
    public String chamCong() {
        return "đã chấm công ";
    }

    @Override
    public double luong() {
        return this.luongCoBan * this.heSoLuong;
    }
}

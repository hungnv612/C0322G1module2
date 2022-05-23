package model;

public class NVCongNhat extends Company {
    private double soNgayCong;

    public NVCongNhat() {
    }

    public NVCongNhat(String name, String date, String address, double soNgayCong) {
        super(name, date, address);
        this.soNgayCong = soNgayCong;
    }

    public double getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(double soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public double luongNVCongNhat() {
        return this.soNgayCong * 120000;
    }

    @Override
    public String toString() {
        return "NVCongNhat{ " +
                " name= " + getName() +
                " date= " + getDate() +
                " address= " + getAddress() +
                " soNgayCong= " + soNgayCong +
                " Lương= " + luong() +
                '}';
    }

    @Override
    public double luong() {
        return this.soNgayCong * 120000;
    }
}

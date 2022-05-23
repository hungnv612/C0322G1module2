package model;

public abstract class Company {
    private String name;
    private String date;
    private String address;

    public Company() {
    }

    public Company(String name, String date, String address) {
        this.name = name;
        this.date = date;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract double luong();

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

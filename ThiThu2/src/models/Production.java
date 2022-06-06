package models;

public class Production extends Person {
    private int number;
    private int Price;

    @Override
    public String getLine() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",
                super.getId(),
                super.getCode(),
                super.getName(),
                super.getDate(),
                super.getAddress(),
                getNumber(),
                getPrice());
    }

    public Production() {
    }

    public Production(int number, int price) {
        this.number = number;
        Price = price;
    }

    public Production(int id, String code, String name, String date, String address, int number, int price) {
        super(id, code, name, date, address);
        this.number = number;
        Price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Production{" + super.toString() +
                ", number= " + number +
                ", Price= " + Price +
                '}';
    }
}

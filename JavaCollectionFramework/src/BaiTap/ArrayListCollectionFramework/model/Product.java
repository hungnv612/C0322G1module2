package BaiTap.ArrayListCollectionFramework.model;

import java.util.Comparator;

public class Product implements Comparator {
    private int id;
    private String name;
    private int quantity;
    private String company;
    private float price;

    public Product() {
    }

    public Product(int id, String name, int quantity, String company, float price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.company = company;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", company='" + company + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}

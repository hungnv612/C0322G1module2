package models;

public abstract class Person {
    private int id;
    private String code;
    private String name;
    private String date;
    private String address;

    public Person() {
    }
    public abstract String getLine();

    public Person(int id, String code, String name, String date, String address) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.date = date;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    @Override
    public String toString() {
        return "id= " + id +
                ", code= '" + code + '\'' +
                ", name= '" + name + '\'' +
                ", date= '" + date + '\'' +
                ", address= '" + address + '\'' ;
    }
}

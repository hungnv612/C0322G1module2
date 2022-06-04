package models;


public class Employee extends Person {
    private String level;
    private String location;
    private float salary;

    public Employee() {
    }

    @Override
    public String testToString() {
        return null;
    }

    public Employee(String virginity, String location, float salary) {
        this.level = virginity;
        this.location = location;
        this.salary = salary;
    }

    public Employee(int code, String fullName, String genDer, int id, int numberPhone, String email, String level, String location, float salary) {
        super(code, fullName, genDer, id, numberPhone, email);
        this.level = level;
        this.location = location;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + getId() +
                ",  Tên: " + getFullName() +
                ",  Vị trí: " + location +
                ",  Lương: " + salary + " Nghìn $ " +
                ",  Mã số: " + getCode() +
                ",  Trình độ: " + level +
                ",  Giới tính: " + getGenDer() +
                ",  SDT: " + getNumberPhone() +
                ",  Email: " + getEmail();

    }
}



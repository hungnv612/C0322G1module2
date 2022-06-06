package models;

public class Manage extends Person{
    private int salary;
    private int coefficients;

    public Manage() {

    }
    @Override
    public String getLine() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",
                super.getId(),
                super.getCode(),
                super.getName(),
                super.getDate(),
                super.getAddress(),
                getSalary(),
                getCoefficients());
    }
    public Manage(int salary, int coefficients) {
        this.salary = salary;
        this.coefficients = coefficients;
    }

    public Manage(int id, String code, String name, String date, String address, int salary, int coefficients) {
        super(id, code, name, date, address);
        this.salary = salary;
        this.coefficients = coefficients;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getCoefficients() {
        return coefficients;
    }

    public void setCoefficients(int coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public String toString() {
        return "manage{" + super.toString()+
                ", salary= " + salary +
                ", coefficients= " + coefficients +
                '}';
    }
}

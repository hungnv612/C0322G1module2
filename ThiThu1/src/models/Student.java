package models;

public class Student extends Person {
    private String classMe;
    private double point;

    public Student() {
    }

    @Override
    public String getLine() {
        return String.format("%s,%s,%s,%s,%s,%s",
                super.getId(),
                super.getName(),
                super.getDate(),
                super.getGender(),
                getClassMe(),
                getPoint());
    }

    public Student(String classMe, double point) {
        this.classMe = classMe;
        this.point = point;
    }

    public Student(int id, String name, String date, String gender, String classMe, double point) {
        super(id, name, date, gender);
        this.classMe = classMe;
        this.point = point;
    }

    public String getClassMe() {
        return classMe;
    }

    public void setClassMe(String classMe) {
        this.classMe = classMe;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "classMe='" + classMe + '\'' +
                ", point=" + point +
                '}';
    }
}

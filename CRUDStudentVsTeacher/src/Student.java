public class Student extends Person {
    private float point;

    public Student() {
    }

    public Student(int id, String name, int age, String gender, float point) {
        super(id, name, age, gender);
        this.point = point;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", point=" + point +
                '}';
    }
}

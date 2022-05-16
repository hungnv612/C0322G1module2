public class Teacher extends Person {
    private float salary;

    public Teacher() {
    }

    public Teacher(int id, String name, int age, String gender, float salary) {
        super(id, name, age, gender);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", salary=" + salary +
                '}';
    }
}

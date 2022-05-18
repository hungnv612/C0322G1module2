package BaiTap.ArrayList;

public class Person {
    String name;
    int Age;

    Person(String name, int age) {
        this.name = name;
        Age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", Age=" + Age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
//            Person person = (Person) obj;
        return this.name.equals(((Person) obj).name)
                && this.Age == ((Person) obj).Age;
    }
}

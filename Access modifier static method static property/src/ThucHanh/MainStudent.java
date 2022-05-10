package ThucHanh;

public class MainStudent {
    public static void main(String args[]) {
        Student.change(); //calling change method

        //creating objects
        Student s1 = new Student(1, "Hoang");
        Student s2 = new Student(2, "Khanh");
        Student s3 = new Student(3, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}

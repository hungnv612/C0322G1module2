package BaiTap.ClassFan;


public class MainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, 10, "yellow");
        Fan fan2 = new Fan(2, false, 5, "blue");
        fan1.display();
        fan2.display();
    }
}

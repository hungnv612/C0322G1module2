package BaiTap.ClassFan;

import BaiTap.ClassFan.Fan;

public class MainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, 10, "yellow");
        Fan fan2 = new Fan(2, false, 5, "blue");
        Fan fan3 = new Fan(3, true, 5, "pink");
        System.out.println(fan1.Printf());
        System.out.println(fan2.Printf());
        System.out.println(fan3.Printf());
    }
}

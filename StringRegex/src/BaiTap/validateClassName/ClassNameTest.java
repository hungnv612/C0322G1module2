package BaiTap.validateClassName;

import java.util.Scanner;

public class ClassNameTest {
    public static void main(String[] args) {
        ClassName className = new ClassName();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input class name: ");
        String nameClass = scanner.nextLine();
        boolean isValid = className.validate(nameClass);
        System.out.println("Class name is " + isValid);
    }
}

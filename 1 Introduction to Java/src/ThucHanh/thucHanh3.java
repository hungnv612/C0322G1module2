package ThucHanh;

import java.util.Scanner;

public class thucHanh3 {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);//Khai báo đối tượng Scanner
        do {
            System.out.println("Enter width: ");
            width = scanner.nextFloat();//Nhập chiều rộng
            if (width>=0){
                break;
            }

        }while (true);


        System.out.println("Enter height: ");
        height = scanner.nextFloat();//Nhập chiều dài
        float area = width * height;

        System.out.println("Area is: " + area);
    }
}

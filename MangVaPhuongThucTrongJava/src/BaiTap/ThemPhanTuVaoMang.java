package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag =true;
        int arrLength = (21);
        int[] arr = new int[arrLength];
        System.out.println("Độ dài của mảng:  " + arrLength);
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhập 5 mảng nhập mảng vị trí " + i + " : ");
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        do {
        System.out.println("nhập vị trí mảng cần push(0 -> 20)&chọn(-1)để kết thúc");
        int push = scanner.nextInt();
        if (push==-1){
            flag =false;
            break;
        }
        System.out.println("nhập giá trị: ");
        int giaTri = scanner.nextInt();
        for (int i = arrLength-1; i > push; i--) {
            arr[i]=arr[i-1];
        }
        arr[push]=giaTri;
        System.out.println(Arrays.toString(arr));
        }while (flag =true);
    }

}


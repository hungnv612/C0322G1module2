package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
            Scanner scanner =new Scanner(System.in);
            System.out.print("Độ dài mảng 1:  ");
            int arrLength1 = scanner.nextInt();
            int[] arr1 = new int[arrLength1];
            for (int i = 0; i <arrLength1 ; i++) {
                System.out.print("Nhập mang vị trí "+i+" : ");
                arr1[i]=scanner.nextInt();
            }
        System.out.print("Độ dài mảng 2:  ");
        int arrLength2 = scanner.nextInt();
        int[] arr2 = new int[arrLength2];
        for (int i = 0; i <arrLength2 ; i++) {
            System.out.print("Nhập mang vị trí "+i+" : ");
            arr2[i]=scanner.nextInt();

        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = new int[arrLength1+arrLength2];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length+i]=arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }

}

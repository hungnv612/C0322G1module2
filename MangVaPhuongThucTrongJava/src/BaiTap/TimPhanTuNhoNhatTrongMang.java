package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class TimPhanTuNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size : ");
        int size = scanner.nextInt();
        int[] numberArray = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ: " + i);
            numberArray[i] = scanner.nextInt();

        }
        System.out.println("Array : " + Arrays.toString(numberArray));
        int min = numberArray[0];
        for (int j : numberArray) {
            if (j < min) {
                min = j;
            }

        }
        System.out.println("Phần tử nhỏ nhất : " + min);
    }
}
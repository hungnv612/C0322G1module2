package BaiTap.InvertElementStack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseArrayStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NHập độ dài mảng");
        int arrLength = scanner.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            System.out.println("nhập phần tử");
            arr[i] = scanner.nextInt();
        }
        for (int item : arr) {
            System.out.println(item);
        }
        Stack<Integer> stack = new Stack<>();
        for (int value :
                arr) {
            stack.push(value);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println("Mảng sau khi đổi: " + Arrays.toString(arr));
    }
}

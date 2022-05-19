package BaiTap;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int change = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        while (change > 0) {
            stack.push(change % 2);
            change = change / 2;
        }
        int num = stack.size();
        for (int i = 0; i < num; i++) {
            stack1.add(stack.pop());
        }
        System.out.println(stack1);
    }
}

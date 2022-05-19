package BaiTap;

import java.util.*;

public class ChainPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        boolean flag = false;
        System.out.println("NHập một chuỗi  ");
        String str = scanner.nextLine();
        String[] arrStr = str.toUpperCase().split("");
        int cout = arrStr.length;
        Collections.addAll(queue, arrStr);
        Collections.addAll(stack, arrStr);
        for (int i = 0; i < cout; i++) {
            if (queue.poll().equals(stack.pop())) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("đây là chuỗi palindrome");
        } else {
            System.out.println("đây ko phải là chuỗi palindrome");
        }

    }
}

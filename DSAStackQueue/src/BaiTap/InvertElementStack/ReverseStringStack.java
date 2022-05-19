package BaiTap.InvertElementStack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStringStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "abcdef";
        System.out.println(word);
        String[] arrString = word.split("");
        Stack<String> stack = new Stack<>();
        for (String value : arrString
        ) {
            stack.push(value);
        }
        for (int i = 0; i < arrString.length; i++) {
            arrString[i] = stack.pop();
        }
        System.out.println(Arrays.toString(arrString));
    }
}

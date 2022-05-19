package BaiTap;

import java.util.Scanner;
import java.util.Stack;

public class TestBracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        System.out.println("NHập một chuỗi  ");
        String str = scanner.nextLine();
        String[] arrStr = str.toUpperCase().split("");
       boolean flag = true;
        for (String item:arrStr) {
            if (item.equals("(")) {
                stack.add(item);
            }else if ( item.equals(")")){
                if (stack.isEmpty()){
                    flag=false;
                }else {
                    stack.pop();
                }
            }
        }
        if (!stack.isEmpty()){
            flag = false;
        }
        if (flag){
            System.out.println("Well");
        }else {
            System.out.println("???");
        }
    }
}

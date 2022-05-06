package BaiTap;

import java.util.Scanner;

public class HienThiCacSoNguyenToBeHon100 {
    public static void main(String[] args) {
        int numbers=100;
        int count = 0;
        int N =2;
        while (N < numbers){
            boolean flag =true;
            for (int i = 2; i < N; i++) {
                if (N % i == 0){
                    flag=false;
                    break;
                }
            }
            if (flag){
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}

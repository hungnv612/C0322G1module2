package BaiTap;

import java.util.Scanner;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        int numbers;
        int count = 0;
        int N =2;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập số nguyên tố cần in........");
        numbers=scanner.nextInt();
        while (count < numbers){
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

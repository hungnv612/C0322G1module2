package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một chuỗi:");
        String str = scanner.nextLine();
        char[] str1 = str.toCharArray();
        System.out.println(Arrays.toString(str1));
        //hàm to chararay chuyển chuỗi thành mảng;
        System.out.println("Ký tự cần kiếm: ");
        String word = scanner.nextLine();
        char[] word1 = word.toCharArray();

        int count = 0;
        for (int i = 0; i < str1.length; i++) {
            if(word1[0] == str1[i]) {
                count++;
            }

        }
        System.out.println(word + " xuat hien " + count + " lan");
    }
}

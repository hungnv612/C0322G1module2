package BaiTap;

import java.util.Scanner;
import java.util.TreeMap;

public class CountingNumbersMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = input.nextLine();

        TreeMap<String, Integer> countMap = new TreeMap<>();

        int value = 0;
        String[] arrStr = str.toUpperCase().split("");

        for (String item : arrStr) {
            if (countMap.containsKey(item)) {
                value = countMap.get(item)+1;
                countMap.put(item, value);
            } else {
                value = 1;
                countMap.put(item, value);
            }
        }

        System.out.println(countMap);
    }
}

package BaiTap;

import java.util.Arrays;

public class insertSortList {
    public static void insertSort(double[] list) {
        int n = list.length;
        for (int i = 1; i < n; ++i) {
//          key = phần tử chèn vào trong danh sách con
            int key = (int) list[i];
//           Vị trí của phần tử cuối cùng ở danh sách con
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
            System.out.println(Arrays.toString(list));
        }
    }
    public static void main(String[] args) {
        double[] a = {2, 5, 3, 4, 1};
        insertSort(a);
    }
}

package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSort(list);
    }
    public static void insertionSort(int[] array) {
        System.out.println("  array chưa được sắp xếp "+ Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int key = i;
            for (int j = i+1 ; j <array.length ; j++) {
                if (array[j]<array[key]){
                    key= j;
                }
            }
            if (key!= i){
                int temp = array[i];
                array[i]=array[key];
                array[key]= temp;
            }
            System.out.println("lần thứ "+i+": "+Arrays.toString(array));
        }
        System.out.println("   result"+ Arrays.toString(array));
    }
}

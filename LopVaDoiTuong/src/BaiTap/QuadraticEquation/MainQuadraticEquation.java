package BaiTap.QuadraticEquation;

import BaiTap.QuadraticEquation.QuadraticEquation;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập A: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập B: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập C: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation =new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta<0){
            System.out.println("Phương Trình vô nghiệm ");
        }else if (delta==0){
            System.out.println("Phương trình có nghiệm kép ");
            System.out.println("Nghiệm 1 = Nghiệm 2 : "+quadraticEquation.getDoubleRoot());
        }else{
            System.out.println("Phương trình 2 nghiệm phân biệt ");
            System.out.println("Nghiệm 1 : "+quadraticEquation.getRoot1());
            System.out.println("Nghiệm 2 : "+quadraticEquation.getRoot2());
        }

    }
}

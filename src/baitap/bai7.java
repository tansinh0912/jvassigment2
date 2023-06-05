package baitap;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap Du Lieu: ");
        int a = scanner.nextInt();

        if (a >0){
            System.out.println("Gia Tri: " +a);
        }
        else if (a<0) {
            System.out.println("Gia Tri: "+(-a));
        }
        else {
            System.out.println("Gia Tri Bang 0");
        }
    }
}

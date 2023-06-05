package baitap;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nguoi Dung Nhap Lieu 1: ");
        int a = scanner.nextInt();

        System.out.print("Nguoi Dung Nhap Lieu 2 : ");
        int b = scanner.nextInt();

        if (a >b){
            System.out.println("Gia Tri Lon Nhat: " +a);
        } else if (a==b) {
            System.out.println("Hai Gia Tri Bang Nhau");
        } else {
            System.out.println("Gia Tri Lon Nhat: " +b);
        }
    }
}

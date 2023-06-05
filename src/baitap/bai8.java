package baitap;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap Bien X: ");
        int x = scanner.nextInt();

        System.out.print("Nhap Bien Y: ");
        int y = scanner.nextInt();

        System.out.print("Nhap Bien Z: ");
        int z  = scanner.nextInt();

        if (x == 2){
            System.out.println("Gia Tri x Dung");
        }
        else {
            System.out.println("Gia Tri x Sai");
        }
        if (x != 5){
            System.out.println("Gia Tri x Dung");
        }
        else {
            System.out.println("Gia Tri x Sai");
        }
        if (x !=5 && y >=5){
            System.out.println("Gia Tri x&y Dung");
        }
        else {
            System.out.println("Gia Tri x&y Sai");
        }
        if (z !=0 || x ==2){
            System.out.println("Gia Tri z&x Dung");
        }
        else {
            System.out.println("Gia Tri z&x Sai");
        }
        if (!(y<10)){
            System.out.println("Gia Tri y Dung");
        }
        else {
            System.out.println("Gia Tri y Sai");
        }
    }
}

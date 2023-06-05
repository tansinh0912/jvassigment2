package baitap;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap Du Lieu Nam: ");
        int a = scanner.nextInt();

        boolean b;
        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0) {
                    b = true;
                } else {
                    b = false;
                }
            } else {
                b = true;
            }
        }else {
            b =false;
        }
        if (b) {
            System.out.println("La Nam Nhuan");
        }
        else {
            System.out.println("Khong La Nam Nhuan");
        }
    }
}

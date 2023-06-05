package baitap;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tuoi Nguoi Thu 1: ");
        int a = scanner.nextInt();

        System.out.print("Tuoi Nguoi Thu 2: ");
        int b = scanner.nextInt();

        System.out.print("Tuoi Nguoi Thu 3: ");
        int c = scanner.nextInt();

        if (a > b) {
            if (a > c && b>c ) {
                System.out.println("So Tuoi Lon Nhat: " + a);
            } else {
                System.out.println("So Tuoi Lon Nhat: " + c);
            }
        }
        if (b > c) {
            if (c > a ) {
                System.out.println("So Tuoi Lon Nhat: " + b);

            } else {
                System.out.println("So Tuoi Nho Nhat: " + c);
            }
        }
    }
}


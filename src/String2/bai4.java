package String2;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap Chuoi 1: ");
        String a = scanner.next();

        System.out.print("Nhap Chuoi 2: ");
        String b = scanner.next();

        String noichuoi = a+b;

        System.out.println("Ket Qua: " + noichuoi);
    }
}

package baitap;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Xin Nhap So Diem: ");
        int a = scanner.nextInt();

        if (a < 25) {
            System.out.println("Ban Diem F");
        } else if (a < 45) {
            System.out.println("Ban Diem E");
        } else if (a < 50) {
            System.out.println("Ban Diem D");
        } else if (a < 60) {
            System.out.println("Ban Diem C");
        } else if (a < 80) {
            System.out.println("Ban Diem B");
        } else if (a < 100) {
            System.out.println("Ban Diem A");
        } else {
            System.out.println("Loi Nguoi Nhap");
        }
    }
}

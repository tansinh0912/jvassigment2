package baitap;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Muc Luong Hien Tai: ");
        int a = scanner.nextInt();

        System.out.print("So Nam Lam Viec: ");
        int b = scanner.nextInt();

        if (b >=5){
            System.out.println("So Tien Thuong Duoc Nhan: " +(a*0.05));
        }
        else {
            System.out.println("Ban Chua Dat Yeu Cau");
        }
    }
}

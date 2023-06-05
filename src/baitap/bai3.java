package baitap;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("So Luong Can Mua: ");
        int a = scanner.nextInt();
        int b = 100;
        if (a >= 1000){
            System.out.println("Don Hang Duoc Giam Gia 10% : " +(a*b*0.9));
        }
        else {
            System.out.println("Don Hang Khong Duoc Giam Gia" + a*b);
        }
    }
}

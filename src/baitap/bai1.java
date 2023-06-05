package baitap;

import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Chieu Dai: ");
        int a = scanner.nextInt();

        System.out.print("Chieu Rong: ");
        int b = scanner.nextInt();

        if (a >b){
            System.out.println("La Hinh Chu Nhat");
        }
        else {
            System.out.println("La Hinh Chu Vuong");
        }
    }
}

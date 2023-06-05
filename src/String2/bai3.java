package String2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chuoi 1: ");
        String a = scanner.next();

        System.out.print("Nhap chuoi 2: ");
        String b = scanner.next();

        boolean ketqua;

        ketqua = a.equalsIgnoreCase(b);

        System.out.println("Ket Qua: "+ketqua);
    }
}

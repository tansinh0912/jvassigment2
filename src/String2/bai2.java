package String2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap Tu Ban Phim 1 : ");
        String a = scanner.next();

        System.out.print("Nhap Tu Ban Phim 2: ");
        String b = scanner.next();

        boolean sosanh;

        sosanh = a.equals(b);
        System.out.println("Ket Qua: " +sosanh);
    }
}

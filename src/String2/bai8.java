package String2;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap Chuoi Thu 1: ");
        String a = scanner.next();

        System.out.print("Nhap Chuoi Thu 2: ");
        String b = scanner.next();

        boolean ketqua;
        ketqua = a.equals(b);

        if (ketqua){
            System.out.println("Gia Tri 2 Chuoi Chua Cung Du Lieu");
        }
        else {
            System.out.println("Gia Tri 2 Chuoi Khong Chua Cung Du Lieu");
        }
    }
}

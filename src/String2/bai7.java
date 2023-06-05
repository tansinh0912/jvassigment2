package String2;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap Chuoi Thu 1: ");
        String a1 = scanner.next();

        System.out.print("Nhap Chuoi Thu 2: ");
        String b1 = scanner.next();

        boolean ketqua;
        ketqua= a1.endsWith(b1);

       if (ketqua){
           System.out.println("Co Noi Gia Tri Thu 2");
       }
       else {
           System.out.println("Khong Noi Gia Tri");
       }

    }
}

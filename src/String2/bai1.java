package String2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String bai1 = "Nguyen Tan Sinh";

        System.out.println("Nhap Ky Tu: " );
        int a = scanner.nextInt();

        if (a>0 && a<bai1.length()){
            char b = bai1.charAt(a);
            System.out.println("Nhap Ky So: " +a+ "Ky Tu La: " +b);
        }
        else {
            System.out.println("Phuong Trinh Loi");
        }
    }
}

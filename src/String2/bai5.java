package String2;

import java.util.Scanner;

public class bai5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String chuoi = "Bai Tap Ve Nha";


        System.out.print("Nhap Chuoi Can Xac Dinh: ");
        String chuoinhap = scanner.next();


        if (chuoi.indexOf(chuoinhap) == -1){

            System.out.println("Chuoi Khong Duoc Tim Thay" );
        }
        else {
            System.out.println("Chuoi Duoc Tim Thay ");
        }
    }
}

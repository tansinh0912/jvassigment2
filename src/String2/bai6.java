package String2;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a ="Nguyen Tan Sinh";

        System.out.print("Nhap Chuoi Ky Tu: ");
        String b = scanner.next();

        boolean ketqua;
        ketqua = a.equalsIgnoreCase(b);
        //ketqua van khong kiem tra phan biet chu in hoa va thuong

        System.out.println("Ket Qua: "+ketqua);
    }
}

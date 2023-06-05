package String2;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = "Bai Tap Ve Nha";

        System.out.print("Ky Tu Can Duoc Thay Doi: ");
        char oldChar = scanner.next().charAt(0);

        System.out.print("Ky Tu Muon Duoc Thay Doi: ");
        char newChar = scanner.next().charAt(0);

        String ketqua  = a.replace(oldChar,newChar);

        System.out.println("Sau Khi Thay Doi: " +ketqua);

    }
}
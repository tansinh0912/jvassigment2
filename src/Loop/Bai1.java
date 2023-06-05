package Loop;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap Bien A: ");
        int a = scanner.nextInt();

        System.out.print("Nhap Bien B: ");
        int b = scanner.nextInt();

        int BSCNN;

        while (a != b){
            if (a>b){
                System.out.println("Uoc Chung Lon Nhat: "+(a-b));
                System.out.println("Boi So Chung NN: " +(BSCNN= (a*b)/(a-b)));
            }
            else {
                System.out.println("Uoc Chung Lon Nhat: "+(b-a));
                System.out.println("Boi So Chung NN: "+(BSCNN=(a*b)/(b-a)));
            }
            break;
        }
    }
}

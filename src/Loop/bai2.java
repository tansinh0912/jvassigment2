package Loop;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap So Nguyen To: ");
        int n = scanner.nextInt();

        System.out.printf("%d so nguyen to dau tien: \n", n);
        int dem = 0;
        int i = 2;

        while (dem < n) {
            if (soNguyenTo(i)) {
                System.out.println(i + " ");
                dem++;
            }
            i++;
        }
    }


    public static boolean soNguyenTo(int n){

        if(n<2){
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i<= sqrt; i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
}

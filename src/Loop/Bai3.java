package Loop;

import java.util.Scanner;

public class Bai3 {

        // Hàm để tính tổng các chữ số của một số nguyên
        public static int Bai3(int n) {
            int sum = 0; // Biến để lưu trữ tổng
            while (n > 0) { // Lặp cho đến khi n = 0
                sum = sum + n % 10; // Cộng phần dư của n chia cho 10 vào tổng
                n = n / 10; // Cập nhật n bằng phần nguyên của n chia cho 10
            }
            return sum; // Trả về tổng
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); // Tạo đối tượng Scanner để nhập liệu
            System.out.print("Nhập một số nguyên: ");
            int n = sc.nextInt(); // Nhập một số nguyên từ bàn phím
            int sum = Bai3(n); // Gọi hàm tính tổng các chữ số của n
            System.out.println("Tổng các chữ số của " + n + " là: " + sum); // In kết quả ra màn hình
        }
    }



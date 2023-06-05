package String2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class bai9 {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        //xac dinh Ngay Gio Hien Tai

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yy HH-mm-ss");
        // Hien Thi Len Man Hinh

        String formatter = now.format(format);
        //Gan Gia Tri De In Ra Ket Qua

        System.out.println("In Ket Qua: "+formatter);
    }
}
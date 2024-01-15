package SD19317MOB1014.Buoi5;

import java.util.Scanner;

// Đặt vấn đề: Chương trình nhập điểm cho sinh viên
// Nếu điểm nhập vào không trong khoảng từ 0 - 10 thì bắt người dùng nhập lại
public class DoWhileNhapDiem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diem = 0;
        do {
            System.out.print("Vui lòng nhập điểm: ");
            diem = sc.nextInt();
        } while( !(0 <= diem && diem <= 10) );
    }
}

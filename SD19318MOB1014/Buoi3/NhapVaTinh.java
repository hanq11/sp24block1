package SD19318MOB1014.Buoi3;

import java.util.Scanner;

/**
 *
 * @author syn
 * Nhập số từ bàn phím. 
 * Nếu số dương thì tính và xuất căn bậc 2 
 * của số đó ra màn hình
 * 
 */
public class NhapVaTinh {
    public static void main(String args[]) {
        // Khởi tạo object Scanner để nhập dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập một số dương: ");
        // Nhập số int từ bàn phím
        int so = sc.nextInt();
        // Nếu số > 0 thì tính toán và in kết quả
        // Ngược lại, in thông báo lỗi cho người dùng
        if(so > 0) {
            // Thực hiện tính toán và in kết quả trực tiếp trong lệnh println
            System.out.println(Math.sqrt(so));
        } else {
            System.out.println("Số được nhập phải lớn hơn 0");
        }
    } 
}
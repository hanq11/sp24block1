package SD19317MOB1014.Buoi3;

import java.util.Scanner;

/**
 *
 * @author syn
 * Nhập số từ bàn phím. 
 * Nếu số dương thì tính và xuất căn bậc 2 
 * của số đó ra màn hình
 */
public class TinhToanVoiIf {
    public static void main(String[] args) {
        // Khởi tạo object Scanner để nhập dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui long nhap 1 so duong: ");
        // Nhập số int từ bàn phím
        int so = sc.nextInt();
        // Nếu số > 0 thì tính toán và in kết quả
        if(so > 0) {
            // Kiểu 1: Gán kết quả vào biến ketQua và in
            double ketQua = Math.sqrt(so);
            System.out.println(ketQua);
            // Kiểu 2: Thực hiện tính toán và in kết quả trực tiếp trong lệnh println
            System.out.println(Math.sqrt(so));
        }
    }    
}

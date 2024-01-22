package SD19317MOB1014.Buoi9;

import java.util.ArrayList;
import java.util.Scanner;

// Nhập vào danh sách số thực ArrayList<Double>. 
// Tính tổng và xuất ra màn hình

public class NhapDiemArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Khởi tạo ArrayList để lưu trữ các giá trị Double
        ArrayList<Double> mangDiem = new ArrayList<Double>();
        System.out.print("Vui lòng nhập số lượng điểm muốn nhập: ");
        int soLuong = sc.nextInt();
        for(int i = 0; i < soLuong; i++) {
            System.out.printf("Vui lòng nhập điểm thứ %d: ", i);
            double diem = sc.nextDouble();
            mangDiem.add(diem);
        }
        double tong = 0;
        // For-each
        for(Double x: mangDiem) {
            tong += x;
        }
        System.out.printf("Tổng điểm là: %.2f", tong);
    }
}

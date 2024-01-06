package SD19318MOB1014.Buoi2;

import java.util.Scanner;

/**
 *
 * @author syn
 * Khai báo 2 biến hoten và tuoi
 * Nhập họ tên và tuổi từ bàn phím
 * Xuất ra dòng theo định dạng sau
 * <<hoten>> năm nay <<tuoi>> tuoi
 */
public class NhapTenTuoi {
    public static void main(String[] args) {
        String hoTen;
        int tuoi;

        // Khởi tạo đối tượng sc có kiểu là Scanner 
        // để đọc ghi các dữ liệu nhập vào từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui long nhap ho va ten: ");
        // Sử dụng phương thức nextLine của đối tượng sc 
        // để đọc chuỗi được nhập từ bàn phím
        hoTen = sc.nextLine();
        System.out.print("Vui long nhap tuoi: ");
        // Sử dụng phương thức nextInt của đối tượng sc 
        // để đọc số nguyên được nhập từ bàn phím
        tuoi = sc.nextInt();
        System.out.println(hoTen + " nam nay " + tuoi);
    }
}

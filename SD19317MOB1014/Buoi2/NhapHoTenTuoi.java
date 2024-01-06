package SD19317MOB1014.Buoi2;

import java.util.Scanner;

/**
 *
 * @author syn
 * Nhập vào hoten và tuoi, sau đó in ra màn hình
 */
public class NhapHoTenTuoi {
    public static void main(String[] args) {
        // Khởi tạo đối tượng sc có kiểu là Scanner 
        // để đọc ghi các dữ liệu nhập vào từ bàn phím
        Scanner sc = new Scanner(System.in);
        String hoTen;
        int tuoi;
        System.out.print("Vui lòng nhập tên: ");
        // Sử dụng phương thức nextLine của đối tượng sc 
        // để đọc chuỗi được nhập từ bàn phím
        hoTen = sc.nextLine();
        System.out.print("Vui lòng nhập tuổi: ");
        // Sử dụng phương thức nextInt của đối tượng sc 
        // để đọc số nguyên được nhập từ bàn phím
        tuoi = sc.nextInt();
        System.out.printf("%s nam nay %d tuoi", hoTen, tuoi);
    }
}

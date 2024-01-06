package SD19317MOB1014.Buoi2;

/**
 *
 * @author syn
 * Khai báo 2 biến hoten và tuoi
 * Sử dụng cả 3 hàm trên để xuất dòng sau
 * <<hoten>> năm nay <<tuoi>> tuoi
 */
public class InHoTen {
    public static void main(String[] args) {
        // Khởi tạo chuỗi (String) hoTen và đặt giá trị khởi tạo
        String hoTen = "Nguyen Van A";
        int tuoi = 18;
        // Lệnh in println, lệnh này sẽ tự động xuống dòng
        System.out.println(hoTen + " nam nay " + tuoi);
        // Lệnh in printf, tương tự như lệnh in printf đã học ở môn COM108
        System.out.printf("%s nam nay %d\n", hoTen, tuoi);
        // Lệnh in print, lệnh này sẽ không tự động xuống dòng
        System.out.print(hoTen + " nam nay " + tuoi);
    }
}

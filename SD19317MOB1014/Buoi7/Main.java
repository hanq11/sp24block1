package SD19317MOB1014.Buoi7;


/**
 *
 * @author syn
 */
public class Main {
    public static void main(String[] args) {
        // Khởi tạo đối tượng SinhVien
        SinhVien sv = new SinhVien();
        // Gọi các phương thức của đối tượng
        sv.nhapTenVaDiem();
        sv.xuatTenVaDiem();
        // Truy cập vào các thuộc tính của đối tượng
        System.out.println(sv.hoTen);
        System.out.println(sv.diem);
        // Gọi các phương thức nạp chồng (overloading) của đối tượng
        // Các phương thức này cùng tên nhưng khác tham số truyền vào
        sv.tinhDiem(4, 6);
        sv.tinhDiem(1, 2, 3);
    }
}

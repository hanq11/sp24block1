package SD19317MOB1014.Buoi8.SinhVien;

/**
 *
 * @author syn
 */
public class TinhDongGoi {
    public static void main(String[] args) {
        // Khởi tạo đối tượng SinhVien
        SinhVien sv = new SinhVien();
        // Sử dụng setter để đặt giá trị của thuộc tính hoTen bên trong đối tượng
        sv.setHoTen("Nguyen van a");
        // Sử dụng getter để truy xuất giá trị thuộc tính của đối tượng
        System.out.println(sv.getHoTen());
        sv.setDiem(99);
        System.out.println(sv.getDiem());
    }
}
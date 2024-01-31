package SD19318MOB1014.Buoi13.QuanLyVanPhong;

public class Main {
    public static void main(String[] args) {
        NhanVien nam = new NhanVien("Nam", 10);
        TruongPhong tu = new TruongPhong("tu", 15, 2);
        LaoCong huyen = new LaoCong("Huyen", 5, 100);

        nam.inThongTin();
        tu.inThongTin();
        huyen.inThongTin();

        // Polymorphism - Tinh da hinh
        NhanVien a = new TruongPhong("a", 4, 2);
        NhanVien b = new LaoCong("b", 6, 1);
        a.inThongTin();
        b.inThongTin();
    }
}

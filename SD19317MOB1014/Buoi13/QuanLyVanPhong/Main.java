package SD19317MOB1014.Buoi13.QuanLyVanPhong;

public class Main {
    public static void main(String[] args) {
        NhanVien nam = new NhanVien("Nam", 3);
        TruongPhong tu = new TruongPhong("Tu", 4, 2);
        LaoCong le = new LaoCong("Le", 1, 900);

        nam.inThongTin();
        tu.inThongTin();
        le.inThongTin();

        NhanVien tuan = new TruongPhong("tuan", 6, 7);
        tuan.inThongTin();
    }
}

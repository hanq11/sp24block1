package SD19318MOB1014.Buoi13.QuanLyVanPhong;

public class LaoCong extends NhanVien{
    public double soGioLamViec;

    public LaoCong(String hoTen, double luong, double soGioLamViec) {
        super(hoTen, luong);
        this.soGioLamViec = soGioLamViec;
    }

    @Override
    public double getThuNhap() {
        return this.luong * this.soGioLamViec;
    }

    @Override
    public void inThongTin() {
        System.out.printf("Lao cong: %s co thu nhap la: %.2f \n", this.hoTen, this.getThuNhap());
    }
}

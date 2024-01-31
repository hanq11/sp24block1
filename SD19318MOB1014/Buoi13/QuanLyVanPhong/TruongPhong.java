package SD19318MOB1014.Buoi13.QuanLyVanPhong;

public class TruongPhong extends NhanVien {
    public double trachNhiem;

    public TruongPhong(String hoTen, double luong, double trachNhiem) {
        super(hoTen, luong);
        this.trachNhiem = trachNhiem;
    }

    @Override
    public double getThuNhap() {
        return this.luong * 15 + this.trachNhiem * 2;
    }

    @Override
    public void inThongTin() {
        System.out.printf("Truong phong: %s co thu nhap la: %.2f \n", this.hoTen, this.getThuNhap());
    }
}

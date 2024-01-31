package SD19317MOB1014.Buoi13.QuanLyVanPhong;

public class TruongPhong extends NhanVien {
    public double trachNhiem;

    public TruongPhong(String hoTen, double luong, double trachNhiem) {
        super(hoTen, luong);
        this.trachNhiem = trachNhiem;
    }

    @Override
    public double getThuNhap() {
        return (this.luong * 15 + trachNhiem * 5);
    }

    @Override
    public void inThongTin() {
        System.out.printf("Truong Phong: %s co luong la: %.2f \n", this.hoTen, this.getThuNhap());
    }    
}

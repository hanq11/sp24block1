package SD19317MOB1014.Buoi13.QuanLyVanPhong;

public class NhanVien {
    protected String hoTen;
    protected double luong;

    public NhanVien(String hoTen, double luong) {
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public double getThuNhap() {
        return this.luong * 10;
    }

    public void inThongTin() {
        System.out.printf("Nhan Vien: %s co luong la: %.2f \n", this.hoTen, this.getThuNhap());
    }
}

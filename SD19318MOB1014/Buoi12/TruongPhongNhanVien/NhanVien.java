package SD19318MOB1014.Buoi12.TruongPhongNhanVien;

public class NhanVien {
    public String hoTen = "Nguyen Van A";
    public double luong;

    public NhanVien(String hoTen, double luong) {
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public void inThongTin() {
        System.out.println("Ho ten nhan vien la: " + hoTen);
    }
}

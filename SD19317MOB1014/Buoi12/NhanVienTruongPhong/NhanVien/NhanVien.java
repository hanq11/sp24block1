package SD19317MOB1014.Buoi12.NhanVienTruongPhong.NhanVien;

public class NhanVien {
    public String hoTen;
    protected double luong;
    
    public NhanVien(String hoTen, double luong) {
        this.hoTen = hoTen;
        this.luong = luong;
    }
    
    void xuatHoTen() {
        System.out.println(hoTen);
    }
    
    private void xuatLuong() {
        System.out.println(luong);
    }
    
    public void xuatThongTin() {
        System.out.printf("nhan vien: %s co luong la %f", hoTen, luong);
    }
}

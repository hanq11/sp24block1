package SD19317MOB1014.Buoi10.SapXepSinhVien;

public class SinhVien {
    private String hoTen;
    private double diem;

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getHoTen() {
        return this.hoTen;
    }
    public double getDiem() {
        return diem;
    }
    public void setDiem(double diem) {
        this.diem = diem;
    }
    public void xuatThongTin() {
        System.out.printf("Sinh vien %s co diem la: %f\n", this.getHoTen(), this.getDiem());
    }
}

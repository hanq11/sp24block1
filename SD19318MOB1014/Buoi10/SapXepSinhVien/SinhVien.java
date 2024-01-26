package SD19318MOB1014.Buoi10.SapXepSinhVien;

public class SinhVien {
    private String hoTen;
    private int diem;

    public SinhVien(String hoTen, int diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public void inThongTin() {
        System.out.printf("Sinh vien %s co diem la: %d\n", this.hoTen, this.diem);
    }
    
}

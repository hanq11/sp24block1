package SD19317MOB1014.Buoi8.SinhVien;

/**
 *
 * @author syn
 */
public class SinhVien {
    private String hoTen;
    private double diem;

    // Getter của thuộc tính hoTen
    public String getHoTen() {
        return hoTen;
    }

    // Setter của thuộc tính hoTen
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    // Getter của thuộc tính diem
    public double getDiem() {
        return diem;
    }

    // Setter của thuộc tính diem
    public void setDiem(double diem) {
        if(diem > 100) {
            System.out.println("Loi");
        } else {
            this.diem = diem;
        }
        
    }
}
package SD19317MOB1014.Buoi12.NhanVienTruongPhong.TruongPhong;

import SD19317MOB1014.Buoi12.NhanVienTruongPhong.NhanVien.NhanVien;

/**
 *
 * @author syn
 */
public class TruongPhong extends NhanVien{
    public double trachNhiem;
    
    public TruongPhong(String hoTen, double luong, double trachNhiem) {
        super(hoTen, luong);
        this.trachNhiem = trachNhiem;
    }
    
    void xuat() {
        System.out.println(super.hoTen);
        System.out.println(super.luong);
    }
    
    public double getLuong() {
        return luong;
    }
}


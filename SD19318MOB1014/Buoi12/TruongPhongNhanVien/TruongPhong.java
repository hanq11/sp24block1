package SD19318MOB1014.Buoi12.TruongPhongNhanVien;

public class TruongPhong extends NhanVien{
    public double trachNhiem;

    public TruongPhong(String hoTen, double luong, double trachNhiem) {
        super(hoTen, luong);
        this.trachNhiem = trachNhiem;
    }
}

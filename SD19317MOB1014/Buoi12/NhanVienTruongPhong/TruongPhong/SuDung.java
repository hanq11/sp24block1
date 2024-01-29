package SD19317MOB1014.Buoi12.NhanVienTruongPhong.TruongPhong;

/**
 *
 * @author syn
 */
public class SuDung {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        TruongPhong tp = new TruongPhong("Nguyen Van A", 5.6, 1.0);
        System.out.println(tp.hoTen);
        System.out.println(tp.getLuong());
        tp.xuatThongTin();
    }
}

package SD19318MOB1014.Buoi8.GetterSetter;

/**
 *
 * @author syn
 */
public class TestTruongPhong {
    public static void main(String[] args) {
        TruongPhong tp = new TruongPhong();
        tp.setTen("Nam");
        tp.setLuong(100);
        System.out.println(tp.getTen());
        System.out.println(tp.getLuong());
    }
}


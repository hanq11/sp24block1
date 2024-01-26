package SD19318MOB1014.Buoi10.SapXepSinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SapXepSinhVienTheoDiem {
    public static void main(String[] args) {
        ArrayList<SinhVien> danhSachSV = new ArrayList<SinhVien>();
        danhSachSV.add(new SinhVien("nguyen van d", 9));
        danhSachSV.add(new SinhVien("nguyen van a", 4));
        danhSachSV.add(new SinhVien("nguyen van b", 10));
        danhSachSV.add(new SinhVien("nguyen van e", 1));
        Integer a = 1;
        Comparator<SinhVien> compTheoHoTen = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                // đối với kiểu nguyên thuỷ int, chúng ta sẽ không sử dụng được phương thức compareTo()
                // muốn sử dụng được các phương thức như compareTo(), chúng ta phải chuyển giá trị 
                // nguyên thuỷ, thành lớp bao (Wrapper) của int là Integer bằng phương thức Integer.valueOf()
                return sv1.getHoTen().compareTo(sv2.getHoTen());
            }
        };
        Collections.sort(danhSachSV, compTheoHoTen);
        for (SinhVien sinhVien : danhSachSV) {
            sinhVien.inThongTin();
        }
    }
}

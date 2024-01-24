package SD19317MOB1014.Buoi10.SapXepSinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SapXep {
    public static void main(String[] args) {
        ArrayList<SinhVien> danhSachSV = new ArrayList<SinhVien>();
        SinhVien sv1 = new SinhVien("Nguyen van A", 5.6);
        danhSachSV.add(sv1);
        danhSachSV.add(new SinhVien("Nguyen Thi C", 9));
        danhSachSV.add(new SinhVien("Doan van  B", 4));
        System.out.println("Truoc sap xep: ");
        for(SinhVien sv: danhSachSV) {
            sv.xuatThongTin();
        }
        // Sap xep sinh vien
        Comparator<SinhVien> comp = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Double.valueOf(o1.getDiem()).compareTo(o2.getDiem());
            }
        };
        Collections.sort(danhSachSV, comp);
        // danh sach sau sep xep
        System.out.println("Sau sap xep: ");
        for(SinhVien sv: danhSachSV) {
            sv.xuatThongTin();
        }
    }
}

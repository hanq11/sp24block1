package SD19318MOB1014.Buoi9.QuanLySinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> danhSachSV = new ArrayList<SinhVien>();
        SinhVien sv = new SinhVien("Nguyen Van A", 5);
        danhSachSV.add(sv);
        danhSachSV.add(new SinhVien("Vu Van D", 10));
        danhSachSV.add(new SinhVien("Nguyen Van E", 1));
        danhSachSV.add(new SinhVien("Tran Van F", 4));
        danhSachSV.add(new SinhVien("Le Le D", 9));
        int luaChon = 0;
        while(luaChon != 9) {
            inMenu();
            System.out.print("Vui long nhap lua chon: ");
            luaChon = sc.nextInt();
            sc.nextLine();
            switch(luaChon) {
                case 1:
                    nhapDanhSachSinhVien(danhSachSV);
                    break;
                case 2:
                    xuatDanhSachSinhVien(danhSachSV);
                    break;
                case 9:
                    System.out.println("Thoat");
                    break;
            }
        }
    }

    public static void inMenu() {
        System.out.println("1. Nhập danh sách sinh viên");
        System.out.println("2. Xuất danh sách sinh viên đã nhập");
        System.out.println("3. Xuất danh sách sinh viên theo khoảng điểm");
        System.out.println("4. Tìm sinh viên theo họ tên");
        System.out.println("5. Tìm và sửa sinh viên theo họ tên");
        System.out.println("6. Tìm và xóa theo họ tên");
        System.out.println("9. Kết thúc");
    }

    public static void nhapDanhSachSinhVien(ArrayList<SinhVien> danhSachSV) {
        while(true) {
            SinhVien sv = new SinhVien();
            sv.nhapThongTin();
            danhSachSV.add(sv);
            Scanner sc = new Scanner(System.in);
            System.out.print("Ban con muon nhap tiep khong, nhap N de thoat: ");
            if(sc.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
    }


    public static void xuatDanhSachSinhVien(ArrayList<SinhVien> danhSachSV) {
        for (SinhVien sv : danhSachSV) {
            sv.xuatThongTin();
        }
    }
}

package SD19318MOB1014.Buoi10.QuanLySinhVien;

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
                case 3:
                    xuatDanhSachSinhVienTheoKhoangDiem(danhSachSV);
                    break;
                case 4:
                    timSinhVienTheoHoTen(danhSachSV);
                    break;
                case 5:
                    timVaSuaSinhVienTheoHoTen(danhSachSV);
                    break;
                case 6:
                    timVaXoaTheoHoTen(danhSachSV);
                    break;
                case 7:
                    break;
                case 8:
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

    public static void xuatDanhSachSinhVienTheoKhoangDiem(ArrayList<SinhVien> danhSachSV) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui long nhap diem min: ");
        double min = sc.nextDouble();
        System.out.print("Vui long nhap diem max: ");
        double max = sc.nextDouble();
        // Nuot ky tu \n
        sc.nextLine();
        for (SinhVien sv : danhSachSV) {
            if(min <= sv.getDiem() && sv.getDiem() <= max) {
                sv.xuatThongTin();
            }
        }
    }

    public static void timSinhVienTheoHoTen(ArrayList<SinhVien> danhSachSV) {
        System.out.print("Vui long nhap ho ten can tim: ");
        Scanner sc = new Scanner(System.in);
        String hoTenCanTim = sc.nextLine();
        for (SinhVien sv : danhSachSV) {
            if(sv.getHoTen().toLowerCase().contains(hoTenCanTim.toLowerCase())) {
                sv.xuatThongTin();
            }
        }
    }

    public static void timVaSuaSinhVienTheoHoTen(ArrayList<SinhVien> danhSachSV) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui long nhap ho ten can tim: ");
        String hoTenCanTim = sc.nextLine();
        System.out.print("Vui long nhap diem moi: ");
        double diemMoi = sc.nextDouble();

        for (SinhVien sv : danhSachSV) {
            if(sv.getHoTen().toLowerCase().contains(hoTenCanTim.toLowerCase())) {
                sv.setDiem(diemMoi);
                sv.xuatThongTin();
            }
        }
    }

    public static void timVaXoaTheoHoTen(ArrayList<SinhVien> danhSachSV) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui long nhap ho ten can xoa: ");
        String hoTenCanTim = sc.nextLine();

        for (SinhVien sv : danhSachSV) {
            if(sv.getHoTen().contains(hoTenCanTim)) {
                // System.out.printf("Xoa thanh cong sinh vien co ten la: %s\n", sv.getHoTen());
                danhSachSV.remove(sv);
            }
        }
    }
}

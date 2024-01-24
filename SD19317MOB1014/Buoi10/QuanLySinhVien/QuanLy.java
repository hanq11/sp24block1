package SD19317MOB1014.Buoi10.QuanLySinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Khai bao danh sach sinh vien
        ArrayList<SinhVien> danhSachSV = new ArrayList<SinhVien>();
        // Nhap truoc sinh vien
        danhSachSV.add(new SinhVien("Bui Xuan Huan", 9.5));
        danhSachSV.add(new SinhVien("Duong Minh Tuyen", 4));
        danhSachSV.add(new SinhVien("Khanh Sky", 8));
        danhSachSV.add(new SinhVien("Phu Le", 3));
        danhSachSV.add(new SinhVien("Ngo Ba Kha", 10));
        int luaChon = 0;
        while(luaChon != 9) {
            inMenu();
            System.out.print("Vui long nhap lua chon: ");
            luaChon = sc.nextInt();
            // Nuot ky tu \n
            sc.nextLine();
            switch(luaChon) {
                case 1:
                    nhapDanhSachSV(danhSachSV);
                    break;
                case 2:
                    xuatDanhSachSV(danhSachSV);
                    break;
                case 3:
                    xuatDanhSachSVTheoKhoangDiem(danhSachSV);
                    break;
                case 4:
                    timSinhVienTheoHoTen(danhSachSV);
                    break;
                case 5:
                    timVaSuaTheoHoTen(danhSachSV);
                    break;
                case 6:
                    timVaXoaTheoHoTen(danhSachSV);
                    break;
                case 7:
                    sortTheoDiem(danhSachSV);
                    break;
                case 8:
                    sortTheoHoTen(danhSachSV);
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
        System.out.println("7. Sắp xếp theo điểm");
        System.out.println("8. Sắp xếp theo họ tên");
        System.out.println("9. Kết thúc");
    }

    public static void nhapDanhSachSV(ArrayList<SinhVien> danhSachSV) {
        while(true) {
            SinhVien sv = new SinhVien();
            sv.nhapThongTin();
            danhSachSV.add(sv);
            Scanner sc = new Scanner(System.in);
            System.out.print("Ban con muon nhap tiep khong, nhap N de dung lai: ");
            if(sc.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public static void xuatDanhSachSV(ArrayList<SinhVien> danhSachSV) {
        for(SinhVien sv : danhSachSV) {
            sv.xuatThongTin();
        }
    }

    public static void xuatDanhSachSVTheoKhoangDiem(ArrayList<SinhVien> danhSachSV) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui long nhap min: ");
        double min = sc.nextDouble();
        System.out.print("Vui long nhap max: ");
        double max = sc.nextDouble();
        sc.nextLine();
        for(SinhVien sv: danhSachSV) {
            if(min < sv.getDiem() && sv.getDiem() < max) {
                sv.xuatThongTin();
            }
        }
    }

    public static void timSinhVienTheoHoTen(ArrayList<SinhVien> danhSachSV) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui long nhap Ten sinh vien: ");
        String tenMuonTim = sc.nextLine();
        for(SinhVien sv: danhSachSV) {
            if(sv.getHoTen().contains(tenMuonTim)) {
                sv.xuatThongTin();
            }
        }
    }

    public static void timVaSuaTheoHoTen(ArrayList<SinhVien> danhSachSV) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui long nhap Ten sinh vien: ");
        String tenMuonTim = sc.nextLine();
        System.out.print("Vui long nhap diem moi cua sinh vien: ");
        double diemMoi = sc.nextDouble();
        sc.nextLine();
        for(SinhVien sv: danhSachSV) {
            if(sv.getHoTen().contains(tenMuonTim)) {
                sv.setDiem(diemMoi);
                sv.xuatThongTin();
            }
        }
    }

    public static void timVaXoaTheoHoTen(ArrayList<SinhVien> danhSachSV) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui long nhap Ten sinh vien muon xoa: ");
        String tenMuonTim = sc.nextLine();
        for(SinhVien sv: danhSachSV) {
            if(sv.getHoTen().contains(tenMuonTim)) {
                danhSachSV.remove(sv);
            }
        }
    }

    public static void sortTheoDiem(ArrayList<SinhVien> danhSachSV) {
        Comparator<SinhVien> comp = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return Double.valueOf(sv1.getDiem()).compareTo(sv2.getDiem());
            }
        };
        Collections.sort(danhSachSV, comp);
    }

    public static void sortTheoHoTen(ArrayList<SinhVien> danhSachSV) {
        Comparator<SinhVien> comp = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return sv1.getHoTen().compareTo(sv2.getHoTen());
            }
        };
        Collections.sort(danhSachSV, comp);
    }
}

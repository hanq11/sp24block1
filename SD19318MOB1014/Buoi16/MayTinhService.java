package SD19318MOB1014.Buoi16;

import java.util.ArrayList;
import java.util.Scanner;

public class MayTinhService {
    ArrayList<MayTinh> danhSach = new ArrayList<MayTinh>();
    Scanner sc = new Scanner(System.in);
    
    public void themDoiTuong() {
        System.out.print("Vui long nhap ma:");
        String ma = sc.nextLine();
        System.out.print("Vui long nhap ten:");
        String ten = sc.nextLine();
        System.out.print("Vui long nhap gia:");
        double gia = sc.nextDouble();
        sc.nextLine();
        System.out.print("Vui long nhap nha san xuat:");
        String nsx = sc.nextLine();
        
        MayTinh mt = new MayTinh(ma, ten, gia, nsx);
        danhSach.add(mt);
    }
    
    public void xuatDanhSach() {
        for(MayTinh mt: danhSach) {
            mt.inThongTin();
        }
    }
    
    public void xoaSanPham() {
        System.out.print("Vui long nhap ma muon xoa: ");
        String maXoa = sc.nextLine();
        
        ArrayList<MayTinh> danhSachCanXoa = new ArrayList<MayTinh>();
        
        for(MayTinh mt: danhSach) {
            if(mt.getMa().contains(maXoa)) {
                danhSachCanXoa.add(mt);
            }
        }
        
        danhSach.removeAll(danhSachCanXoa);
    }
    
    public void laptop() {
        Laptop lt = new Laptop();
        String serial;
        while(true) {
            System.out.print("Vui long nhap serial: ");
            serial = sc.nextLine();
            if(serial.matches("[a-zA-Z\\s]*")) {
                break;
            }
        }
        lt.setSerial(serial);
        
        lt.inThongTin();
    }
}

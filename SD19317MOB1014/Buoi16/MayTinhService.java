package SD19317MOB1014.Buoi16;

import java.util.ArrayList;
import java.util.Scanner;

public class MayTinhService {
    ArrayList<MayTinh> danhSach = new ArrayList<MayTinh>();
    Scanner sc = new Scanner(System.in);
    
    public void nhapDoiTuong() {
        System.out.print("Vui long nhap ma: ");
        String ma = sc.nextLine();
        System.out.print("Vui long nhap ten: ");
        String ten = sc.nextLine();
        System.out.print("Vui long nhap gia: ");
        double gia = sc.nextDouble();
        sc.nextLine();
        System.out.print("Vui long nhap nha san xuat: ");
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
        System.out.print("Vui long nhap ma san pharm: ");
        String maCanTim = sc.nextLine();
        ArrayList<MayTinh> danhSachXoa = new ArrayList<MayTinh>();
        
        for(MayTinh mt: danhSach) {
            if(mt.getMa().contains(maCanTim)) {
                danhSachXoa.add(mt);
            }
        }
        danhSach.removeAll(danhSachXoa);
    }
    
    public void laptop() {
        Laptop lt = new Laptop();
        
        while(true) {
            System.out.println("Vui long nhap serial: ");
            String serial = sc.nextLine();
            if(serial.matches("[a-zA-z]*")) {
                break;
            }
        }
        lt.inThongTin();
    }
}

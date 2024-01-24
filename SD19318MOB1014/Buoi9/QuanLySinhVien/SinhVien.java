package SD19318MOB1014.Buoi9.QuanLySinhVien;

import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private double diem;

    public SinhVien() {

    }
    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }
    public String getHoTen() {
        return this.hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public double getDiem() {
        return this.diem;
    }
    public void setDiem(double diem) {
        this.diem = diem;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui long nhap ten sinh vien: ");
        this.hoTen = sc.nextLine();
        System.out.print("Vui long nhap diem sinh vien: ");
        this.diem = sc.nextInt();
        sc.nextLine();        
    }
    
    public void xuatThongTin() {
        System.out.printf("Sinh vien %s co diem la %.2f\n", this.hoTen, this.diem);
    }
}

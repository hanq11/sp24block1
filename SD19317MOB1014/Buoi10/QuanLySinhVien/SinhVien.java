package SD19317MOB1014.Buoi10.QuanLySinhVien;

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
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui long nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Vui long nhap diem: ");
        this.diem = sc.nextDouble();
        // Nuot ky tu \n
        sc.nextLine();
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getHoTen() {
        return this.hoTen;
    }
    public double getDiem() {
        return diem;
    }
    public void setDiem(double diem) {
        this.diem = diem;
    }
    public void xuatThongTin() {
        System.out.printf("Sinh vien %s co diem la: %.2f\n", this.getHoTen(), this.getDiem());
    }
}
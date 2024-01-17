package SD19317MOB1014.Buoi7;


import java.util.Scanner;

/**
 *
 * @author syn
 */
public class SinhVien {
    // Khai báo các biến thuộc tính của class
    public String hoTen;
    public int diem;
    
    // Khai báo các phương thức của class
    public void nhapTenVaDiem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui long nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Vui long nhap diem: ");
        this.diem = sc.nextInt();
        
    }
    
    public void xuatTenVaDiem() {
        System.out.println("Sinh vien co ten la: " + hoTen);
        System.out.println("Sinh vien co diem la: " + diem);
    }
    // Phuong thuc nap chong - overloading
    public void tinhDiem(double a, double b) {
        System.out.println("Tong cua 2 diem la: " + (a + b));
    }
    
    // Phuong thuc nap chong - overloading
    public void tinhDiem(double a, double b, double c) {
        System.out.println("Tong cua 3 diem la: " + (a + b + c));
    }
}

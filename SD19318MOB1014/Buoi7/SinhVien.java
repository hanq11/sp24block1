package SD19318MOB1014.Buoi7;

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
        System.out.print("Vui long nhap ten sinh vien: ");
        this.hoTen = sc.nextLine();
        System.out.print("Vui long nhap diem sinh vien: ");
        this.diem = sc.nextInt();
    }
    
    public void xuatTenVaDiem() {
        System.out.println("Ten sinh vien la: " + this.hoTen);
        System.out.println("Diem sinh vien la: " + this.diem);
    }

    // Phuong thuc nap chong - overloading
    public void tinhDiem(int a, int b) {
        System.out.println("Tong cua 2 diem la: " + (a + b));
    }

    // Phuong thuc nap chong - overloading
    public void tinhDiem(int a, int b, int c) {
        System.out.println("Tong cua 3 diem la: " + (a + b + c));
    }
}
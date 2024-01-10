package SD19318MOB1014.Buoi4;

import java.util.Scanner;

/**
 *
 * @author syn
 */
public class ThucDon {
    public static void main(String[] args) {
        System.out.println("Máy tính cá nhân");
        System.out.println("---------------");
        System.out.println("1. Cộng");
        System.out.println("2. Trừ");
        System.out.println("3. Kết thúc");
        System.out.println("---------------");
        System.out.println("Vui lòng chọn chức năng: ");
        Scanner sc = new Scanner(System.in);
        int luaChon = sc.nextInt();
        
        switch(luaChon) {
            case 1:
                thucHienPhepCong();
                break;
            case 2:
                thucHienPhepTru();
                break;
            case 3:
                System.exit(0);
        }
    }
    
    public static void thucHienPhepCong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui lòng nhập a: ");
        int a = sc.nextInt();
        System.out.print("Vui lòng nhập b: ");
        int b = sc.nextInt();
        int ketQua = a + b;
        System.out.println("Kết quả là: " + ketQua);
    }
    public static void thucHienPhepTru() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui lòng nhập a: ");
        int a = sc.nextInt();
        System.out.print("Vui lòng nhập b: ");
        int b = sc.nextInt();
        int ketQua = a - b;
        System.out.println("Kết quả là: " + ketQua);
    }    
}

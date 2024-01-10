package SD19317MOB1014.Buoi4;

import java.util.Scanner;

/**
 *
 * @author syn
 */
public class ThucDon {
    public static void main(String args[]) {
        System.out.println("Máy tính cá nhân");
        System.out.println("1. Cộng");
        System.out.println("2. Trừ");
        System.out.println("3. Kết thúc");
        System.out.println("Mời chọn chức năng: ");
        Scanner sc = new Scanner(System.in);
        int chucNang = sc.nextInt();
        switch(chucNang) {
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
        System.out.print("Vui lòng nhập vào số a: ");
        int a = sc.nextInt();
        System.out.print("Vui lòng nhập vào số b: ");
        int b = sc.nextInt();
        int ketQua = a + b;
        System.out.println("Tổng của hai số là: " + ketQua);
    }
    
    public static void thucHienPhepTru() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui lòng nhập vào số a: ");
        int a = sc.nextInt();
        System.out.print("Vui lòng nhập vào số b: ");
        int b = sc.nextInt();
        int ketQua = a - b;
        System.out.println("Tổng của hai số là: " + ketQua);
    }
}

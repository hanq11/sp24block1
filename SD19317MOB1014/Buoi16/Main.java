package SD19317MOB1014.Buoi16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MayTinhService mtsv = new MayTinhService();
        System.out.println("Nhập:");
        System.out.println("1.Nhập thông tin đối tượng.");
        System.out.println("2.Hiển thị danh sách đối tượng.");
        System.out.println("3.Hiển thị danh sách đối tượng theo điều kiện.");
        System.out.println("4.Thoát.");
        System.out.println("5. Laptop");
        
        int luaChon = 0;
        
        do {
            System.out.print("Vui long nhap lua chon: ");
            luaChon = sc.nextInt();
            sc.nextLine();

            switch(luaChon) {
                case 1:
                    mtsv.nhapDoiTuong();
                    break;
                case 2:
                    mtsv.xuatDanhSach();
                    break;
                case 3:
                    mtsv.xoaSanPham();
                    break;
                case 4:
                    System.out.println("Thoat");
                    break;
                case 5:
                    mtsv.laptop();
                    break;
            }
        } while(luaChon != 4);
        
    }
}

package SD19318MOB1014.Buoi9;

import java.util.ArrayList;
import java.util.Scanner;

public class TinhTongDanhSachNangCap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> mangSo = new ArrayList<Double>();

        while(true) {
            System.out.printf("Vui long nhap phan tu thu %d: ", mangSo.size());
            mangSo.add(sc.nextDouble());
            // Nuot ky tu \n
            sc.nextLine();
            System.out.print("Ban co muon nhap tiep khong, nhap N de thoat: ");
            String luaChon = sc.nextLine();
            if(luaChon.equalsIgnoreCase("N")) {
                break;
            }
        }
        // Xuat mang
        for(Double x: mangSo) {
            System.out.println(x);
        }
    }    
}

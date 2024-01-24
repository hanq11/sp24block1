package SD19318MOB1014.Buoi9;

import java.util.ArrayList;
import java.util.Scanner;

// Nhập vào danh sách số thực ArrayList<Double>. 
// Tính tổng và xuất ra màn hình

public class TinhTongDanhSach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> mangSo = new ArrayList<Double>();
        for(int i = 0; i < 5; i++) {
            System.out.printf("Nhap phan tu thu %d: ", i);
            double so = sc.nextDouble();
            mangSo.add(so);
        }
        for(Double x: mangSo) {
            System.out.println(x);
        }
    }    
}

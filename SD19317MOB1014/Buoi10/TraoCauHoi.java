package SD19317MOB1014.Buoi10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Nhập danh sách 5 câu hỏi. Tráo ngẫu 
// nhiên và xuất danh sách câu hỏi đã tráo

public class TraoCauHoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> danhSachCauHoi = new ArrayList<String>();
        for(int i = 0; i < 5; i++) {
            System.out.printf("Vui long nhap cau hoi %d: ", i);
            // String cauHoi = sc.nextLine();
            // danhSachCauHoi.add(cauHoi);
            danhSachCauHoi.add(sc.nextLine());
        }
        System.out.println("Danh sach cau hoi truoc khi trao: ");
        for(String cauHoi: danhSachCauHoi) {
            System.out.println(cauHoi);
        }
        Collections.shuffle(danhSachCauHoi);
        System.out.println("Danh sach cau hoi sau khi trao: ");
        for(String cauHoi: danhSachCauHoi) {
            System.out.println(cauHoi);
        }
    } 
}

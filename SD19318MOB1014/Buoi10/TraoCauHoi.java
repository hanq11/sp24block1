package SD19318MOB1014.Buoi10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Nhập danh sách 5 câu hỏi. Tráo ngẫu 
// nhiên và xuất danh sách câu hỏi đã tráo

public class TraoCauHoi {
    public static void main(String[] args) {
        ArrayList<String> mangCauHoi = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            System.out.printf("Vui long nhap cau hoi thu %d: ", i);
            String cauHoi = sc.nextLine();
            mangCauHoi.add(cauHoi);
        }
        Collections.shuffle(mangCauHoi);
        for(String x: mangCauHoi) {
            System.out.println(x);
        }
    }
}

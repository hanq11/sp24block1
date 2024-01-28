package SD19318MOB1014.Buoi11;

import java.util.Scanner;

// Nhập mảng họ tên sinh viên
// Xuất họ và tên (IN HOA) những sinh viên tên Tuấn hoặc họ Nguyễn
// Xuất tên những sinh viên có tên lót là Mỹ
public class DemoString2 {
    public static void main(String[] args) {
        String mangHoTen[] = new String[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            System.out.printf("Vui long nhap ho ten sinh vien thu %d: ", i);
            mangHoTen[i] = sc.nextLine();
        }
        // Bai 1
        for (String tenSV : mangHoTen) {
            if(tenSV.startsWith("Nguyen") || tenSV.endsWith("Tuan")) {
                System.out.println(tenSV.toUpperCase());
            }
        }
        // Bai 2
        for (String tenSV : mangHoTen) {
            if(tenSV.contains("My")) {
                int lastIndexOfSpace = tenSV.lastIndexOf(" ");
                System.out.println(tenSV.substring(lastIndexOfSpace + 1));
            }
        }
    }
}

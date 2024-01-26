package SD19317MOB1014.Buoi11;

import java.util.ArrayList;
import java.util.Scanner;

// Quản lý sinh viên
// Nhập mảng họ tên sinh viên
// Xuất họ và tên (IN HOA) những sinh viên tên Tuấn hoặc họ Nguyễn
// Xuất tên những sinh viên có tên lót là Mỹ

public class DemoString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> mangHoTen = new ArrayList<String>();
        for(int i = 0; i < 5; i++) {
            System.out.printf("Vui long nhap ho ten sinh vien thu %d: ", i);
            mangHoTen.add(sc.nextLine());
        }
        System.out.println("Phan 1: ");
        for (String chuoi : mangHoTen) {
            if(chuoi.toLowerCase().endsWith("tuan") 
                || chuoi.toLowerCase().startsWith("nguyen")) {
                    System.out.println(chuoi.toUpperCase());
            }
        }
        System.out.println("Phan 2: ");
        for (String chuoi : mangHoTen) {
            if(chuoi.toLowerCase().contains("my")) {
                int lastIndexOfSpace = chuoi.lastIndexOf(" ");
                System.out.println(chuoi.substring(lastIndexOfSpace + 1));
            }
        }
    }
}

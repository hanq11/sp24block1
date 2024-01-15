package SD19317MOB1014.Buoi6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author syn
 * Nhập mảng 5 SV và xuất tăng dần theo alphabet
 */
public class SapXepMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen[] = new String[5];
        for(int i = 0; i < hoTen.length; i++) {
            System.out.print("Vui long nhap ten sinh vien: ");
            hoTen[i] = sc.nextLine();
        }
        Arrays.sort(hoTen);
        for(String x: hoTen) {
            System.out.println(x);
        }
    }
}
package SD19318MOB1014.Buoi6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author syn
 * Nhập mảng 5 SV và xuất tăng dần theo alphabet
 */
public class SapXepHoTen {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String hoTen[] = new String[5];
        for(int i = 0; i < hoTen.length; i++) {
            System.out.printf("Vui lòng nhập tên sinh viên thứ %d: ", i);
            hoTen[i] = sc.nextLine();
        }
        Arrays.sort(hoTen);
        for(String x: hoTen) {
            System.out.println(x);
        }
    }
}

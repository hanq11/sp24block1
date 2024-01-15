package SD19318MOB1014.Buoi6;

import java.util.Scanner;

/**
 *
 * @author syn
 * Nhập mảng số nguyên
 * + Tính và xuất trung bình cộng
 * + Xuất lập phương các phần tử
 */
public class ForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mang[] = new int[3];
        double tong = 0;
        for(int i = 0; i < mang.length; i++) {
            System.out.printf("Vui lòng nhập phần tử thứ %d: ", i);
            mang[i] = sc.nextInt();
            tong += mang[i];
        }
        System.out.println("Trung bình cộng của mảng là: " + tong / mang.length);
        
        for(int i = 0; i < mang.length; i++) {
            System.out.printf("Lập phương của phần tử thứ %d là: %f\n", i, Math.pow(mang[i], 3));
        }
    }
}

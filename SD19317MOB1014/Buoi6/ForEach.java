package SD19317MOB1014.Buoi6;

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
        // Khởi tạo mảng số nguyên
        int a[] = new int[5];
        double tong = 0;
        for(int i = 0; i < a.length; i++) {
            System.out.printf("Vui lòng nhập giá trị của phần tử %d: ", i);
            a[i] = sc.nextInt();
            tong += a[i];
        }
        System.out.println("Trung bình cộng của mảng là: " + tong/(a.length));
        
        System.out.print("Lập phương của các phần tử là: ");
        for(int x: a) {
            System.out.printf("/t %.0f", Math.pow(x, 3));
        }
                
    }
}

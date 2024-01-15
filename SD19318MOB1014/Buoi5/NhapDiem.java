package SD19318MOB1014.Buoi5;

import java.util.Scanner;

/**
 *
 * @author syn
 * Chương trình bắt nhập các số từ 0 - 10
 */
public class NhapDiem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int so;
        do { 
            System.out.print("Vui lòng nhập số từ 0 - 10: ");
            so = sc.nextInt();
        } while(0 > so || so > 10);
    }
}
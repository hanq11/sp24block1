package SD19317MOB1014.Buoi3;

import java.util.Scanner;

/**
 *
 * @author syn
 */
public class TryCatch {
    public static void main(String[] args) {
        // Sử dụng try catch để xử lý ngoại lệ
        // Nếu trong khối code try có dòng lệnh gây lỗi,
        // thì các lệnh trong khối catch sẽ được chạy và chương trình vẫn tiếp tục
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Vui long nhap so int: ");
            int a = sc.nextInt();
            System.out.println("Ban nhap dung roi");
        } catch (Exception ex) {
            System.out.println("Nhap sai roi");            
        }
        System.out.println("Chuong trinh ket thuc");            
    }
}

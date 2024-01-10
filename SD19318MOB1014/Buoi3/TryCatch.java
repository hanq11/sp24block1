package SD19318MOB1014.Buoi3;

import java.util.Scanner;

/**
 *
 * @author syn
 */
public class TryCatch {
    public static void main(String args[]) {
        // Sử dụng try catch để xử lý ngoại lệ
        // Nếu trong khối code try có dòng lệnh gây lỗi,
        // thì các lệnh trong khối catch sẽ được chạy và chương trình vẫn tiếp tục
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Mời nhập một số nguyên: ");
            int a = sc.nextInt();
        } catch (Exception ex) {
            System.out.println("Nhập sai rồi");
        }
        System.out.println("Chương trình kết thúc");
    }
}

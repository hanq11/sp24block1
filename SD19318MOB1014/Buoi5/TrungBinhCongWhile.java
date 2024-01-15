package SD19318MOB1014.Buoi5;

/**
 *
 * @author syn
 * Tính trung bình cộng các số chia hết cho 3 từ 27 đến 250
 * - Tính tổng các số chia hết cho 3 trong khoảng
 * - Đếm số các số chia hết cho 3 trong khoảng
 */
public class TrungBinhCongWhile {
    public static void main(String[] args) {
        double tong = 0;
        double dem = 0;
        int i = 27;
        while(i < 251) {
            if(i % 3 == 0) {
                tong += i;
                dem++;
            }
            i++;
        }
        System.out.println("Ket qua la: " + (tong / dem));
    }
}

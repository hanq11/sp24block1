package SD19318MOB1014.Buoi5;

/**
 *
 * @author syn
 * Tạo bảng cửu chương của 7 với vòng lặp while
 */
public class BangCuuChuongWhile {
    public static void main(String[] args) {
        int i = 1;
        while(i < 11) {
            // Cach 1:
            int ketQua = 7 * i;
            System.out.printf("7 * %d = %d \n", i, ketQua);
            // Cach 2
            System.out.printf("7 * %d = %d \n", i, 7 * i);
            i++;
        }
    }
}

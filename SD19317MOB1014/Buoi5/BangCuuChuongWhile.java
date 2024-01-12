package SD19317MOB1014.Buoi5;

// Đề bài: in bảng cửu chương của 7 - 7 * i
public class BangCuuChuongWhile {
    public static void main(String[] args) {
        int i = 1;
        while(i < 11) {
            // Cách dài:
            // int ketQua = 7 * i;
            // System.out.printf("7 * %d = %d \n", i, ketQua);
            // Cách ngắn: 
            System.out.printf("7 * %d = %d \n", i, 7 * i);
            i++;
        }
    }    
}

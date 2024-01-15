package SD19317MOB1014.Buoi5;


// Tính trung bình cộng các số chia 
// hết cho 3 từ 27 đến 250.
// Để tính trung bình cộng: Tổng và số số hạng
// Tìm Tổng của các số chia hết cho 3 từ 27 đến 250, Tìm số các số chia hết cho 3 trong khoảng đó
public class TrungBinhWhile {
    public static void main(String[] args) {
        double tong = 0;
        int i = 27;
        double dem = 0;
        while(i < 251) {
            if(i % 3 == 0) {
                tong += i;
                dem++;
            }
            i++;
        }
        System.out.println("Kết quả là: " + tong / dem);
    }
}

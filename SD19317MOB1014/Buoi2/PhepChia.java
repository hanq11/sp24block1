package SD19317MOB1014.Buoi2;

/**
 *
 * @author syn
 * Viết chương trình tìm điểm trung bình 
 * của các môn học a, b, c. Trong đó môn 
 * a được tính hệ số 2.
 */
public class PhepChia {
    public static void main(String[] args) {
        // Khởi tạo các biến double cùng giá trị khởi tạo
        double a = 8, b = 7;
        double c = 9;
        double ketQua = (a * 2 + b + c) / 3.5;
        // Sử dụng hàm println để in dòng chữ ra ngoài màn hình
        // hàm println sẽ tự động xuống dòng
        System.out.println("Ket qua la: " + ketQua);
    }
}

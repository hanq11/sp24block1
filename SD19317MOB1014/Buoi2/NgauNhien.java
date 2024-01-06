package SD19317MOB1014.Buoi2;

import java.util.Scanner;

/**
 *
 * @author syn
 * 1. Sinh số ngẫu nhiên từ 5 đến 12
 * Xuất số đó và căn bậc 2 của nó ra màn hình
 * 2.  Nhập 2 số thực a và b từ bàn phím
 * Tính và xuất a lũy b, giá trị nhỏ nhất của 2 số
 */
public class NgauNhien {
    public static void main(String[] args) {
        // Bai 1
        // Sinh số ngẫu nhiên trong khoảng từ 5 - 12
        // Hàm Math.random() sẽ trả về các giá trị số thực trong khoảng từ 0 - 1
        double ngauNhien = 5 + Math.random() * 7;
        System.out.println("So ngau nhien la: " + ngauNhien);
        // Tính căn bậc hai của số ngauNhien bằng hàm Math.sqrt()
        double canBacHai = Math.sqrt(ngauNhien);
        System.out.println("Can bac 2 cua so ngau nhien la: " + canBacHai);
        // Bai 2
        // Khởi tạo đối tượng sc có kiểu là Scanner 
        // để đọc ghi các dữ liệu nhập vào từ bàn phím
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.print("Vui long nhap a: ");
        // Sử dụng phương thức nextDouble của đối tượng sc 
        // để đọc các số có kiểu là double được nhập từ bàn phím
        a = sc.nextDouble();
        System.out.print("Vui long nhap b: ");
        b = sc.nextDouble();
        // Sử dụng hàm Math.pow() để tính luỹ thừa của 2 số, 
        // và Math.min() để tìm số bé nhất trong hai số
        System.out.println("Luy thua cua a va b la: " + Math.pow(a, b));
        System.out.println("Gia tri nho nhat cua a va b la: " + Math.min(a, b));
    }  
}

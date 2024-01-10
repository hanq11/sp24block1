package SD19318MOB1014.Buoi3;

/**
 *
 * @author syn
 */
public class ParseString {
    public static void main(String[] args) {
        // Khởi tạo hai String a và b
        String a = "6.5";
        String b = "7.6";
        // Nếu không parse string, thì java sẽ thực hiện ghép 2 chuỗi vào với nhau
        System.out.println(a + b);
        
        // Chuyển chuỗi thành giá trị có kiểu là double qua phương thức parseDouble()
        double c = Double.parseDouble(a);
        double d = Double.parseDouble(b);
        // Thực hiện tính toán và in kết quả
        System.out.println(c + d);
                
    }
}

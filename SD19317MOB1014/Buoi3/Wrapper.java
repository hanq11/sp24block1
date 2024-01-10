package SD19317MOB1014.Buoi3;

/**
 *
 * @author syn
 */
public class Wrapper {
    public static void main(String args[]) {
        // Khởi tạo object a có kiểu là Wrapper - Lớp bao của int
        Integer a = Integer.valueOf("5");
        // Object của Wrapper có thể sử dụng các phương thức có sẵn như intValue()
        System.out.println(a.intValue());
        // Bên trong object này cũng chưa hằng số như giá trị lớn nhất và bé nhất
        // mà object này có thể chứa, .....
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }  
}

package SD19318MOB1014.Buoi3;
/**
 *
 * @author syn
 */
public class EpKieu {
    public static void main(String[] args) {
        int a = 1;
        double b = 2;
        a = (int) b; // Ép kiểu tường minh từ double sang int
        System.out.println(a);
        b = a; // Ép kiểu tự động từ int sang doule 
        System.out.println(b);       
    }
}

package SD19318MOB1014.Buoi3;

/**
 *
 * @author syn
 */
public class ToanTu3Ngoi {
    public static void main(String args[]) {
        int a = 1, b = 2 , c = 4, d = 5;
        // a > b là sai, thì b sẽ được trả về
        int kq1 = a > b ? a : b;
        // c < d là đúng, thì c sẽ được trả về
        int kq2 = c < d ? c : d;
        System.out.println(kq1);
        System.out.println(kq2);
    }
}

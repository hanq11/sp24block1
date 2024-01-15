package SD19317MOB1014.Buoi5;

// Ví dụ về break
public class Break {
    public static void main(String[] args) {
        for(int i = 0; i < 11; i++) {
            if(i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}

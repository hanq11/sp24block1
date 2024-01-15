package SD19317MOB1014.Buoi5;

public class Continue {
    public static void main(String[] args) {
        for(int i = 0; i < 11; i++) {
            if(i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}

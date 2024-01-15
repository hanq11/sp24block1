package SD19318MOB1014.Buoi5;

/**
 *
 * @author syn
 */
public class BreakContinue {
    public static void main(String[] args) {
        // in với break
        for(int i = 1; i < 11; i++) {
            if(i == 5) {
                break;
            }
            System.out.println(i);
        }
        // in với continue
        for(int j = 1; j < 11; j++) {
            if(j == 5) {
                continue;
            }
            System.out.println(j);
        }
                
    }
}

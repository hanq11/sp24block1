package SD19317MOB1014.Buoi8.ChuNhat;

/**
 *
 * @author syn
 */
public class ChuNhat {
    String a = "test";
    public int dai;
    public int rong;
    
    // Ham khoi tao mac dinh
    public ChuNhat() {
        
    }
    // Ham khoi tao co 2 tham so
    // Sử dụng this để gọi tới thuộc tính của đối tượng
    public ChuNhat(int dai, int rong) {
        this.dai = dai;
        this.rong = rong;
    }
}

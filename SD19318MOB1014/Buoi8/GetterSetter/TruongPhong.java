package SD19318MOB1014.Buoi8.GetterSetter;


/**
 *
 * @author syn
 */
public class TruongPhong {
    private int luong;
    private String ten;
    
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getTen() {
        return this.ten;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        if(luong < 100) {
            System.out.println("Luong thap qua");
        } else {
            this.luong = luong;
        }
    }
    
}

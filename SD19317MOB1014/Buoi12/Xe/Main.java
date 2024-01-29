package SD19317MOB1014.Buoi12.Xe;

public class Main {
    public static void main(String[] args) {
        XeLeoNui xln = new XeLeoNui("ten moi");
        System.out.println(xln.ten);
        xln.inThongTin();
        xln.inThongTinXeLeoNui();
        xln.getTen();
    }
}

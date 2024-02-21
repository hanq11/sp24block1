package SD19318MOB1014.Buoi16;

public class Laptop extends MayTinh{
    public String serial;

    public Laptop(String serial, String ma, String ten, double gia, String nhaSanXuat) {
        super(ma, ten, gia, nhaSanXuat);
        this.serial = serial;
    }
    
    public Laptop() {
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }
    
    @Override
    public void inThongTin() {
        System.out.println("Serial: " + serial);
        super.inThongTin();
    }
}

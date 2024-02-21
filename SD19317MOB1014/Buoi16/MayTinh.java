package SD19317MOB1014.Buoi16;

public class MayTinh {
    public String ma;
    public String ten;
    public double gia;
    public String nhaSanXuat;

    public MayTinh() {
        
    }
    
    public MayTinh(String ma, String ten, double gia, String nhaSanXuat) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.nhaSanXuat = nhaSanXuat;
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
    
    public void inThongTin() {
        System.out.printf("Ma: %s Ten: %s Gia: %.2f Nha San Xuat: %s \n", 
                this.ma, this.ten, this.gia, this.nhaSanXuat);
    }
}

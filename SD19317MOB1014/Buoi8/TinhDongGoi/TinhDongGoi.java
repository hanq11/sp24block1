package SD19317MOB1014.Buoi8.TinhDongGoi;

/**
 *
 * @author syn
 */
public class TinhDongGoi {
    // Thuộc tính public có thể truy cập từ mọi nơi trong mã nguồn
    public int bienPublic;
    // Thuộc tính private chi có thể truy cập trong file class của chính nó
    private int bienPrivate;
    // Thuộc tính default chỉ có thể truy cập bởi các file trong cùng 1 package
    int bienDefault;
    // Tương tự default, nhưng các class kế thừa từ class này cũng có thể truy cập
    protected int bienProtected;
}


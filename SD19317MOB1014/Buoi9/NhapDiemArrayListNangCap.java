package SD19317MOB1014.Buoi9;

import java.util.ArrayList;
import java.util.Scanner;

public class NhapDiemArrayListNangCap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> mangDiem = new ArrayList<Double>();
        while(true) {
            System.out.printf("Vui lòng nhập điểm thứ %d: ", mangDiem.size());
            mangDiem.add(sc.nextDouble()); 
            // dùng để nuốt ký tự \n
            sc.nextLine();
            System.out.print("Bạn có muốn nhập tiếp không, nhập N để thoát: ");
            String luaChon = sc.nextLine();
            if(luaChon.equalsIgnoreCase("N")) {
                break;
            }
        }
        double tong = 0;
        for(Double x : mangDiem) {
            tong += x;
        }
        System.out.printf("Tổng điểm là: %.2f", tong);
    }
}

package SD19318MOB1014.Buoi4;

import java.util.Scanner;

/**
 *
 * @author syn
 * Nhập tháng và năm từ bàn phím.
 * Xuất số ngày của tháng đã nhập.
 */
public class NgayCuaThang {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui lòng nhập năm: ");
        int nam = sc.nextInt();
        System.out.print("Vui lòng nhập tháng: ");
        int thang = sc.nextInt();
        int soNgayCuaThang = 0;
        
        switch(thang) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                soNgayCuaThang = 31;
                break;
            case 2:
//                if(nam % 4 == 0 && nam % 100 != 0) {
//                    soNgayCuaThang = 29;
//                } else {
//                    soNgayCuaThang = 28;
//                }
                soNgayCuaThang = nam % 4 == 0 && nam % 100 != 0 ? 29 : 28;
                break;
            case 4: case 6: case 9: case 11:
                soNgayCuaThang = 30;
                break;      
        }
        System.out.printf("Năm %d, tháng %d có số ngày trong tháng là: %d"
                , nam, thang, soNgayCuaThang);
    }
}

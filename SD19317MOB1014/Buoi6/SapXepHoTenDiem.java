package SD19317MOB1014.Buoi6;

import java.util.Scanner;

/**
 *
 * @author syn
 * Nhập 2 mảng họ tên và điểm.
 * Xuất 2 mảng giảm theo điểm
 */
public class SapXepHoTenDiem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen[] = new String[5];
        int diem[] = new int[5];
                 
        for(int i = 0; i < hoTen.length; i++) {
            System.out.printf("Vui lòng nhập tên sinh viên thứ %d: ", i);
            hoTen[i] = sc.nextLine();
            System.out.printf("Vui lòng nhập điểm sinh viên thứ %d: ", i);
            diem[i] = sc.nextInt();
            sc.nextLine();
        }
        
        for(int i = 0; i < hoTen.length - 1; i++) {
            for(int j = i + 1; j < hoTen.length; j++) {
                if(diem[i] > diem[j]) {
                    int temp = diem[i];
                    diem[i] = diem[j];
                    diem[j] = temp;
                    
                    String tempHoTen = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = tempHoTen;
                }
            }
        }
        
        for(int i = 0; i < hoTen.length; i++) {
            System.out.printf("Sinh vien %s co diem la %d \n" , hoTen[i], diem[i]);
        }
            
    }
}

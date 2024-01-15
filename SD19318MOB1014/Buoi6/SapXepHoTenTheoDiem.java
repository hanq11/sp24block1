package SD19318MOB1014.Buoi6;

import java.util.Scanner;

public class SapXepHoTenTheoDiem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String hoTen[] = new String[3];
        int diem[] = new int[3];
        
        for(int i = 0; i < hoTen.length; i++) {
            System.out.printf("Vui lòng nhập tên sinh viên thứ %d: ", i);
            hoTen[i] = sc.nextLine();
            System.out.printf("Vui lòng nhập điểm sinh viên thứ %d: ", i);
            diem[i] = sc.nextInt();
            sc.nextLine();
        }
        
        for(int i = 0; i < hoTen.length - 1; i++) {
            for(int j = i + 1; j < hoTen.length; j++) {
                if(diem[i] < diem[j]) {
                    int tmp = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tmp;
                    
                    String tmpHoTen = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = tmpHoTen;
                }
            }
        }
        
        for(int i = 0; i < hoTen.length; i++) {
            System.out.printf("Sinh viên %s có điểm là: %d \n", hoTen[i], diem[i]);
        }
    }
}

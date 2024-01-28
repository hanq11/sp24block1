package SD19318MOB1014.Buoi11;

import java.util.Scanner;

public class DemoString1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui long nhap username: ");
        String username =  sc.nextLine();
        System.out.print("Vui long nhap password: ");
        String password = sc.nextLine();

        if(username.equalsIgnoreCase("hello") 
            && password.length() > 6) {
                System.out.println("Dang nhap thanh cong");
        } else {
            System.out.println("Dang nhap that bai");
        } 
    }
}

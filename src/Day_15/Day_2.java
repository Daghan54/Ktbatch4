package Day_15;

import java.util.Scanner;

public class Day_2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int sifre =2;

        System.out.println("Şifre icin 3 hakkınız var");
        int i=0;
        while (i<3){
            System.out.println("şifre: ");
            int giriş=scan.nextInt();
            if (sifre==giriş){
                System.out.println("Doğru bildiniz");
                break;
            }else{
                System.out.println("Yanlış bildiniz");
            }
            i++;
        }
    }
}

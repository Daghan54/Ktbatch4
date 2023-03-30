package day_8_ScannerAndOperators;

import java.util.Scanner;

public class C06_ScannerTask1 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir sayı girin");

        int gSayi =scan.nextInt();
        System.out.println("girilensayi="+gSayi);
        System.out.println("girilenSayininKaresi="+gSayi*gSayi);

        scan.close();
    }
}

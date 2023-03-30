package Day_9;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hediye mil kazanmak için lütfen  harcama  tutarı giriniz");
        double tutar = scan.nextDouble();
        if (tutar > 500 && tutar < 1000) {
            System.out.println("Tebrikler"+"50₺ mil puan kazandınız");
        } else if (tutar > 1000 && tutar < 1500) {
            System.out.println("Tebrikler"+"100₺ mil puan kazandınız");
        } else if (tutar > 1500 && tutar < 2000) {
            System.out.println("Tebrikler"+"150₺ mil puan kazandınız");
        } else if (tutar > 2000 && tutar < 5000) {
            System.out.println("Tebrikler"+"500₺ mil puan kazandınız");
        } else {
            System.out.println("Lütfen belirli tutar arasını seçin");
        }
    }
}
package day10_UnaryLogicalOperAndReview;

import java.util.Scanner;

public class C02_EvenlyDivisible {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Lütfen bir sayı giriniz");
        int sayi = scan.nextInt();
        boolean blm  = sayi % 2 == 0;
        boolean blm1 = sayi % 3 == 0;
        boolean blm2 = sayi % 5 == 0;
        System.out.println("blm  = " + blm );
        System.out.println("blm1 = " + blm1);
        System.out.println("blm2 = " + blm2);

    }
}

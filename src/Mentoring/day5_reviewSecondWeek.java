package Mentoring;

import java.util.Scanner;

public class day5_reviewSecondWeek {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
     /*   System.out.println("Lütfen bir sayı giriniz :");
        int sayi = sc.nextInt();

        int birler=sayi%10;
        System.out.println("birler = " + birler);

        int onlar=(sayi/10)%10;
        System.out.println("onlar = " + onlar);

        int yüzler=sayi/100;
        System.out.println("yüzler = " + yüzler);

        int yenisayi=birler*100+onlar*10+yüzler;
        System.out.println("yenisayi = " + yenisayi);


        String birlerStr = Integer.toString(birler);
        String onlarStr = Integer.toString(onlar);
        String yüzlerStr = Integer.toString(yüzler);

        String result=birlerStr+onlarStr+yüzlerStr;
        System.out.println("result = " + result);
*/

        System.out.println("Lütfen bir sayı giriniz :");

        int dd = sc.nextInt();
        boolean çiftmi = dd%2==0;
        System.out.println("çift = " + çiftmi);

        System.out.println("Lütfen bir sayı giriniz :");

        int ff = sc.nextInt();
        boolean tekmi = ff%2!=0;
        System.out.println("tekmi = " + tekmi);


    }
}

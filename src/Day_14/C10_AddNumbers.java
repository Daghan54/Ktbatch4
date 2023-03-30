package Day_14;

import java.util.Scanner;

public class C10_AddNumbers {
    public static void main(String[] args) {

        //  int n = 5;
        //   String result = "";
        //     result= (n % 2 ==0)?  "Çift" :"Tek";


      /*  int sayı= scan.nextInt();
        int result= (sayı>50)? 1 : 0;
        System.out.println(result);


        System.out.println("Saati giriniz :");
        int saat =scan.nextInt();

        if (saat<=2){
            System.out.println("10");
        } else if (saat<=5) {
            System.out.println("20");
        }else {
            System.out.println("35");
        }
        System.out.println("Bugün günlerden :");
        int n = 1;
        if (n == 1) {
            System.out.println("Pazartesi");
        } else if (n == 2) {
            System.out.println("Salı");
        } else if (n == 3) {
            System.out.println("Çarşamba");

        } else if (n ==4) {
            System.out.println("Perşembe");
        } else if (n ==5) {
            System.out.println("Cuma");
        } else if (n ==6) {
            System.out.println("Cumartesi");
        } else if (n ==7) {
            System.out.println("Pazar");
        }else {
            System.out.println("Try again");
        }
        int m = 1;
        switch (m){
            case 1:
                System.out.println("Sıra ahmette");
                break;
            case  2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            case 4:
                System.out.println(4);
                break;
            case 5:
                System.out.println(5);
                break;
            case 6:
                System.out.println(6);
                break;
            case 7:
                System.out.println(7);
                break;
            default:
                System.out.println("TRY");
        }
*/
        Scanner scan = new Scanner(System.in);

        int fizik = 100;
        int kimmya = 90;
        int ort = (fizik + kimmya) / 2;
        boolean result = (ort > 50);
        if (result) {
            System.out.println("Geçtiniz tebrikler");
        } else {
            System.out.println("Try again");
        }
        System.out.println("Hava");
        int H = scan.nextInt();

        if (H > 22) {

            System.out.println("Sıcak");
        }else {
            System.out.println("Serin");
        }
        System.out.println("Ders notunu giriniz");

        System.out.println("Fizik");
        double FFF = scan.nextDouble();

        System.out.println("Kimya");
        double KKK = scan.nextDouble();

        System.out.println("Geçme notu");
        double GGG = scan.nextDouble();

        double ortt = (FFF + KKK) / 2;
        if (ortt >= GGG) {
            System.out.println("Tebrikler Geçtiniz");
        } else {
            System.out.println("Kaldınız");
        }

    }
}
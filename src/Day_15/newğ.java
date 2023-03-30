package Day_15;

import java.util.Scanner;

public class newğ {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sifre="Harun123";
        int i=0;
        System.out.println("5 hakkın var ");
        while (i<5){
            System.out.print(i+1+".Tahmin: ");
            String tahmin=scan.next();
            if(tahmin.equals(sifre)){
                System.out.println("tebrikler");
                break;
            }
            i++;
            if(i==5){
                System.out.println("hatalı güle güle");
                break;
            }
            System.out.println("tekrar deneyiniz");



        }
   }

    }


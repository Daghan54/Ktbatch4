package Day_9;

import java.util.Scanner;

public class C05_ReationalOperatiobs {
    public static void main(String[]args){

        Scanner scan =new Scanner(System.in);

       /* System.out.println("boy gir");
        double boy =input.nextDouble();

        System.out.println("kilo gir");
        double kilo =input.nextDouble();
        input.nextLine();

        System.out.println("isim gir");
        String isim =input.nextLine();

        System.out.println("Soyisim gir");
        String Soyismin =input.nextLine();


        System.out.println("Ad ;"+isim+  " Soyad ;" +Soyismin+ "  boyunuz ;" +boy+"m kilonuz :" +kilo+"kg");
        */

        System.out.print("Kilonuz ;");
        int Kilo= scan.nextInt();

        System.out.print("Boyunuz ;");
        double Boy= scan.nextDouble();

        double bki = Kilo/(Boy*Boy);

        System.out.println("Boyunuz ;"+Kilo);
        System.out.println("Boyunuz ;= " + Boy);
        System.out.println("beden kitle indeksiniz ;= " + bki);


    }
}

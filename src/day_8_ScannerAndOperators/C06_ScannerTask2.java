package day_8_ScannerAndOperators;

import java.util.Scanner;

public class C06_ScannerTask2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("adınızı giriniz");
               String isim =scanner.nextLine();

        System.out.println("Soyadınızı giriniz");
        String Soyisim =scanner.nextLine();

        System.out.println("yaşınızı girirniz");
        int yaş = scanner.nextInt();


        System.out.println("isminiz:"+isim);
        System.out.println("Soyisim:"+Soyisim);
        System.out.println("Yaşınız:"+yaş);
        System.out.println("Kaydınız başarıyla tamamlanmıştır");
    }
}

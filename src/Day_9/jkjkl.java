package Day_9;

import java.util.Scanner;

public class jkjkl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Sayi 1");
        double x = scan.nextDouble();
        System.out.println("Sayi 2");
        double y = scan.nextDouble();

        System.out.println("Lütfen işlem giriniz");
        String işlem = scan.next();

        switch (işlem) {
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "*":
                System.out.println(x * y);
                break;
            case "/":
                System.out.println(x / y);
                break;
            default:
                System.out.println("Çıkış");
        }
        int beden = 44;

        switch (beden) {
            case 34,36,38:
                System.out.println("small");
                break;
            case 40,42,44:
                System.out.println("medium");
                break;
            case 46,48,50:
                System.out.println("Large");
                break;
            default:
                System.out.println("Çıkış");
        }
        System.out.println("Lütfen ders notunu gir :");
        double puan = scan.nextDouble();

        if (puan>=0&&puan<=25){
            System.out.println("Çok kötü");
        }
        else if (puan>=25&&puan<=50) {
            System.out.println("Kötü");
        } else if (puan>=50&&puan<=75) {
            System.out.println("İyi");

        } else if (puan>=75&&puan<=100) {
            System.out.println("Çok iyi");

        }else {
            System.out.println("Try again");
        }
    }
}

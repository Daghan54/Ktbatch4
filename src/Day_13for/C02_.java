package Day_13for;

import java.util.Scanner;

public class C02_ {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen ay seçiniz");
        int n = scan.nextInt();
        String result = "5";

        if (n >= 1 && n <= 12) {
            if (n == 1) {
                result = "Ocak";
            } else if (n == 2) {
                result = "Şubat";
            } else if (n == 3) {
                result = "Mart";
            } else if (n == 4) {
                result = "Nisan";
            } else if (n == 5) {
                result = "Mayıs";
            } else if (n == 6) {
                result = "Haziran";
            } else if (n == 7) {
                result = "Temmuz";
            } else if (n == 8) {
                result = "Ağustos";
            } else if (n == 9) {
                result = "Eylül";
            } else if (n == 10) {
                result = "Ekim";
            } else if (n == 11) {
                result = "Kasım";
            } else if (n == 12) {
                result = "Aralık";
            }else {
                result ="Replay";
            }
            System.out.println(result);
        }

        System.out.println("____----___----____-----____-----_____");
    }
}


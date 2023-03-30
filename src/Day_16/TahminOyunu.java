package Day_16;

import java.util.Random;
import java.util.Scanner;

public class TahminOyunu {
    public static void main(String[] args) {

        Random random = new Random();
        int sayi = random.nextInt(50);
        System.out.println(sayi);
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while (i <= 5) {
            System.out.println(i + " .Tahmin: ");
            int tahmin = scan.nextInt();
            if (tahmin > sayi) {
                System.out.println(" Yaklaştınız Aşağıya  ↓");
            } else if (tahmin < sayi) {
                System.out.println("Yaklaştınız Yukarıya  ↑");
            } else {
                System.out.println("Tebrikler");
                break;
            }
            i++;
            if (i == 6) {
                System.out.println("Bilemedin tuttuğum sayı: " + sayi);
            }
        }


    }
}

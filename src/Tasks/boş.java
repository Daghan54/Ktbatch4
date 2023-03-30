package Tasks;

import java.util.Scanner;

public class boş {
    public static void main(String[] args) {
        Scanner bul = new Scanner(System.in);

        /*System.out.println("Sayı girininiz");
        int sayı = bul.nextInt();
        System.out.println(sayı+10);
        sayı =sayı -20;
        System.out.println(sayı);


        System.out.println("1. sayı gir");
        int sayı1 = bul.nextInt();

        System.out.println("2. sayı gir");
        int sayı2 = bul.nextInt();

        System.out.println("3. sayı gir");
        int sayı3 = bul.nextInt();

int topla;
        System.out.println( sayı1+sayı2+sayı3);

*/
        System.out.println("Yariçap gir");
        double çap = bul.nextDouble();
        double PI = 3.14;
        double çevre = 2 * PI * çap;
        System.out.println("çevresi :"+çevre);


    }
}

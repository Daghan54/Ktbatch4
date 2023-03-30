package Day_15;

import java.util.Scanner;

public class Day_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Et mi, Köfte mi,Tavuk mu");
        int tercih1 = scan.nextInt();

        switch (tercih1) {

            case 1:
                System.out.println("Pirxola mı Tavuk mu");
                int tercih2 = scan.nextInt();
                switch (tercih2) {
                    case 1:
                        System.out.println("Pirzola");
                        break;
                    case 2:
                        System.out.println("Tavuk");
                        break;
                    default:
                        System.out.println("Hatalı giriş");

                }

            case 2:
                System.out.println("PEt , kjl");
                int tercih3 = scan.nextInt();
                switch (tercih3) {
                    case 1:
                        System.out.println("pet  Afiyet olsun");
                        break;
                    case 2:
                        System.out.println("kjl    Afiyet olsun");
                        break;
                    default:
                        System.out.println("Hatalı giriş");

                }
                break;

            default:
                System.out.println("TRY AGAİN");

        }
    }
}

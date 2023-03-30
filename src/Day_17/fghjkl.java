package Day_17;

import java.util.Scanner;

public class fghjkl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    /*    System.out.println("Lütfen numara giriniz");
        int k = scan.nextInt();

        if (k > 0) {
            System.out.println("Pozitive");
        } else if (k == 0) {
            System.out.println("Zero");

        } else if (k < 0) {
            System.out.println("Negative");

        } else {
            System.out.println("TYR AGAİN");

        }

        for (int i=0;i<=50;i++){
            System.out.println(i+" "+i*i);
        }
        for (char ch ='A'; ch<='Z'; ch++){
            System.out.println(ch+" ");
        }
        */
        String parola ="Dağhan";
        String tahmin ="";
        int hak =3;

        System.out.println("Parola için 3 hakkınız var ");

        for (int i=1; i<=3; i++){
            tahmin= scan.nextLine();
            if (tahmin.equals(parola)){
                System.out.println("Tebrikler bildiniz");
                break;
            }else {
                System.out.println("Parola yanlış kalan hakkınız :"+(hak-i));
            }
        }
    }

}
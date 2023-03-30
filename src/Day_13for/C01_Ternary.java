package Day_13for;

import java.util.Scanner;

public class C01_Ternary {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen bir sayı giriniz");
        int num = scan.nextInt();

        if (num%2==0){
            System.out.println("Sayı çift");
        }else {
            System.out.println("tek");
        }
        System.out.println(num%2==0? "Sayı çift":"Sayı tek");
    }
}

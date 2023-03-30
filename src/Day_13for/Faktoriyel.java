package Day_13for;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        //String nm ="Habil";
     //   System.out.println(nm);
    //    System.out.println(nm.charAt(2));

        System.out.println("Lütfen bir harf giriniz");
        char harf=scan.next().charAt(0);

        if (harf=='p'){
            System.out.println("pazar,Pazartesi");
        }else if (harf=='P'){
            System.out.println("Perşembe");
        }else {
            System.out.println("Lütfen geçerli bir harf giriniz");
        }
        System.out.println("___:)---___:)---___:)---___:)---___:)---___:)---___:)---__:)");

        switch (harf){
            case 'p','P':
                System.out.println("Bugün :Perşeembe");
                break;
            default:
                System.out.println("Try again");


                System.out.println("___:)---___:)---___:)---___:)---___:)---___:)---___:)---__:)");

        }
                String result=(harf=='P')? "pazar,Pazartesi": "Try again";
                System.out.println("result");

    }


}

package day10_UnaryLogicalOperAndReview;

import java.util.Scanner;

public class _Switch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bugün");
        int hafta = 2;

        switch (hafta) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Try again");
        }

    }
}

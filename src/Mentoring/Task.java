package Mentoring;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz");
        int a = scan.nextInt();
        int b = scan.nextInt();

        boolean fark = (a - b) % 2 == 1;
        System.out.println("fark = " + fark);
    }
}

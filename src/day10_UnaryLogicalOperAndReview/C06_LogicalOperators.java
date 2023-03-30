package day10_UnaryLogicalOperAndReview;

import java.util.Scanner;

public class C06_LogicalOperators {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double ort = 99;
        if (ort < 50) {
            System.out.println("Zayıf");
        }
        else if (ort >= 50 && ort < 70) {
            System.out.println("orta");
        }
        else if (ort >= 70 && ort < 85) {
            System.out.println("iyi");
        }
        else {
            System.out.println("pek iyi");
            if (ort>=95){
                System.out.println("bravo onur belgesini kazandınız");
            }
        }


    }
}

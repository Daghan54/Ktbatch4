package Day_16;

import java.util.Scanner;

public class Day_16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

    /*    for (int i=0; i<=100;i++){
            if (i>30&&i<50){
                continue;
            }
            System.out.print(i+" ");
        }*/
        for (int i = 0; i <= 100; i++) {
            if (i % 13 == 0) {
                continue;
            }
            System.out.print(i + " ");

        }
    }
}
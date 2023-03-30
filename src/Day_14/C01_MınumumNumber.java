package Day_14;

import java.util.Scanner;

public class C01_MınumumNumber {
    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("read");
            int num = scan.nextInt();
            if (num < max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}

package Day_9;

import java.util.Scanner;

public class SSS {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x, y, z;

        x = 60;
        y = 60;
        z = 60;

        if (x + y + z == 180) {
            if (x == 90 || y == 90 || z == 90) {
                System.out.println("üçgendir");
            } else {
                System.out.println("üçgen değil");
            }
            int a, b, c;
            a = 25;
            b = 56;
            c = 34;

            if (a >= y && a >= c) {
                System.out.println(a);
            } else if (b >= a && b >= c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }
}

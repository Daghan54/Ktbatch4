package Day_21;

public class fj {
    public static void main(String[] args) {
        fibonacci(9);
        System.out.println();

    }
    public static void fibonacci(int n) {

        int x = 0;
        int y = 1;
        int z;
        System.out.println(x + " ");
        System.out.println(y + " ");
        for (int i = 0; i < n - 2; i++) {
            z = x + y;
            System.out.print(z + " ");
            x = y;
            y = z;

        }
    }


}

package Day_21;

public class methots_summary {
    public static void main(String[] args) {
        System.out.println(max(5, 10));

    }

    public static int max(int x, int y) {
        int max;
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
}
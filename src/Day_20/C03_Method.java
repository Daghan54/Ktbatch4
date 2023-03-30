package Day_20;

public class C03_Method {
    public static void main(String[] args) {
        calculaterArea(3,5);
        calculaterArea(4,4);
        calculaterArea(3);
    }

    /**
     *
     * @param a
     * @param b
     */

    public static void calculaterArea(int a,int b){
        System.out.println(a*b);
    }

    /**
     *
     * @param radius
     */
    public static void calculaterArea(int radius){
        System.out.println(Math.round(Math.PI*radius*radius));
    }
}

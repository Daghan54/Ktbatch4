package Day_20;

public class C03_MethodOverLoading {
    public static void main(String[] args) {
        int sum = sum(10, 20);
        System.out.println("sum = " + sum);

        int sum1 = sum(10, 20, 30);
        System.out.println("sum1 = " + sum1);

        int sum2 = sum(10, 20, 30, 40);
        System.out.println("sum2 = " + sum2);


    }

    /**
     *
     */

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * @param num1
     * @param num2
     * @param num3
     * @return
     */

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    /**
     * @param num1
     * @param num2
     * @param num3
     * @param num4
     * @return
     */
    public static int sum(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }
    public static double sum(double num,double num1,double num2){
        return   num +  num1 +  num2;
    }
}
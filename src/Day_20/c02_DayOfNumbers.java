package Day_20;

public class c02_DayOfNumbers {
    public static void main(String[] args) {
        int sum = sumOf2Numbers(10, 20);
        System.out.println("sum = " + sum);

        int sum2 = sumOf3Numbers(10, 20, 30);
        System.out.println("sum2 = " + sum2);

        int sum3 = sumOf4Numbers(10, 20, 30, 40);
        System.out.println("sum3 = " + sum3);


    }

    /**
     * @param num1
     * @param num2
     * @return
     */
    public static int sumOf2Numbers(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    public static int sumOf3Numbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    /**
     * @param num1
     * @param num2
     * @param num3
     * @param num4
     * @return
     */
    public static int sumOf4Numbers(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }
}

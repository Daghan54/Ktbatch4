package Day_18;

public class Day_2 {
    public static void main(String[] args) {
        oddOrEven(9);
    }


    /**
     *
     * @param number
     */
    public static void oddOrEven(int number) {
        if (number%2==0)
            System.out.println(number+ " + Artı bir sayıdır ");
        else
            System.out.println(number+ " - Eksi bir sayıdır ");

    }
}

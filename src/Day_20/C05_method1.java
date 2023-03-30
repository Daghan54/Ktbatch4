package Day_20;

public class C05_method1 {
    public static void main(String[] args) {

        concat1(66,"Ali", true);

    }/*
     * 3 parametreli bir method yazin int ve String ve boolean tipinde 3 parametre alsin
     * Boolean true ise int ve String değeri concat yapsın.
     * false ise başka bir methodu çağırsın ve String değeri int kadar yazdırsın.*/

    /**
     *
     * @param i
     * @param str
     * @param bl
     */
    public static void concat1(int i, String str, boolean bl) {

        if (bl) {
            System.out.println(str + i);
        } else {
            concat1(0,str,bl);
        }
    }

    /**
     *
     * @param num
     * @param str
     */

    public static void concat(int num, String str) {
        for (int i = 1; i < num; i++) {
            System.out.println(str);

        }
    }
}

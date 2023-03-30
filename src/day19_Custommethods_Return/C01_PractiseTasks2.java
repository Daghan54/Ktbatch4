package day19_Custommethods_Return;

public class C01_PractiseTasks2 {

    public static void main(String[] args) {
        tlDollar(34000);
        System.out.println(kgToLibre(10));   }
    public static void tlDollar(int TL){
        System.out.println(TL+" TL makes "+Math.round(TL/19.04)+" Dolar");

    }

    public static double kgToLibre(double kg){
        double result=0;
        result=Math.round((kg*2.20000)*100)/100.0;

        return result;
    }
}

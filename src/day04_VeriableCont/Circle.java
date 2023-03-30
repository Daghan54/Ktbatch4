package day04_VeriableCont;

import java.util.Scanner;

public class Circle {
    public static void main(String[]args){

        Scanner scan=new Scanner(System.in);


        /*  String employeeName = "John";
        int age =25;
        char gender ='M';
        String campany ="Apple";
        String JobTitle = "SDET";
        double yearsOFExperience =2.5;
        int salary = 120000;
        boolean isFullTime = true;
        boolean isMarried =false;
        String  EmployeeID = "A1234015";
        String SSN ="AV1234322";


        System.out.println("employeeName = " + employeeName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("campany = " + campany);
        System.out.println("JobTitle = " + JobTitle);
        System.out.println("yearsOFExperience = " + yearsOFExperience);
        System.out.println("salary = " + salary);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("isMarried = " + isMarried);
        System.out.println("EmployeeID = " + EmployeeID);
        System.out.println("SSN = " + SSN);


        double num1 =9.6;
        int num2 =6;
        num2 =(int) num1;
        System.out.println(num2);


        String name ="Büşra";
        String Surname = "Daghan";
        int age =25;
        int BirthAge = 1998;
        int BirthDay = 12;

        System.out.println("name = " + name);
        System.out.println("Surname = " + Surname);
        System.out.println("age = " + age);
        System.out.println("BirthAge = " + BirthAge);
        System.out.println("BirthDay = " + BirthDay);

        System.out.println("Hello\t\b\t\bWorld");
        //System.out.println(Math.sqrt(49));
        double PI=3.14;
        double r=2;
        double alan=PI*r*r;
        double alan2 =Math.PI*Math.pow(r,2);
        System.out.println("alan = " + alan);
        System.out.println("alan2 = " + alan2);

        double f=300;
        double c=(f-32)/1.8;
        System.out.println("c = " +(int) c);

        int fizik=92;
        int kimya=55;
        int math=89;
        double ort = (fizik+kimya+math)/3;
        System.out.println("ort = " + ort);
        boolean isPas=ort>80;
        System.out.println(isPas);

        int sıra=15;
        int koltuk=12;
        int katılan=113;
        double tp= sıra*koltuk;
        System.out.println("tp = " + tp);

       // toplam 180 adet koltuk var.
        // boş koltuk 67 adet
        //7.5 sırada oturuluyor
        //7.5  boş sıra var
        // 6 adet boş sıra


        int dk = 4321;
        int saat  = 4321/60;
        System.out.println("saat = " + saat);

        int dak =4321;
        int san = 4321%60;
        System.out.println("san = " + san);*/

     //   System.out.println("Lütfen bir kelime yazınız:");
        //   String a=scan.nextLine();
        //  System.out.println("Girilen harf:" +a);

        //   System.out.println("Lütfen bir sayı giriniz");
        //  int b=scan.nextInt();
        //  System.out.println("Girilen sayı : " + 7);



       /* double dfe= 6.9;
        short ss=2;
        ss=(short) dfe;
        System.out.println("ss = " + ss);

        short ff=8;
        double dd=5.5;
        dd=ff;
        System.out.println("dd = " + dd);




        int gg=4;
        double hh=6.1;
        hh=gg;
        System.out.println("hh = " + hh);


        double jk=8.9;
        int ll=6;
        ll=(int) jk;
        System.out.println("ll = " + ll);


        double A_musluğu= 12;
        double B_muslığu= 30;
        double C_musluğu=  9;
        double top =(A_musluğu+B_muslığu-C_musluğu);
        System.out.println("top = " + top);*/

        int age =20;
        String healt ="Healty";

        boolean toBeSoldier = age>=20&&healt=="healty";
        System.out.println(toBeSoldier = age ==22 && healt=="healty" || age>19 && healt=="poorly");

        boolean Ali = false;
        boolean Mehmet =false;
        boolean  Faruk =true;

        Ali=!Mehmet;
        Faruk = !Ali && Ali==Faruk;

    }
}

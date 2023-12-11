import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        // Degiskenleri olusturalım.
        int a,b;
        double c,alan,ucgeninCevresi,vAlan;

        // Kullanıcıdan verileri alalım.
        Scanner girdi = new Scanner(System.in);

        System.out.println("Birinci Kenarı Giriniz :  ");
        a = girdi.nextInt();
        System.out.println("İkinci kenari Giriniz : ");
        b= girdi.nextInt();
        System.out.println();

        c= Math.sqrt((a*a)+(b+b));

        System.out.println("Hipotenus "  + c);

        alan = (a+b+c)/2;
        ucgeninCevresi = 2*alan;
        vAlan = alan*(alan-a)*(alan-b)*(alan-c);

        System.out.println(alan);
        System.out.println(ucgeninCevresi);
        System.out.println(vAlan);


    }
}
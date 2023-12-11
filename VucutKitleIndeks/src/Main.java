import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        double b,vki;
        int kg;
        boolean kosul1;

        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen Boyunuzu (metre cinsinden) Giriniz .: ");
        b = inp.nextDouble();

        System.out.println("Lütfen Kilonuzu Girin .: ");
        kg = inp.nextInt();

        vki = kg / (b * b);
        kosul1 = (vki<36)? true: false;
        System.out.println("Vücut Kitle İndeksiniz : " + vki);
        System.out.println(kosul1);









    }
}
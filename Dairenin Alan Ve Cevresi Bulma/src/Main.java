import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int r,a ;
        double pi=3.14;

        Scanner inp = new Scanner(System.in);


        System.out.println("Dairenin Yari Capini Giriniz:   ");
        r = inp.nextInt();
        System.out.print("Lütfen Merkez Açısını Giriniz : ");
        a = inp.nextInt();

        double alan = pi * r * r ;
        double cevre = 2 * pi * r;
        double daireDilimi = (pi*(r*r)*r);

        System.out.println("Dairenin Alanı :  "+alan);
        System.out.println("Dairenin Cevresi : "+cevre);
        System.out.println("Dairenin Dilim Alanı :"+daireDilimi);






    }
}
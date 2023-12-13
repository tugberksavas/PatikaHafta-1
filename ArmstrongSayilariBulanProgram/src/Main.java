import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        int adet = 0,toplam = 0;
        String kosul1;

        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayılarının toplamını hesaplama");

        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();


        while(sayi != 0)
        {
            toplam = (sayi%10) + toplam;
            sayi /= 10;
            ++adet;
        }
        System.out.println("kac basamaklı: " + adet);
        System.out.println("Basamakların Toplamı: " + toplam);

        kosul1 = (toplam<=10)? "sayıların toplamı 10dan kucuk":"sayıların toplamı 10dan buyuk";
        System.out.println(kosul1);
    }
}
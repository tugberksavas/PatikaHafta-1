import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Tam Sayınızı Giriniz: ");
        int sayi = input.nextInt();
        System.out.println("Ondalıklı Sayınızı Giriniz: ");
        double ondalikliSayi = input.nextDouble();
        String kosul1;



        double doubleSayi =sayi;
        int tamSayi = (int)ondalikliSayi;

        System.out.println("Ondalıklı Sayı: " + doubleSayi);
        System.out.println("Tam Sayı: " + tamSayi);


        kosul1 = (tamSayi<=20)? "sayi 20den buyuk" : "sayi 20den kucuk";
        System.out.println(kosul1);

    }
}
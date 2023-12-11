import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*
        Kullanıcıdan 3 tane sayı (a, b, c) alıp bu sayıları işlem sırasına göre
         işleyen bir program yazın.
        İşlem sırası şöyle olsun: a+b*c-b. İşlem tamamladıktan sonra sonucu ekrana yazdırın.
         */

        int a=10,b=2,c=3,sonuc1;
        boolean kosul1;

        Scanner input = new Scanner(System.in);


        sonuc1= a+b*c-b;
        System.out.println("islem sonu "+sonuc1);


        kosul1=(sonuc1<10)?true:false;
        System.out.println(kosul1);




    }
}
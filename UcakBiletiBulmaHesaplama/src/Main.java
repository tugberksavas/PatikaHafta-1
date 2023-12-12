import java.util.Scanner;

//https://github.com/tugberksavas

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int km, yas, tip;
        double tutar, topTutar = 0, indTutar, indYas, indGidisDonus;
        boolean fiyat;

        System.out.println("Ucak Bileti Hesaplama");
        System.out.println("");



        System.out.println("Mesafe km olarak giriniz: ");
        km = input.nextInt();
        System.out.println("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.println("Yolculuk tipi seç\n(1-Tek Yön, 2-Gidiş Dönüş): ");
        tip = input.nextInt();

        System.out.println("Uçak Bileti Fiyatı Buldunuz");



        if (km > 0 && yas > 0 && (tip == 1 || tip == 2)) {
            tutar = km * 0.10;

            //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.

            if (yas < 12) {
                indYas = tutar * 0.50;
                indTutar = tutar - indYas;
                indGidisDonus = tip == 2 ? indTutar * 0.20 : 0;
                topTutar = (indTutar - indGidisDonus) * tip;
                System.out.println("Toplam tutar: " + topTutar);
            }

            //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.

            else if (yas < 24) {
                indYas = tutar * 0.10;
                indTutar = tutar - indYas;
                indGidisDonus = tip == 2 ? indTutar * 0.20 : 0;
                topTutar = (indTutar - indGidisDonus) * tip;
                System.out.println("Toplam tutar: " + topTutar);
            }

            //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.

            else if (yas < 65) {
                indGidisDonus = tip == 2 ? tutar * 0.20 : 0;
                topTutar = (tutar - indGidisDonus) * tip;
                System.out.println("Toplam tutar: " + topTutar);
            } else {
                indYas = tutar * 0.30;
                indTutar = tutar - indYas;
                indGidisDonus = tip == 2 ? indTutar * 0.20 : 0;
                topTutar = (indTutar - indGidisDonus) * tip;
                System.out.println("Toplam tutar: " + topTutar);
            }
        } else System.out.println("Hatalı veri girildi");

        fiyat = ( topTutar>200)? true : false;
        System.out.println(fiyat);

    }
}

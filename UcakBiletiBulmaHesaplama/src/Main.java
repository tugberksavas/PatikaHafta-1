import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);

        /*Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
        Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
        İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
        Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
        Toplam Tutar = (135-27)* 2 = 216 TL

         */

        int km,yas,tip;
        double normalTutar, topamTutar = 0, indirimliTutar, yasİndirimi, indGidisDonus;

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
            normalTutar = km * 0.10;

            if (yas < 12) {
                yasİndirimi = normalTutar * 0.50;
                indirimliTutar = normalTutar - yasİndirimi;
                indGidisDonus = tip == 2 ? indirimliTutar * 0.20 : 0;
                topamTutar = (normalTutar - indGidisDonus) * tip;
                System.out.println("Toplam tutar: " + topamTutar);
            }
            else if (yas < 24) {
                yasİndirimi = normalTutar * 0.10;
                indirimliTutar= normalTutar - yasİndirimi;
                indGidisDonus = tip == 2 ? indirimliTutar * 0.20 : 0;
                topamTutar = (indirimliTutar - indGidisDonus) * tip;
                System.out.println("Toplam tutar: " + topamTutar);
            }
            else if (yas < 65) {
                indGidisDonus = tip == 2 ? normalTutar * 0.20 : 0;
                topamTutar = (normalTutar - indGidisDonus) * tip;
                System.out.println("Toplam tutar: " + topamTutar);
            } else {
                yasİndirimi = normalTutar * 0.30;
                indirimliTutar = normalTutar - yasİndirimi;
                indGidisDonus = tip == 2 ? indirimliTutar * 0.20 : 0;
                topamTutar = (indirimliTutar - indGidisDonus) * tip;
                System.out.println("Toplam tutar: " + topamTutar);
            }
        }else {
            System.out.println("hatali giris yaptınız");
        }
    }
}
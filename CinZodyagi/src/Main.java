import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner  input = new Scanner(System.in);

        int dogumYili;

        System.out.println("Dogum yilinizi giriniz :   ");
        dogumYili = input.nextInt();
        
        if (dogumYili>0){
            if (dogumYili%12==0){
                System.out.println("MAYMUN");
            } else if (dogumYili %12 == 1) {
                System.out.println("horoz");
            } else if (dogumYili %12 == 2) {
                System.out.println("kopek");
            } else if (dogumYili %12 == 3) {
                System.out.println("domuz");
            } else if (dogumYili %12 == 4) {
                System.out.println("fare");
            } else if (dogumYili %12 == 5) {
                System.out.println("okuz");
            } else if (dogumYili %12 == 6) {
                System.out.println("kaplan");
            } else if (dogumYili %12 == 7) {
                System.out.println("tavsan");
            }else if (dogumYili %12 == 8 ){
                System.out.println("ejdarha");
            }else if (dogumYili %12 == 9){
                System.out.println("yılan");
            } else if (dogumYili %12 == 10) {
                System.out.println("at");
            } else if (dogumYili %12 == 11) {
                System.out.println("koyun");
            }else {
                System.out.println("hatalı giris yaptınız");
            }
        }

    }
}
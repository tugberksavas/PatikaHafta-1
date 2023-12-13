import java.util.Scanner;

//https://github.com/tugberksavas

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int n,k,total=1;
        Scanner input = new Scanner(System.in);

        System.out.println("üssü alinacak sayi: ");
        n = input.nextInt();
        System.out.println("üs olacak sayi :  ");
        k = input.nextInt();

        /*
        int i =1;
        while (i<=k){
            System.out.println(i);
            total *= n;
            i++;
        }

        System.out.println("cevvap "+total);

         */

        for (int i=1; i<=k ; i++){
            total = total*n;
        }

        System.out.println(total);
        String kosul1 = (total > 80) ? "sayi 80den buyuk" : "sayi seksenden kucuk";
        System.out.println(kosul1);
    }
}
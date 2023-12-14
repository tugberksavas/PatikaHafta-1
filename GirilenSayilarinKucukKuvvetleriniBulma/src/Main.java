import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("Girdiğiniz sayıya kadar olan 4 ve 5'in kuvvetleri için;");
        System.out.print("Sayı giriniz: ");
        n=input.nextInt();


        System.out.println("Girilen sayının 2'ün kuvvetleri");

        for(int i=1; i<=n;i*=2)
        {
            System.out.println(i);
        }



        System.out.println("Girilen sayının 4'ün kuvvetleri");
        for (int i=1;i<=n;i*=4)
            System.out.println(i);


        System.out.println("Girilen sayının 5'in kuvvetleri");
        for (int i=1;i<=n;i*=5)
            System.out.println(i);


    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

            int n1 = 0, n2 = 1;
            int toplam = n1 + n2;

            Scanner input = new Scanner(System.in);
            System.out.println("----------------------------------");
            System.out.print("Fibonacci sayı adeti giriniz:  ");
            int value = input.nextInt();
            System.out.println("----------------------------------");
            System.out.print(n1 + "  " + n2);
            while (value > 0)
            {
                System.out.print(toplam + " ");
                value--;
                n1 = n2; n2 = toplam; toplam= n1 + n2;
            }
    }
}
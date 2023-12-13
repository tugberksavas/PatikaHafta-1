import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner input = new Scanner(System.in);
        int n,r;



        System.out.print("1.faktoriyel sayisi : ");
        n = input.nextInt();
        System.out.print("2.fatoriyel sayisi : ");
        r = input.nextInt();


        int total1 =1 ;
        for (int i =1; i<=n; i++){
            System.out.println(i);
            total1 = total1*i;
        }

        int total2 =1 ;
        for (int j =1; j<=r; j++){
            System.out.println(j);
            total2 = total2*j;

        }

        int total3=1;
        for(int k =1; k<=(n-r); k++);{
            total3 = total3*1;
        }

        int kombinasyon = total1 / (total2 * total3);
        System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);

    }
}
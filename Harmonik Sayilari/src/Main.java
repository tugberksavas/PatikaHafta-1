import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner input = new Scanner(System.in);
        System.out.print("N sayisini giriniz:");
        int n = input.nextInt();
        double result = 0.0;
        for (int i = 1; i <= n; i++){
            result += (1.0/i);

        }

        //1.dongu i =1; result = 0+(1/1)=1
        //2.dongu i =2; result = 1+(1/2)=1,5
        //3.dongu i =3; result = 1,5+(

        System.out.println(result);



    }
}
import java.util.Scanner;

public class Main {

    //https://github.com/tugberksavas


    public static void main(String[] args) {
        System.out.println("Hello world!");

        int heat;
        boolean kosul1;

        Scanner input = new Scanner(System.in);
        System.out.println("Sicaklık Giriniz");
        heat = input.nextInt();
        
        if (heat<5){
            System.out.println("kayak yapabilir");
        } else if (heat>=5 && heat<=25) {
            if (heat<=15){
                System.out.println("sinemaya gidebilirsin.");
            }
            if (heat>=10){
                System.out.println("piknige gidebilirsin");
            }

        }else if (heat>25){
            System.out.println("yüzmeye gidebilirsin");
        }

        kosul1 = (heat<15)? true:false;
        System.out.println(kosul1);

    }
}
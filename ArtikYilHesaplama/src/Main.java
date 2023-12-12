import java.util.Scanner;

https://github.com/tugberksavas

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int year;
        String kosul1;


        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        year = input.nextInt();

        if(year % 4 == 0){
            if(year % 100 >= 0 || year % 400 == 0){
                System.out.println(year + " bir artık yıldır.");
            }
        } else {
            System.out.println(year + " bir artık yıl değildir.");
        }

        kosul1 = (year == 2023) ? "this year " : "bu yıl değil ";
        System.out.println(kosul1);





    }
}
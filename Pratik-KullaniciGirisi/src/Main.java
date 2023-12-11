import java.util.Scanner;

public class Main {

    //https://github.com/tugberksavas

    public static void main(String[] args) {
        System.out.println("Hello world!");

        String userName, passWord, answer, newPassword;
        boolean kosul1;

        Scanner input = new Scanner(System.in);

        System.out.println("kullancici adınız :   ");
        userName = input.nextLine();
        System.out.println("sifrenizi yazınız:   ");
        passWord = input.nextLine();

        if (userName.equals("patika") && passWord.equals("java123")) {
            System.out.println("Giris Başarılı.");

        } else if (userName.equals("patika") && !(passWord.equals("java123"))) {
            System.out.println("Şifenizi Sıfırlamak İster misiniz? \n1-Evet\n2-Hayır");
            answer = input.nextLine();

            if (answer.equals("1")){
                System.out.print("Yeni Bir Şifre Oluşturunuz : ");
                newPassword = input.nextLine();

                if (newPassword.equals("java123")) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else{
                    System.out.println("Şifre oluşturuldu");
                }
            }else{
                System.out.println("Şifre Oluşturmadınız !");
            }
        }else{
            System.out.println("Girilen Bilgiler Yanlış");
        }


        kosul1 = (userName==passWord)? true:false;
        System.out.println(kosul1);

    }
}
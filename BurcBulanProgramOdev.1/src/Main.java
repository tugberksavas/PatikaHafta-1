import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int month, day;
        String burc = "";
        boolean isError = false;
        boolean kosul1;
        boolean kosul2;
        boolean kosul3;


        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz Ay .: ");
        month = input.nextInt();
        System.out.print("Doğduğunuz Gün .: ");
        day = input.nextInt();


        if(1<=month && month<=12) {
            if(month == 1) {
                if (1 <= day && day <= 31) {
                    if (day <= 21) {
                        burc = "Oğlak";
                    } else {
                        burc = "Kova";
                    }
                }
                else{
                    isError = true;
                }
            }
            else if(month == 2) {
                if (1 <= month && month <= 28) {
                    if (day <= 19) {
                        burc = "Kova";
                    } else {
                        burc = "Balık";
                    }
                }
                else{
                    isError = true;
                }
            }
            else if(month == 3) {
                if (1 <= month && month <= 31) {
                    if (day <= 20) {
                        burc = "Balık";
                    } else {
                        burc = "Koç";
                    }
                }
                else{
                    isError = true;
                }
            }
            else if(month == 4) {
                if (1 <= day && day <= 30) {
                    if (day <= 20) {
                        burc = "Koç";
                    } else {
                        burc = "Boğa";
                    }
                }
                else{
                    isError = true;
                }
            }
            else if(month == 5) {
                if (1 <= day && day <= 31) {
                    if (day <= 20) {
                        burc = "Boğa";
                    } else {
                        burc = "İkizler";
                    }
                }
                else{
                    isError = true;
                }
            }
            else if(month == 6) {
                if (1 <= day && day <= 31) {
                    if (day <= 22) {
                        burc = "İkizler";
                    } else {
                        burc = "Yengeç";
                    }
                }
                else{
                    isError = true;
                }
            }
            else if(month == 7) {
                if (1 <= day && day <= 31) {
                    if (day <= 22) {
                        burc = "Yengeç";
                    } else {
                        burc = "Aslan";
                    }
                }
                else{
                    isError = true;
                }
            }
            else if(month == 8) {
                if (1 <= day && day <= 31) {
                    if (day <= 22) {
                        burc = "Aslan";
                    } else {
                        burc = "Başak";
                    }
                }
                else{
                    isError = true;
                }
            }
            else if(month == 9) {
                if (1 <= day && day <= 31) {
                    if (day <= 22) {
                        burc = "Başak";
                    } else {
                        burc = "Terazi";
                    }
                }
                else{
                    isError = true;
                }
            }
            else if(month == 10) {
                if (1 <= day && day <= 31) {
                    if (day <= 21) {
                        burc = "Terazi";
                    } else {
                        burc = "Akrep";
                    }
                }
                else{
                    isError = true;
                }
            }
            else if(month == 11) {
                if (1 <= day && day <= 31) {
                    if (day <= 21) {
                        burc = "Akrep";
                    } else {
                        burc = "Yay";
                    }
                }
                else{
                    isError = true;
                }
            }
            else {
                if (1 <= day && day <= 31) {
                    if (day <= 21) {
                        burc = "Yay";
                    } else {
                        burc = "Oğlak";
                    }
                }else{
                    isError = true;
                }
            }

        }
        else {
            System.out.println("Geçerli bir ay giriniz..");
        }

        if(isError == true){
            System.out.println("Geçerli bir gün giriniz..");
        }
        else{
            System.out.println("Burcunuz: "+burc);
        }

        kosul1 = (month ==1 )? true: false;
        System.out.println(kosul1);
        kosul2 = (day ==31)?true:false;
        System.out.println(kosul2);
        kosul3 = (kosul1==kosul2)?true:false;
        System.out.println(kosul3);

    }
}
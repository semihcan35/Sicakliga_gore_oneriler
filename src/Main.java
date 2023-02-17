import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int temperature;
        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklığı giriniz:");
        temperature = input.nextInt();

        if(temperature<5){
            System.out.println("Bu havada kayak yapabilirsiniz.");
        }

        else if(5 <= temperature && temperature<=15){
            System.out.println("Sinemaya gitmek için harika bir hava.");
        }

        else if(15<=temperature && temperature<=25){
            System.out.println("Ailecek piknik yapmak için güzel bir hava");
        }

        else if(temperature>25){
            System.out.println("Yüzmeye gitmek için mantıklı bir tercih");
        }



    }
}
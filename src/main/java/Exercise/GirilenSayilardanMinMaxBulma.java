package Exercise;
import java.util.Scanner;
/*

Java ile klavyeden girilen N tane sayma sayısından
en büyük ve en küçük sayıları bulan ve bu sayıları
ekrana yazan programı yazın.

 */
public class GirilenSayilardanMinMaxBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min=0,max=0;
        int firstNumber;
        int count;
        System.out.print("Kaç tane sayı gireceksiniz : ");
        count = scanner.nextInt();

        if(count>0) {
            System.out.print("1. sayıyı giriniz : ");
            firstNumber = scanner.nextInt();
            min = firstNumber;
            max = firstNumber;

            for (int i = 2; i <= count; i++) {
                System.out.print(i + ". sayıyı giriniz : ");
                int currentNumber = scanner.nextInt();

                if (currentNumber > max) {
                    max = currentNumber;
                }
                if (currentNumber < min) {
                    min = currentNumber;
                }

            }
            System.out.println("Girilen min sayı : " +min);
            System.out.println("Girilen max sayı : "+max);


        }
        else {
            System.out.println("Geçerli bir sayı giriniz.");
        }







    }
}

package Exercise;
import java.util.Scanner;

/*
Bir sayının kendisi hariç pozitif tam sayı çarpanları
(kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
 */
public class MukemmelSayiBulanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int total=0;
        System.out.print("Bir sayı giriniz : ");
        input=scanner.nextInt();

        for (int i=1;i<input;i++) {
            if(input%i==0) {
                total+=i;
            }

        }
        if(total==input) {
            System.out.println(input+" sayısı mükemmel sayıdır.");
        }
        else {
            System.out.println(input+" sayısı mükemmel sayı değildir.");
        }


    }
}

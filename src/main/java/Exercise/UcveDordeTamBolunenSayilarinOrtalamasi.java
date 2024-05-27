package Exercise;

import java.util.Scanner;

/*
0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e
tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
*/
public class UcveDordeTamBolunenSayilarinOrtalamasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int input;
        double total = 0;
        System.out.print("Sayi giriniz : ");
        input = scanner.nextInt();

        for (int i = 1; i <= input; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                count++;
                total = total + i;
            }
        }


        System.out.println("Girilen sayıların ortalaması : " + total / count);

    }
}

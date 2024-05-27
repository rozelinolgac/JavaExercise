package Exercise;
import java.util.Scanner;
public class TekSayiGirisineKadarCiftveDordunKatlariniToplama {
    /*
     tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
     çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int total=0;
        int total2 =0;

        // Alternatif 1
        System.out.print("Lütfen sayı girişi yapınız : ");
        input = scanner.nextInt();

        while (input%2==0) {
            if (input%2==0 || input%4==0) {
                total=total+input;
            }
            System.out.print("Lütfen sayı girişi yapınız : ");
            input = scanner.nextInt();
        }
        System.out.println("Toplam 1 : " + total);


        // Alternatif 2 :
        while (true) {
            System.out.print("Bir sayı girin: ");
            int sayi = scanner.nextInt();

            if (sayi % 2 != 0) { // Sayı tek ise döngüden çık
                break;
            }

            if (sayi%2==0 || sayi%4==0) {
                total2 += sayi;
            }
        }
        System.out.println("Toplam 2 : " +total2);




    }
}

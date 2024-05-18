package GirisDersi;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double one, two;
        int select;
        System.out.print("İlk sayıyı giriniz : ");
        one = scanner.nextDouble();
        System.out.print("İkinci sayıyı giriniz : ");
        two = scanner.nextDouble();
        System.out.println("İşlem seçimi yapınız :\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = scanner.nextInt();
        System.out.println("Girdiğiniz sayilar : " + one + " ve " + two + " Seçtiğiniz işlem : " + select);

        switch (select) {
            case 1:
                System.out.println("Toplama işlemi sonucu : " + (one + two));
                break;

            case 2:
                System.out.println("Çıkarma işlemi sonucu : " + (one - two));
                break;
            case 3:
                System.out.println("Çarpma işlemi sonucu : " + (one * two));
                break;
            case 4:
                if (two != 0) {
                    System.out.println("Bölme işlemi sonucu : " + (one / two));
                } else {
                    System.out.println("Bir sayı 0'a bölünemez,ikinci sayi girişini tekrardan yapınız");
                }

                break;
            default:
                System.out.println("Geçersiz işlem girişi, tekrardan giriniz");
        }
    }
}

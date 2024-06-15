package Exercise;

import java.rmi.MarshalException;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
/*
Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı
kullanıcının tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.
Kullanıcıya 5 hak verilecek, tahmin ettiği sayı için yakın - uzak bilgisi verilecek.
 */

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(100);
        System.out.println(randomNumber);
        int select;
        int life = 0;
        int[] selectNumbers = new int[5]; // yanlış tahminleri bu diziye ekliyorum
        int indeks = 0;
        boolean isWin = false;
        System.out.println("Merhabalar, sayı tahmin oyununa hoş geldiniz.Oyuna 5 tahmin hakkı ile başlıyorsunuz. " +
                "Boool Şans !");


        while (life < 5) {
            System.out.print("Sayı girişi yapınız : ");
            select = scanner.nextInt();
            if (select < 0 || select > 100) {
                System.out.println("Lütfen sayı girişini 0-100 aralığında yapınız");
                continue;
            }
            if (select == randomNumber) {
                System.out.println("Tebrikler, doğru sayı tahmini yaptınız");
                System.out.println("Gizli sayımız : " + randomNumber);
                isWin = true;
                break;
            } else {
                life++;
                if (select > randomNumber) {
                    System.out.println("Hatalı sayı girdiniz," + select + " sayısı gizli sayıdan büyük");
                } else {
                    System.out.println("Hatalı sayı girdiniz," + select + " sayısı gizli sayıdan küçük");

                }
                selectNumbers[indeks] = select;
                indeks++;
                System.out.println("Kalan hakkınız : " + (5 - life));


            }

        }
        if (!isWin) {
            System.out.println("Kaybettiniz");
            System.out.println("Yanlış tahminleriniz : " + Arrays.toString(selectNumbers));
        }


    }
}

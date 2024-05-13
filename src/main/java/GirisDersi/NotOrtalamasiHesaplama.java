package GirisDersi;
import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik puanınız : ");
        mat = scanner.nextInt();

        System.out.print("Fizik puanınız : ");
        fizik = scanner.nextInt();

        System.out.print("Kimya puanınız : ");
        kimya = scanner.nextInt();

        System.out.print("Türkçe puanınız : ");
        turkce = scanner.nextInt();

        System.out.print("Tarih puanınız : ");
        tarih = scanner.nextInt();

        System.out.print("Müzik puanınız : ");
        muzik = scanner.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik ;
        double ortalama = (toplam) / 6.0;
        System.out.println("Yıl sonu ortalamanız : " + ortalama);

        String sinifiGecmeDurumu =ortalama >= 60 ? "Sınıfı Geçtiniz, Tebrikler!" : "Sınıfı Kaldınız." ;
        System.out.println(sinifiGecmeDurumu);
    }
}

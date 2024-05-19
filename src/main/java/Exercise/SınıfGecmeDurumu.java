package Exercise;

import java.util.Scanner;

/*

Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
Geçme Notu : 55
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
 */
public class SınıfGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        int count = 0;
        int ortalama=0;
        int toplam = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Matematik dersi için notunuzu girin : ");
        mat = scanner.nextInt();
        if (mat >= 0 && mat <= 100) {
            count++;
            toplam=toplam+mat;
        }

        System.out.print("Fizik dersi için notunuzu girin : ");
        fizik = scanner.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            count++;
            toplam=toplam+fizik;
        }

        System.out.print("Türkçe dersi için notunuzu girin : ");
        turkce = scanner.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            count++;
            toplam=toplam+turkce;
        }

        System.out.print("Kimya dersi için notunuzu girin : ");
        kimya = scanner.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            count++;
            toplam=toplam+kimya;
        }

        System.out.print("Müzik dersi için notunuzu girin : ");
        muzik = scanner.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            count++;
            toplam=toplam+muzik;
        }
        ortalama = (toplam ) / count;


        if(ortalama >= 55) {
            System.out.println("Sınıfı geçtiniz tebrikler");
        }
        else {
            System.out.println("Sınıfı kaldınız");
        }

        System.out.println("Ortalamanız : " +ortalama);

    }
}

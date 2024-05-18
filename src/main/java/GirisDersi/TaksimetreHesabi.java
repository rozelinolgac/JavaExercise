package GirisDersi;
import java.util.Scanner;

/*
    Taksimetre KM başına 2.20₺
    Minimum ödenecek tutar 20₺.
    20₺ altında olan ücretlerde yine 20₺ alınacaktır.
    Taksimetre açılış ücreti 10₺
    -- input = km

*/

public class TaksimetreHesabi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int acilisUcreti = 10;
        double perKM = 2.20;
        double km;
        System.out.print("Lütfen gidilen km'yi giriniz.");
        km = scanner.nextDouble();
        double odenecekTutar = acilisUcreti + (km * perKM);
        odenecekTutar = (odenecekTutar <= 20) ? 20 : odenecekTutar;
        System.out.println("Ödenecek taksimetre ücreti : " + odenecekTutar);

    }
}

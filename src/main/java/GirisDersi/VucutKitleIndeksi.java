package GirisDersi;
import  java.util.Scanner;

// Kilo (kg) / Boy(m) * Boy(m)
public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kg,lenght;
        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = scanner.nextDouble();
        System.out.print("Lütfen boyunuzu giriniz : ");
        lenght = scanner.nextDouble();
        double kitleIndeksi = kg / (lenght*lenght);
        System.out.println("Vücut kitle indeksiniz " + kitleIndeksi);
    }
}

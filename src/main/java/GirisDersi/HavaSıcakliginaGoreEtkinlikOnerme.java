package GirisDersi;
import java.util.Scanner;

/*
    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
*/
public class HavaSıcakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double heat;
        System.out.print("Sıcaklık değerini giriniz. ");
        heat = scanner.nextDouble();

        if (heat <5) {
            System.out.println("Kayak yapabilirsiniz");
        }
        if (heat <= 15 && heat >=5) {
            System.out.println("Sinemaya gidebilirsiniz");
        }
        if (heat > 10 && heat <= 25) {
            System.out.println("Pikniğe gidebilirsiniz");
        }
        if (heat > 25) {
            System.out.println("Yüzmeye gidebilirsiniz");
        }
    }
}

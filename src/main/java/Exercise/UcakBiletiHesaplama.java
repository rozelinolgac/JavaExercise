package Exercise;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate today = LocalDate.now();
        int currentYear = today.getYear();
        double distance;
        int year;
        int yearsBetween;
        int type;  // 1 or 2
        double amount=0;

        System.out.print("Lütfen doğum yılınızı giriniz ");
        year = scanner.nextInt();
        yearsBetween = currentYear - year;

        System.out.print("Lütfen gideceğiniz mesafeyi kilometre cinsinden giriniz ");
        distance = scanner.nextInt();

        System.out.print("Lütfen yolculuk tipini giriniz (1 : tek yön 2 : gidiş dönüş) ");
        type = scanner.nextInt();

        if ( (distance > 0 ) && (year>0) && (type == 1 || type==2)) {
            amount = distance * 0.1;
            System.out.println(amount);

            if (yearsBetween<12) {
                amount = amount - (amount*0.5);
            }
            if (yearsBetween>=12 && yearsBetween<=24) {
                amount = amount-(amount*0.1);
            }
            if (yearsBetween>65) {
                amount=amount-(amount*0.3);
            }

            if (type ==2) {
                amount = amount-(amount*0.2);
                amount = amount*2;
            }
            System.out.println("Ödenecek Tutar : " + amount);

        }
        else {
            System.out.println("Hatalı veri girdiniz");
        }


    }
}

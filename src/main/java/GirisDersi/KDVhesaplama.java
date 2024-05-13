package GirisDersi;
import java.util.Scanner;
public class KDVhesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money,kdvOrani = 0.10;
        System.out.print("KDV'nin ekleneceği tutarı giriniz : ");
        money= scanner.nextDouble();
        double newMoney = money + (money * (kdvOrani));
        System.out.println("Yeni tutar : " + newMoney);
    }
}

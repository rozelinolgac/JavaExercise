package GirisDersi;
import java.util.Scanner;
public class HipotenusHesabi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        double c;
        System.out.print("1. kenarı giriniz : ");
        a=scanner.nextInt();
        System.out.println("2. kenarı giriniz : ");
        b=scanner.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs : " +c);

    }
}

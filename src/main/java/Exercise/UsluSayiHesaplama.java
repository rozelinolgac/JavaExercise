package Exercise;
import java.util.Scanner;
public class UsluSayiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.print("Üssü alınacak olan sayıyı giriniz ");
        a=scanner.nextInt();
        System.out.print("Üs olacak olan sayıyı giriniz ");
        b=scanner.nextInt();
        int total=1;

        for (int i=1;i<=b;i++) {
            total=total*a;
        }
        System.out.println("Üs sonucu : " + total);
    }
}

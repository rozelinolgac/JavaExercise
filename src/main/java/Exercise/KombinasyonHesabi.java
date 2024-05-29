package Exercise;
import java.util.Scanner;

/*
kombinasyon hesabı yapan program :

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)

 */
public class KombinasyonHesabi {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int a,b;
        System.out.println("Kombinasyon formülü : C(n,r) = n! / (r! * (n-r)!)");
        System.out.print("Formülün n değerini giriniz ");
        a=scanner.nextInt();
        System.out.print("Formülün r değerini giriniz ");
        b=scanner.nextInt();
        int aFaktoriyel = 1;
        int bFaktoriyel = 1;
        int aEksibFaktoriyel = 1;
        int kombinasyonSonucu;

        for (int i=a ; i>=1; i--) {
            aFaktoriyel = i*aFaktoriyel;
        }
        for (int i=b ; i>=1; i--) {
            bFaktoriyel = i*bFaktoriyel;
        }
        for (int i=(a-b) ; i>=1; i--) {
            aEksibFaktoriyel = i*aEksibFaktoriyel;
        }
        kombinasyonSonucu = aFaktoriyel / (bFaktoriyel*(aEksibFaktoriyel));
        System.out.println("Kombinasyon sonucu : " + kombinasyonSonucu);


    }
}

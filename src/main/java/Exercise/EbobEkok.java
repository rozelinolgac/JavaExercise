package Exercise;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int a,b,ebob=0,ekok=0;
        int kucukSayi,buyukSayi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz : ");
        a=scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        b=scanner.nextInt();

        if (a<b) {
            kucukSayi=a;
            buyukSayi=b;
        }
        else {
            kucukSayi=b;
            buyukSayi=a;
        }

        /*
        System.out.println("Küçük sayı : " +kucukSayi);
        System.out.println("Büyük sayı : "+buyukSayi);
        */


        // Ebob :
        for (int i=kucukSayi;i>=1;i--) {
            if(kucukSayi%i==0 && buyukSayi%i==0) {
                ebob=i;
                break;
            }
        }
        System.out.println("İki sayının EBOB'u : " +ebob);

        // Ekok :

        for (int i=1;i<=(kucukSayi*buyukSayi);i++) {
            if (i%kucukSayi==0 && i%buyukSayi==0) {
                ekok=i;
                break;
            }

        }

        System.out.println("İki sayının EKOK'u : " +ekok);


    }
}

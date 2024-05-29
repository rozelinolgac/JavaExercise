package Exercise;
import java.util.Scanner;

/*
Harmonik seri :
(1) + (1/2) + (1/3) + .... + (1/n)

 */
public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Harmonik seri formülü : (1) + (1/2) + (1/3) + .... + (1/n). N sayısını giriniz. ");
        n = scanner.nextInt();
        double total = 0.0;

        for (double i = 1;i<=n;i++) {
            total = (total) + (1/i);

        }
        System.out.println("Harmonik seri sonucu : " + total);

    }
}

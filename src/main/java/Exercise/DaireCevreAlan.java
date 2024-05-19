package Exercise;
import java.util.Scanner;

public class DaireCevreAlan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r;
        double pi = 3.14;
        System.out.println("Yarıçapı giriniz : ");
        r = scanner.nextInt();

        double cevre = 2*pi*r;
        double alan = pi*r*r;
        System.out.println("Cevre : " + cevre);
        System.out.println("Alan : " + alan);


    }
}

package Exercise;
import java.util.Scanner;
public class OrtancaSayiyiBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one,two;

        System.out.print("Küçük sayıyı giriniz : ");
        one = scanner.nextInt();

        System.out.print("Büyük sayıyı giriniz : ");
        two = scanner.nextInt();

        while (++one < --two) {}
        System.out.println("İki sayinin orta değeri : " + one);

    }
}

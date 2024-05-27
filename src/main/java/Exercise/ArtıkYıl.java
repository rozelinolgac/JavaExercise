package Exercise;
import java.util.Scanner;
public class ArtıkYıl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.print("Yıl giriniz ");
        year = scanner.nextInt();

        if (year % 4 == 0) {
            System.out.println(year + " Artık bir yıldır");
        }
        else {
            System.out.println(year + " Artık bir yıl değildir");
        }
    }
}

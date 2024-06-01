package Exercise;
import java.util.Scanner;

public class TersUcgenYıldızBasma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row;
        System.out.print("Lütfen istediğiniz satır sayısını giriniz : ");
        row = scanner.nextInt();


        for (int i=row;i>=1;i--) {
            for (int j=1;j<=(2*i)-1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

package Exercise;
import java.util.Scanner;

/*
döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini
ekrana yazdıran programı yazıyoruz.
 */
public class KuvvetBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp;
        System.out.print("Sınır sayısını giriniz. ");
        inp = scanner.nextInt();
        System.out.println("4 ün kuvvetleri : ");

        for (int i=1;i<=inp;i*=4) {
            System.out.print(i+" - ");
        }
        System.out.println("\n 5 in kuvvetleri : ");

        for (int i=1;i<=inp;i*=5) {
            System.out.print(i+" - ");
        }


    }
}

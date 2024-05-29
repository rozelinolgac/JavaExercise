package Exercise;
import java.util.Scanner;

/*
     *
    ***
   *****
  *******

 Burada döngüyü satırı baz alarak giriyoruz.

 */
public class YildizBasma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz ");
        int n;
        n = scanner.nextInt();

        for (int i=1;i<=n;i++) {  // satır sayısına karşılık geliyor
            for (int j=1;j<=(n-i);j++) {
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i)-1;k++) {
                System.out.print("*");
            }

            System.out.println();


        }


    }
}

package MethodsExercise;
import java.util.Scanner;

/*

Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive"
metot kullanarak yapan programı yazınız.
 */
public class UsAlmaRecursive {

    static double usAl(int base,int exponent) {
       if(exponent==0) {
           return 1;
       }
       else if(exponent>0) {
           return base * (usAl(base,exponent-1));
       }

       else {
           return (1/ usAl(base,-exponent));
       }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base,exponent;
        System.out.print("Taban sayıyı gir : ");
        base=scanner.nextInt();
        System.out.print("Üs sayıyı gir : ");
        exponent = scanner.nextInt();

        System.out.println("Us sonucu : "+usAl(base,exponent));

    }
}

package MethodsExercise;
import java.util.Scanner;
/*
Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal"
sayı olup olmadığını bulan programı yazın.
 */
public class AsalSayiRecursive {
    static boolean isPrime(int number, int divisor) {
        if (number <= 1) {
            return false; // 1 veya daha küçük sayılar asal değildir
        }
        if (divisor * divisor > number) {
            return true; // Divisor'in karesi number'dan büyükse, daha fazla kontrol gerekmez
        }
        if (number % divisor == 0) {
            return false; // Sayı divisor'e tam bölünüyorsa asal değildir
        }
        return isPrime(number, divisor + 1); // Bir sonraki divisor ile devam et
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.print("Kontrol edilecek olan sayıyı gir ");
        a=scanner.nextInt();


        System.out.println(isPrime(a, 2));

    }
}
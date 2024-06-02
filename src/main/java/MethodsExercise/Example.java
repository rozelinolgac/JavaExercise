package MethodsExercise;
import java.util.Scanner;

/*
Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
 */
public class Example {
    // Recursive method to decrease the number until it is 0 or negative
    public static void manipulateNumber(int number) {
        // Print the current number
        System.out.print(number +" ");

        // Base case: If number is 0 or negative, start the increase process
        if (number <= 0) {
            return; // fonksiyonu sonlandırır
        }

        // Recursive call to decrease the number by 5
        manipulateNumber(number - 5);

        // Print the number after increasing back by 5 during the unwinding of the recursion stack
        System.out.print(number+" ");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        // Perform the recursive decrease and increase
        manipulateNumber(number);

        // Close the scanner
        scanner.close();

    }
}

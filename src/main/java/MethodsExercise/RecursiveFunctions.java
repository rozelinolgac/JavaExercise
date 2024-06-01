package MethodsExercise;
import java.util.Scanner;

/*
1'den n'e kadar olan sayıların toplamını recursive method ile bulma:
f(1) : 1
f(2) : f(1) + 2
f(3) : f(2) + 3
 */

public class RecursiveFunctions {
    static int f(int n) {
        if(n==1) {   // Programın başlangıç noktası
            return 1;
        }
        int result = f(n-1) +n;

        return result;
    }
    public static void main(String[] args) {
        System.out.println(f(4));
    }
}

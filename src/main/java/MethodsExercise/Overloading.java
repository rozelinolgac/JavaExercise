package MethodsExercise;

/*
Java'da, iki veya daha fazla metot, parametreler açısından farklılık gösteriyorsa
(farklı sayıda parametre, farklı türde parametre veya her ikisi
Bu duruma metotlarda "Overloading" yani aşırı yüklenme işlemi denir.
 */
public class Overloading {

    static int Print (int a) {
        return a;
    }
    static String Print (String a) {
        return a;
    }
    static int Print(int a,int b) {
        return a+b;
    }
    static void Print() {
        System.out.println("Parametresiz metot");
    }
    public static void main(String[] args) {
        Print();
        System.out.println(Print(8));
        System.out.println(Print("Rozelin"));
        System.out.println(Print(1,2));

    }
}

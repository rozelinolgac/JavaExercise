package Exercise;

import java.util.Scanner;

/*
  int a = 12, b = 12;
  boolean compare = a == b;
  if (compare) {  // Burada compare'in true olduğu duruma göre kontrol sağlıyor
  System.out.println("Sayılar eşit");
  } else {
  System.out.println("Sayılar eşit değil");
}


ÜÇ sayıdan küçük olanın bulunması :
int a = 10;
int b = 2;
int c = 8;
if (a < b && a < c) {
System.out.println("Küçük olan sayı : a");
} else if (b < a && b < c) {
System.out.println("Küçük olan sayı : b");
} else if (c < a && c < b) {
System.out.println("Küçük olan sayı : c");
}

*/

// Üç sayının sıralanması :
public class IfElseSayiSiralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        int first,second,third;
        System.out.print("1. sayıyı giriniz : ");
        a = scanner.nextInt();
        System.out.print("2. sayıyı giriniz : ");
        b = scanner.nextInt();
        System.out.print("3. sayıyı giriniz : ");
        c = scanner.nextInt();

        if (a<b && a<c) {
            third = a;
            if (b<c) {
                second = b;
                first = c;
            }
            else {
                second = c;
                first = b;
            }
        }

        else if (b<a && b<c) {
            third = b;
            if (a<c) {
                second = a;
                first = c;
            }
            else {
                second = c;
                first = a;
            }
        }
        else {
            third = c;
            if (a<b) {
                second = a;
                first = b;
            }
            else {
                second = b;
                first = a;
            }
        }

        System.out.println("En büyük sayı : " + first);
        System.out.println("Ortanca sayı : " + second);
        System.out.println("En küçük sayı : " + third);



    }
}

package GirisDersi;
import  java.util.Scanner;
public class Giris {
  public static void main (String[] args) {

     /*

     TEMEL OPERATÖRLER :

     int a = 7;
     int b = 1;
     int topla = a+=b;
     System.out.println("yeni a değeri " + a);  // output : 8 . çünkü a değerini a+b'ye eşitledi
     a=7;
     int fark = a-=b;
     a=7;
     int carp = a*=b;
     a=7;
     int bol = a/=b;
     a=7;
     int mod = a%=b;
     */

     /*

     MANTIK OPERATÖRLERİ

     int a = 5, b = 9, c = 5;
     // a nın c'ye eşit ve b'den büyük olduğu durumun kontrolü :
     boolean kosul1 = a == c;
     boolean kosul2 = a > b;
     boolean sonuc = kosul1 && kosul2;
     System.out.println(sonuc);
     // a nın c'ye eşit veya b'den büyük olduğu durumun kontrolü :
     boolean kosul3 = a == c;
     boolean kosul4 = a > b;
     boolean sonuc2 = kosul3 || kosul4;
     System.out.println(sonuc2);
     // sonuc2'nin tersini almak :
     System.out.println(!sonuc2);
     // sonuc2'yi tek satır halinde yazmak :
     boolean sonuc3 = (a == c) || (a > b);
     System.out.println(sonuc3);
     // Sonuc3 doğru ise ekrana : 'doğru', doğru değilse 'doğru değil' yazdırmak :
     String str = sonuc3 ? "Doğru" : "Doğru değil";  // Burada str true ise ilk metin false ise ikinci metin
     System.out.println(str);
     int str2 = sonuc3 ? 1 : 2;
     System.out.println(str2);

     int d = 4;
     int e = 5;
     System.out.println((d==e) ? "esit" : "esit degil");
     */

    /*

    Kullanıcıdan input alma */


    System.out.print("Integer bir sayi giriniz : ");
    int a;
    Scanner input = new Scanner(System.in);
    a = input.nextInt();
    System.out.println("Girilen Integer Sayi : " + a);

    System.out.print("Double bir sayi giriniz : ");
    double b;
    b = input.nextDouble();
    System.out.println("Girilen Double Sayi : " + b);

    System.out.print("String bir değer giriniz : ");

    String metin = input.next();
    System.out.println("Girilen String Değer : " + metin);



  }
}

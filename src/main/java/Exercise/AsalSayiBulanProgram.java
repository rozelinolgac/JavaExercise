package Exercise;
import java.util.Scanner;
/*
Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
 */
public class AsalSayiBulanProgram {
    public static void main(String[] args) {
        int count=0;
        int a,b;
        int kucukSayi,buyukSayi;
        Scanner scanner=new Scanner(System.in);



        System.out.print("İlk sayıyı giriniz. ");
        a=scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz. ");
        b=scanner.nextInt();

        if(a>1 && b>1 ) {
            if(a>b) {
                buyukSayi=a;
                kucukSayi=b;
            }
            else {
                buyukSayi=b;
                kucukSayi=a;
            }

            for (int i = kucukSayi; i <= buyukSayi; i++) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.print(i + " ");

                }
                count = 0; // Her sayıda sayaç sıfırlansın.
            }


        }
        else {
            System.out.println("Lütfen 1'den büyük sayı girişi yapınız. ");
        }






   /*
        // 1-100 arasındaki asal sayılar :
        for (int i=2;i<=100;i++) {
            for (int j=2;j<i;j++) {
                if(i%j==0) {
                    count++;
                }
            }
            if (count==0) {
                System.out.print(i+" ");

            }
            count=0; // Her sayıda sayaç sıfırlansın.
        }
        */



        /*

    Bir sayının asal olup olmadığı :

    int a=5;
    int count =0;
    for (int i=2;i<a;i++) {
        if (a%i==0) {
          count++;
        }
    }
    if (count==0) {
        System.out.println("Sayı asal");
    }
    else {
        System.out.println("Sayı asal değil");
    }

         */



    }
}

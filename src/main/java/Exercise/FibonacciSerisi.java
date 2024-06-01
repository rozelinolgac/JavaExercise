package Exercise;
import java.util.Scanner;

/*
Fibonacci Serisi Nedir ?
Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı
dizisidir. Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar,
yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.

Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır.
Elde edilen sonuç rakamın sağ tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:

9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
*/
public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = 0;
        int second = 1;
        int count;
        int newNumber;

        System.out.print("Eleman sayısını giriniz : ");
        count=scanner.nextInt();
        System.out.print(first +" ");
        System.out.print(second + " ");

        for (int i=3;i<=count;i++) {

            newNumber = first+second;
            System.out.print(newNumber+" ");
            first =second;
            second = newNumber;

        }


    }
}

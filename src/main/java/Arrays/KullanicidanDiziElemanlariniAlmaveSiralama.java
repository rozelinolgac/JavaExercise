package Arrays;
import java.util.Arrays;
import java.util.Scanner;
/*
Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
 */
public class KullanicidanDiziElemanlariniAlmaveSiralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength;
        System.out.print("Dizinin boyutunu giriniz : ");
        arrayLength = scanner.nextInt();
        int [] array = new int[arrayLength];

        for (int i = 0 ;i<arrayLength;i++){
            System.out.print("Dizinin eleman sayısını giriniz : ");
            array[i]=scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));



    }
}

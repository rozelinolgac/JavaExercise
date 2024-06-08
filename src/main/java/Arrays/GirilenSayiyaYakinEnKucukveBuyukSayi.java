package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class GirilenSayiyaYakinEnKucukveBuyukSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {345, 34, 26, 8, 2, 67, 246, 3};
        Arrays.sort(array);
        Integer closestSmaller = null;
        Integer closestLarger = null;
        int number;
        System.out.print("Sayı girişi yapın : ");
        number = scanner.nextInt();

        for (int i : array) {
            if (i < number) {
                closestSmaller = i;
            } else {
                if (i > number && closestLarger == null) {
                    closestLarger = i;
                }
            }
        }
        System.out.println("Girilen "+number+" sayısına en yakın, küçük sayı : " +closestSmaller);
        System.out.println("Girilen "+number+" sayısına en yakın, büyük sayı : " +closestLarger);


    }
}

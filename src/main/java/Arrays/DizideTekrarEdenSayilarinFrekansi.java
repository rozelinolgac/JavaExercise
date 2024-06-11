package Arrays;

import java.util.Arrays;

/*
Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani
frekanslarını bulan programı yazınız.
 */
public class DizideTekrarEdenSayilarinFrekansi {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};

        boolean[] checked = new boolean[array.length]; // kontrol edilen sayıları kontrol edildi olarak işaretliyoruz.

        for (int i = 0; i < array.length; i++) {
            int count = 1;
            if (!checked[i]) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        checked[j] = true;
                    }
                }
                System.out.println(array[i] + " sayısının tekrar sayısı : " + count);
            }
        }
}

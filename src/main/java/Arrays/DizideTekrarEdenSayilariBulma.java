package Arrays;

import java.util.Arrays;


public class DizideTekrarEdenSayilariBulma {

    static boolean isFind(int [] array,int number) {  // bulunan değer dizide var mı ?
       for(int i : array) {
           if(i==number) {
               return true;
           }
       }
       return false;
    }
    public static void main(String[] args) {
        int[] array = {1, 6, 6, 3, 2, 678, 34, 2, 1, 1, 865,865};
        int[] dublicateArray = new int[array.length];
        int startIndex = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i != j) && (array[i] == array[j])) {  // i!=j > kendi değeriyle kendi değerini karşılaştırmasın.
                    if(!isFind(dublicateArray,array[i])) {
                        dublicateArray[startIndex++] = array[i];
                        break; // tekrar eden sayıyı bir kere ekleyeceği için, bulduğu yerde döngüden çıkması gerekli,
                        //dizinin sonraki elemanlarına bakmasına gerek yok
                    }
                }

            }
        }

        System.out.println(Arrays.toString(dublicateArray));


    }
}

package Arrays;

import java.util.Arrays;

public class DizideTekrarEdenCiftSayilariBulma {
    static boolean isFind(int[] arr, int number) {
        for (int i : arr) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 6, 7, 35, 364, 112, 67, 4, 1, 2, 2, 2, 8765, 112};
        int[] dublicateArray = new int[array.length];
        int startIndex = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i != j) && (array[i] == array[j]) && (array[i] % 2 == 0)) {
                    if (!isFind(dublicateArray, array[i])) {
                        dublicateArray[startIndex++] = array[i];
                        break;
                    }

                }
            }
        }
        System.out.println(Arrays.toString(dublicateArray));
    }
}

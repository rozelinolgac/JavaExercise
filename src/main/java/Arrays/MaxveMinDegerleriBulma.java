package Arrays;

public class MaxveMinDegerleriBulma {
    public static void main(String[] args) {
        int [] array = {4,34,24,-87,653,678,31,2};
        int min = array[0];
        int max = array[0];

        for (int i : array) {  // foreach döngüde direkt dizinin elemanına erişir, bu nedenle array[i] belirtmeye gerek yok
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Min değer : " + min);
        System.out.println("Maks değer : "+ max);
    }
}

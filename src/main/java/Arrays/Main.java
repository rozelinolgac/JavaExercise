package Arrays;

public class Main {
    static void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + ". indeks : " + arr[i]);
        }

    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + ". indeks : " + arr[i]);
        }

    }

    static int[] reverse(int [] arr) {
        int [] newArray = new int [arr.length];
        for(int i=0,j=arr.length-1;i<arr.length;i++,j--) {
            newArray[i] = arr[j];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (i * 10) + 10;
            System.out.println((i + 1) + ". indeks : " + array[i]);
        }
        System.out.println("*************************************");
        // Arraylere varsayılan olarakta değerler atanabilir:
        int[] array1 = {10, 20, 30, 40, 50};
        System.out.println("Array1 uzunluğu : " + array1.length);
        for (int i = 0; i < array1.length; i++) {
            System.out.println((i + 1) + ".indeks : " + array1[i]);
        }
        System.out.println("*************************************");
        double[] array2 = {1.1, 2.2, 3.3};
        printArray(array2);
        System.out.println("*************************************");
        printArray(array1);

        System.out.println("*************************************");

        int [] array3 = {1,2,3,4,5};
        int [] newArray =reverse(array3);
        printArray(newArray);


    }


}

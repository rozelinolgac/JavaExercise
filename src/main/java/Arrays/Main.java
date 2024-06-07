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
        int[] array1 = {10, 20, 30, 40, 50};  // Varsayılan değerlerin atanmasında bu şekilde yapılır,
        // tanımlama yaptıktan sonra alta inip bu değerler verilemez

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

        String [] array4 = new String[] {"Pazartesi","Salı"};  // Burada dizi boyutunu belirtmemize gerek kalmadı
        System.out.println(array4[0]);


        System.out.println("*************************************");

        int [][] matris = new int[3][4];
        System.out.println(matris.length);    // length olarak row sayısını veriyor
        System.out.println(matris[0].length); // 0. satırın uzunluğu

        int [][] matris1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for (int i=0;i<matris1.length;i++){
            for (int j=0;j<matris1[0].length;j++) {
                System.out.print(matris1[i][j]+"  ");
            }
            System.out.println();
        }

        int [][] matris2 = new int[3][];
        matris2[0] = new int[1];
        matris2[1] = new int[2];
        matris2[2] = new int[1];

        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < matris2[i].length; j++) {
                matris2[i][j] = j + 1; }
        }

        for (int i = 0;i<3;i++) {
            for (int j=0;j<matris2[i].length;j++) {
                System.out.print(matris2[i][j]+" ");
            }
            System.out.println();
        }

        int [] array5 = {8,88};
        for (int i : array5) {
            System.out.println(i);
        }


        int [][] matris3 = {{1,2,3},{4,5,6},{7,8,9}};
        for (int [] row: matris3) {
            for (int col : row) {
                System.out.print(col +" ");
            }
            System.out.println();
            }

        }


    }




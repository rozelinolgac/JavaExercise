package Arrays;

public class YıldızlarlaHarfBasma {
    public static void main(String[] args) {
        String[][] array = new String[7][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0 || i == 3) {
                    array[i][j] = " * ";
                } else if (j == 0) {
                    array[i][j] = " * ";
                } else {
                    array[i][j] = "  ";
                }
            }
        }

       for(String [] row : array) {
           for(String col : row) {
               System.out.print(col);
           }
           System.out.println();
       }


    }
}

package Arrays;
import java.util.Arrays;
public class ArrayTranspose {
    public static void main(String[] args) {
        int [][] array = {{1,2,3},{4,5,6}};
        // matrisin boyutları :
        int rowCount = array.length;
        int colCount = array[0].length;
        int [][] transposeArray = new  int[colCount][rowCount];

        for (int i=0;i<rowCount;i++) {
            for (int j=0;j<colCount;j++) {
                transposeArray[j][i] = array[i][j];
            }
        }
        System.out.println("Orijinal Array : ");
        for (int [] row : array) {
            for (int col : row) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println("Transpoz'u : ");
        for (int [] row : transposeArray) {
            for (int col : row) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}

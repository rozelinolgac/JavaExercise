package Arrays;
import java.util.Arrays;

public class ArrayClassEx {
    public static void main(String[] args) {
        int [] array = {7,2,5,4};
        // array elemanlarını yazdırıyor :
        System.out.println(Arrays.toString(array));
        // array dizisindeki tüm değerleri 10 yap!
        Arrays.fill(array,10);
        System.out.println(Arrays.toString(array));
        // array dizisindeki, verilen aralıktaki değerleri değiştir :
        Arrays.fill(array,1,2,8); // 1. indeks dahil, 3. indekse kadar yap
        System.out.println(Arrays.toString(array));
        // array sıralama :
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        // elemanın index değerini bulma : Bu method için arrayin sıralı olması gerekiyor
        System.out.println(Arrays.binarySearch(array,8));
        // Arraylerin kopyalanması :



    }
}

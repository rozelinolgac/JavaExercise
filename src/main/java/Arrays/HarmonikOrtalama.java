package Arrays;

/*
Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
 */
public class HarmonikOrtalama {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10,11};
        double harmonikSeri =0;
        double harmonikOrtalama=0;
        for (int i=0; i<array.length;i++) {
            harmonikSeri= ((1.0)/array[i])+harmonikSeri;
        }
        harmonikOrtalama=(array.length) / harmonikSeri;
        System.out.println("Harmonik Ortalama : " + harmonikOrtalama);
    }
}

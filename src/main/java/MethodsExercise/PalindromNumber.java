package MethodsExercise;
/*
Palindrom Sayı Nedir ?
Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
 */
public class PalindromNumber {

    static boolean isPalindrom(int number) {
        int temp=number,reserveNumber=0,lastNumber;

        while (temp!=0) {
            // öncelikle sayının son basamağını alıyorum.
            lastNumber = temp%10;
            reserveNumber= (reserveNumber*10) + lastNumber;
            /* Yukarıda, sayının birler basamağını aldım, sonrasında yeni sayıyı oluşturdum.
            Birden fazla basamaklı bir sayıyı elde ederken, 10 ile çarparız böylece bir sonraki basamaklar oluşur.
            */
            temp/=10;
        }

        if(number==reserveNumber) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(isPalindrom(6789));

    }
}

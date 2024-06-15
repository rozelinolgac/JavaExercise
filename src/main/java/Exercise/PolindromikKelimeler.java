package Exercise;

public class PolindromikKelimeler {

    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;   // kelimeyi bir baştan bir sondan kontrol ediyorum.
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";   // sonran başlayarak yeni bir string oluşturuyorum
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("rozelin"));
        System.out.println(isPalindrome2("asa"));
    }
}

package Exercise;

import java.util.Scanner;

// kullanıcıdan, şifre doğru girilene kadar şifre girişi alan program :
public class KullaniciGirisiLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int password;
        int truePassword = 12345;
        boolean passwordSucces = false;
        boolean passSucces = true;

        // Alternatif 1 :
        while (true) {
            System.out.print("Şifrenizi giriniz : ");
            password = scanner.nextInt();
            if (password == truePassword) {
                System.out.println("Şifreniz doğru");
                break;
            } else {
                System.out.println("Şifreniz yanlış,tekrar giriniz");
            }
        }

        // Alternatif 2 :
        while (!passwordSucces) {
            System.out.print("Şifrenizi giriniz : ");
            password = scanner.nextInt();
            if (password == truePassword) {
                System.out.println("Şifreniz doğru");
                passwordSucces = true;
            } else {
                System.out.println("Şifreniz yanlış,tekrar giriniz");
            }
        }

        // Alternatif 3 :
        do {
            System.out.print("Şifrenizi giriniz : ");
            password = scanner.nextInt();
            if (password == truePassword) {
                System.out.println("Şifreniz doğru");
                passSucces = false;
            } else {
                System.out.println("Şifreniz yanlış,tekrar giriniz");
            }

        }
        while (passSucces);


    }
}

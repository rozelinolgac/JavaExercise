package GirisDersi;
import java.util.Scanner;

public class KullanıcıGirisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username,password,newPassword;
        int select;
        System.out.print("Kullanıcı adınızı giriniz : ");
        username = scanner.nextLine();
        System.out.print("Şifrenizi giriniz : ");
        password = scanner.nextLine();

        if (username.equals("patika") && password.equals("java")) {
            System.out.println("Kullanıcı girişi başarılı ! ");
        }
        else if (username!="patika" && password.equals("java")){
            System.out.println("Kullanıcı adınız yanlış,tekrar deneyiniz");
        }
        else if (username.equals("patika") && (!password.equals("java"))) {
            System.out.print("Şifreniz yanlış,tekrar denemek için > 1 şifre sıfırlamak için > 2 ");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Tekrar denemek için bekleyin...");
                    break;
                case 2:
                    System.out.print("Yeni şifreniz için giriş yapınız : ");
                    newPassword = scanner.next();
                    if (newPassword.equals("java")) {
                        System.out.println("Yeni şifre ile mevcut şifre aynı olamaz,tekrar deneyin");
                    }
                    else {
                        System.out.println("Şifreniz başarılı bir şekilde değiştirilmiştir");
                    }


            }

        }
    }
}

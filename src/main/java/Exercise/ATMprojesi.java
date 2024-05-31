package Exercise;
import java.util.Scanner;

/*
Loginde, 3 hatalı giriş sonrasında hesap bloke olmalı
Ana menüde :
1: Para yatırma
2: Para çekme
3: Bakiye sorgulama
4: Çıkış
*/
public class ATMprojesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username,password;
        double balance=1000;
        int right = 3;
        int select;
        int price;
        boolean slct=true;

        while (right>0) {
            System.out.print("Kullanıcı adınızı giriniz : ");
            username = scanner.next();
            System.out.print("Kullanıcı şifrenizi giriniz : ");
            password = scanner.next();
            if (username.equals("rozelin") && password.equals("1234")) {
                System.out.println("Başarılı giriş, ana menüye yönlendiriliyorsunuz...");
                System.out.println("Ana menüye hoşgeldiniz!");
                // Öncelikle input alacağız bu nedenle do while kullanıyorum :
                /*
                do {
                    System.out.println("1:Para Yatırma\n2:Para Çekme\n3:Bakiye Sorgulama\n4:Çıkış" );
                    System.out.print("Lütfen yapacağınız işlemi seçiniz ");
                    select=scanner.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Lütfen yatırılacak olan miktarı giriniz. ");
                            price=scanner.nextInt();
                            balance+=price;
                            System.out.println("Para yatırma işlemi başarılı.");
                            break;
                        case 2:
                            System.out.print("Lütfen çekilecek olan miktarı giriniz. ");
                            price=scanner.nextInt();
                            if (price>balance) {
                                System.out.println("Yetersiz bakiye");
                            }
                            else {
                                balance-=price;
                                System.out.println("Para çekme işlemi başarılı");
                            }
                            break;
                        case 3:
                            System.out.println("Güncel bakiyeniz : "+balance);
                            break;

                    }

                }
                while(select!=4);
                System.out.println("Tekrar görüşmek üzere!");
                break;  */

                while (slct==true) {
                    System.out.println("1:Para Yatırma\n2:Para Çekme\n3:Bakiye Sorgulama\n4:Çıkış" );
                    System.out.print("Lütfen yapacağınız işlemi seçiniz ");
                    select=scanner.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Lütfen yatırılacak olan miktarı giriniz. ");
                            price=scanner.nextInt();
                            balance+=price;
                            System.out.println("Para yatırma işlemi başarılı.");
                            break;
                        case 2:
                            System.out.print("Lütfen çekilecek olan miktarı giriniz. ");
                            price=scanner.nextInt();
                            if (price>balance) {
                                System.out.println("Yetersiz bakiye");
                            }
                            else {
                                balance-=price;
                                System.out.println("Para çekme işlemi başarılı");
                            }

                            break;
                        case 3:
                            System.out.println("Güncel bakiyeniz : "+balance);
                           break;
                        case 4:
                            slct=false;
                            System.out.println("Çıkış işlemi yapılıyor, tekrardan görüşmek üzere");
                            break;

                    }
                }
                break;






            }
            else {
                right--;
                if(right>0) {
                    System.out.println("Kullanıcı adı veya şifre yanlış, tekrar deneyiniz ");
                }

                if (right==0) {
                    System.out.println("Hesabınız başarısız 3 deneme sonucunda bloke olmuştur, lütfen banka ile iletişime geçiniz. ");
                }
                else {
                    System.out.println("Kalan hakkınız : " + right);
                }
            }



        }







    }
}

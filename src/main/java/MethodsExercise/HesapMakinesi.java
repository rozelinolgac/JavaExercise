package MethodsExercise;

import java.util.Scanner;

public class HesapMakinesi {



    static void plus(int a, int b) { // toplama
        System.out.println("Toplama sonucu : " + (a + b));
    }

    static void minus(int a, int b) {
        System.out.println("Çıkarma sonucu : " + (a - b));
    }

    static void timus(int a, int b) {
        System.out.println("Çarpma sonucu : " + (a * b));
    }

    static void divided(int a, int b) {
        if (b == 0) {
            System.out.println("Bölen sayı 0 olamaz");

        } else {
            System.out.println("Bölme sonucu : " + (a / b));
        }
    }
    static void power(int a,int b) {
        int result=1;
        for (int i=1;i<=b;i++) {
            result*=a;
        }
        System.out.println("Üs sonucu : " +result);
    }

    static void factorial (int a) {
        int result=1;
        for (int i=a;i>=1;i--) {
            result*=i;
        }
        System.out.println("Faktoriyel sonucu : "+result);

    }
    static void mod(int a,int b) {
        System.out.println("Mod sonucu : " + (a%b));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp1, inp2, select;

        String menu = "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" ;


        while (true) {
            System.out.print("İşlem seçiniz : ");
            select = scanner.nextInt();
            if (select == 8) {
                System.out.println("Hesap makinesi kapatılıyor..");
                break;
            }

            switch (select) {
                case 1:
                    System.out.print("Birinci sayıyı giriniz : ");
                    inp1 = scanner.nextInt();
                    System.out.print("İkinci sayıyı giriniz : ");
                    inp2 = scanner.nextInt();
                    plus(inp1, inp2);
                    break;
                case 2:
                    System.out.print("Birinci sayıyı giriniz : ");
                    inp1 = scanner.nextInt();
                    System.out.print("İkinci sayıyı giriniz : ");
                    inp2 = scanner.nextInt();
                    minus(inp1, inp2);
                    break;
                case 3:
                    System.out.print("Birinci sayıyı giriniz : ");
                    inp1 = scanner.nextInt();
                    System.out.print("İkinci sayıyı giriniz : ");
                    inp2 = scanner.nextInt();
                    timus(inp1, inp2);
                    break;
                case 4:
                    System.out.print("Birinci sayıyı giriniz : ");
                    inp1 = scanner.nextInt();
                    System.out.print("İkinci sayıyı giriniz : ");
                    inp2 = scanner.nextInt();
                    divided(inp1, inp2);
                    break;

                case 5:
                    System.out.print("Birinci sayıyı giriniz : ");
                    inp1 = scanner.nextInt();
                    System.out.print("İkinci sayıyı giriniz : ");
                    inp2 = scanner.nextInt();
                    power(inp1,inp2);
                    break;
                case 6:
                    System.out.print("Faktoriyel hesabı yapılacak sayıyı giriniz : ");
                    inp1=scanner.nextInt();
                    factorial(inp1);
                    break;

                case 7:
                    System.out.print("Birinci sayıyı giriniz : ");
                    inp1 = scanner.nextInt();
                    System.out.print("İkinci sayıyı giriniz : ");
                    inp2 = scanner.nextInt();
                    mod(inp1,inp2);
                    break;
                default:
                    System.out.println("Geçersiz bir değer girdiniz");

            }


        }
    }
}
package Exercise;

import java.util.Scanner;

/*
Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart
*/
public class BurcBulmaProgramı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month, day;
        boolean isError = false;
        String message, horoscope = null;

        System.out.print("Doğduğunuz ayı giriniz. ");
        month = scanner.nextInt();

        System.out.print("Doğduğunuz günü giriniz. ");
        day = scanner.nextInt();

        switch (month) {
            case 1:
                if (day > 0 && day <= 31) {
                    if (day <= 21) {
                        horoscope = "Oğlak";
                    } else {
                        horoscope = "Kova";
                    }
                } else {
                    isError = true;
                }
                break;
            case 2:
                if (day > 0 && day <= 28) {
                    if (day <= 19) {
                        horoscope = "Kova";
                    } else {
                        horoscope = "Balık";
                    }
                } else {
                    isError = true;
                }
                break;
            case 3:
                if (day > 0 && day <= 31) {
                    if (day <= 20) {
                        horoscope = "Balık";
                    } else {
                        horoscope = "Koç";
                    }
                } else {
                    isError = true;
                }
                break;
            case 4:
                if (day > 0 && day <= 30) {
                    if (day <= 20) {
                        horoscope = "Koç";
                    } else {
                        horoscope = "Boğa";
                    }
                } else {
                    isError = true;
                }
                break;

            case 5:
                if (day > 0 && day <= 31) {
                    if (day <= 21) {
                        horoscope = "Boğa";
                    } else {
                        horoscope = "İkizler";
                    }
                } else {
                    isError = true;
                }
                break;
            case 6:
                if (day > 0 && day <= 30) {
                    if (day <= 22) {
                        horoscope = "İkizler";
                    } else {
                        horoscope = "Yengeç";
                    }
                } else {
                    isError = true;
                }
                break;
            case 7:
                if (day > 0 && day <= 31) {
                    if (day <= 22) {
                        horoscope = "Yengeç";
                    } else {
                        horoscope = "Aslan";
                    }
                } else {
                    isError = true;
                }
                break;
            case 8:
                if (day > 0 && day <= 31) {
                    if (day <= 22) {
                        horoscope = "Aslan";
                    } else {
                        horoscope = "Başak";
                    }
                } else {
                    isError = true;
                }
                break;
            case 9:
                if (day > 0 && day <= 30) {
                    if (day <= 22) {
                        horoscope = "Başak";
                    } else {
                        horoscope = "Terazi";
                    }
                } else {
                    isError = true;
                }
                break;
            case 10:
                if (day > 0 && day <= 31) {
                    if (day <= 22) {
                        horoscope = "Terazi";
                    } else {
                        horoscope = "Akrep";
                    }
                } else {
                    isError = true;
                }
                break;

            case 11:
                if (day > 0 && day <= 30) {
                    if (day <= 21) {
                        horoscope = "Akrep";
                    } else {
                        horoscope = "Yay";
                    }
                } else {
                    isError = true;
                }
                break;
            case 12:
                if (day > 0 && day <= 31) {
                    if (day <= 21) {
                        horoscope = "Yay";
                    } else {
                        horoscope = "Oğlak";
                    }
                } else {
                    isError = true;
                }
                break;
        }

        if (isError) {
            System.out.println("Lütfen geçerli bir gün giriniz.");
        } else {
            System.out.println("Burcunuz : " + horoscope);
        }

    }
}

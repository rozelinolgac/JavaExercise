package MayinTarlasiOyunu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mayın tarlası oyununa hoş geldiniz, haydi başlayalım!");
        int row, col;

        while (true) {
            System.out.print("Lütfen satır sayısını giriniz : ");
            row = scanner.nextInt();
            System.out.print("Lütfen sütun sayısını giriniz : ");
            col = scanner.nextInt();

            if (row > 2 && col > 2) {
                MineSweeper mineSweeper = new MineSweeper(row,col);
                mineSweeper.run();
                break;
            }
            else {
                System.out.println("Lütfen 2'den büyük değerler giriniz");
            }

        }



    }
}

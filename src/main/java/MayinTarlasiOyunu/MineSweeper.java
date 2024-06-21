package MayinTarlasiOyunu;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    Scanner scanner = new Scanner(System.in);
    int row;
    int col;
    int[][] map;
    int[][] gameBoard;
    int size;
    boolean game = true;
    Random random = new Random();

    MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        // System.out.println("Nesne başarılı bir şekilde oluşturuldu");
        this.map = new int[row][col];
        this.gameBoard = new int[row][col];
        this.size = row * col;
    }

    public void run() {
        int row, col,success=0;
        prepareMap();
        System.out.println("Map : ");
        print(map);
        System.out.println("Oyun başladı!");
        // Kullanıcıdan hücre alma :
        while (game) {
            System.out.println("Oyun board'u : ");
            print(gameBoard); // Kullanıcının gördüğü board
            System.out.print("Satır numarası : ");
            row = scanner.nextInt();
            System.out.print("Sütun numarası : ");
            col = scanner.nextInt();

            if(row<0 || row>this.row) {
                System.out.println("Geçersiz kordinat girişi");
                continue;
            }
            if(col<0 || col>this.col) {
                System.out.println("Geçersiz kordinat girişi");
                continue;
            }

            if (map[row][col] != -1) {
                check(row, col);
                success++;
                if (success==(size-(size/4))) {
                    System.out.println("Tebrikler, kazandınız.");
                    break;
                }
            } else {
                System.out.println("Oyun bitti!");
                game = false;
            }

        }
    }

    public void prepareMap() {
        // Bu methodda mayınlı map'i hazırlıyorum
        int count = 0;
        int mayinRow, mayinCol;
        while (count < size / 4) { // map hücre sayının 1/4 ü kadar mayın yerleştirilecek
            mayinRow = random.nextInt(row);
            mayinCol = random.nextInt(col);
            if (map[mayinRow][mayinCol] != -1) { // mayin olan yerleri -1 olarak eşitliyoruz
                map[mayinRow][mayinCol] = -1;
                count++;
            }

        }

    }

    public void check(int r, int c) { // seçilen hücrenin çevresinde bulunan mayın sayısı

        if (map[r][c] == 0) { // map'te mayın olmayan yerler için kontrol edilecek :
            // seçilen noktanın sağı :
            if ((c < col - 1) && (map[r][c + 1] == -1)) {
                gameBoard[r][c]++;
            }
            // seçilen noktanın solu :
            if ((map[r][c - 1] == -1) && (c > 0)) {
                gameBoard[r][c]++;
            }
            // seçilen noktanın yukarısı :
            if ((map[r - 1][c] == -1) && (r > 0)) {
                gameBoard[r][c]++;
            }
            // seçilen noktanın aşağısı :
            if ((r < row - 1) && (map[r + 1][c] == -1)) {
                gameBoard[r][c]++;
            }

            if (gameBoard[r][c] == 0) {
                gameBoard[r][c] = -2;
            }
        }


    }

    public void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] >= 0) {
                    System.out.print(" " + arr[i][j]);
                } else {
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }


    }


}

package 색종이_실버;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] white = new int[100][100];
        int count = 0;

        int N = sc.nextInt();


        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int xLocation = x; xLocation < x + 10; xLocation++) {
                for (int yLocation = y; yLocation < y + 10; yLocation++) {
                    white[xLocation][yLocation] = 1;
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (white[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
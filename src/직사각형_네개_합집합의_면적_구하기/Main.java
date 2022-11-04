package 직사각형_네개_합집합의_면적_구하기;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean[][] arr = new boolean[101][101];
        int count = 0;
        for (int a = 0; a < 4; a++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            for (int i = x1; i < x2; i++) {
                for (int j = y1; j < y2; j++) {
                    arr[i][j] = true;
                }
            }
        }

        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                if (arr[i][j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

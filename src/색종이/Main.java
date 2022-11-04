package 색종이;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] paperN = new int[1001][1001];
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] count = new int[N+1];
//        int count = 0;
        for (int i = 1; i <= N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int l = sc.nextInt();
            int h = sc.nextInt();


//            INFO :: 첫장부터 색종이 넓이구하는 로직
            for (int xLocation = x; xLocation < x+l; xLocation++) {
                for (int yLocation = y; yLocation < y+h; yLocation++) {
                    paperN[xLocation][yLocation] = i;
                }
            }
        }
        
//        INFO :: 구한 넓이에서 겹치는 부분을 제외하고 세는 로직
        for (int i = 1; i <= N; i++) {
            for (int a = 0; a < 1001; a++) {
                for (int b = 0; b < 1001; b++) {
                    if (paperN[a][b] == i) {
                        count[i]++;
                    }

                }
            }
        }


        for (int i = 1; i <= N; i++) {
            System.out.println(count[i]);
        }

    }
}

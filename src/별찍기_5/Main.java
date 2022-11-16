package 별찍기_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 2n - 1 개
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //띄어쓰기를 따로 구현해주는게 핵심.
            for (int k = i; k<n; k++) {
                System.out.print(" ");
            }
            for (int j = 2 * i - 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

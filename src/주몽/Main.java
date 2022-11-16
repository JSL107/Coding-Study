package 주몽;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int count = 0;
        ArrayList<Integer> materials = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            materials.add(sc.nextInt());
        }

        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                if (materials.get(i) + materials.get(j) == M) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}


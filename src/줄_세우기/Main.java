package 줄_세우기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N+1];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(sc.nextInt(), i);
        }

        for(int i = list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }

    }
}

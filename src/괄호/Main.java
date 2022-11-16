package 괄호;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }
        int count;
        for (int i = 0; i < N; i++) {
            count = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                if (count < 0) {
                    break;
                }
                if (arr[i].split("")[j].equals("(")) {

                    count++;
                } else {
                    count--;
                }
            }
            if (count == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}

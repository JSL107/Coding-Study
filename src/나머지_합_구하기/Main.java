package 나머지_합_구하기;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] originArray = new int[N + 1];
        int[] sumArray = new int[N + 1];
        int[] indexArray = new int[N + 1];
        int result = 0;
        int count = 0;
        int answer = 0;

        for (int i = 1; i <= N; i++) {
            originArray[i] = sc.nextInt();
        }
//        누적합 구하는 로직
        for (int i = 1; i <= N; i++) {
            sumArray[i] = sumArray[i - 1] + originArray[i];
        }
//        Test Code
//        for (int i = 1; i <= N; i++) {
//            System.out.print(sumArray[i]+ " ");
//        }
        for (int i = 0; i < N; i++) {
            result = (sumArray[i] % M);
            if (result == 0) {
                count++;
            }
            indexArray[count]++;
        }
        for (int i = 0; i < M; i++) {
            if (indexArray[i] > 1) {
                answer = answer + (indexArray[i] * (indexArray[i] - 1) / 2);
            }
        }

        System.out.println(answer);

    }
}

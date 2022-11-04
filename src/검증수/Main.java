package 검증수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 컴퓨터 마다 6자리의 고유번호를 매긴다.
        // 처음5자리는 : 00000~99999

        // 검증수는 고유번호의 처음
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0; i<5; i++){
            arr[i] = sc.nextInt();
        }

        arr[5] = (int)(Math.pow(arr[0],2) + Math.pow(arr[1],2) + Math.pow(arr[2],2) + Math.pow(arr[3],2) + Math.pow(arr[4],2))%10;

        System.out.println(arr[5]);
    }
}

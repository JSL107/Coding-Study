package 알고리즘_수업_너비_우선_탐색1;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void bfs(int M,int R) {
        Deque<Integer> dq = new LinkedList<>();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // INFO :: 반복횟수
        int M = sc.nextInt(); // INFO :: 간선의 수
        int R = sc.nextInt(); // INFO :: 시작 정점

        for(int i = 0; i<N; i++) {
            bfs(M,R);
        }
    }
}

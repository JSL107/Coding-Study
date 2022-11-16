package 미로_탐색;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        Queue<Integer> q = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean [][]visit =new boolean[N][M];

        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            char[] ca = str.toCharArray();
            for (int j = 1; j <= M; j++) {
                q.offer(ca[j - 1] - '0');
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                System.out.print(q);
            }
            System.out.println();
        }
    }
}

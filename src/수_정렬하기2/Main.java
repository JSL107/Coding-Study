package 수_정렬하기2;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < N; i++) {
            arr.add(Integer.valueOf(br.readLine()));
        }

        Collections.sort(arr);

        for (int i = 0; i < N; i++) {
            bw.write(arr.get(i) + "\n");
        }

        bw.close();
    }
}

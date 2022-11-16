package K번째수;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int index = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();
        int number;

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            number = Integer.parseInt(st.nextToken());
            arr.add(number);
        }

        Collections.sort(arr);
        bw.write(String.valueOf(arr.get(index-1)));
        bw.flush();
        bw.close();
    }
}

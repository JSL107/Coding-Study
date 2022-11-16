import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static int[] solution(int[] array) {
        int[] answer = new int[2];
        answer[0] = Arrays.stream(array).max().getAsInt();
        for (int i = 0; i < array.length; i++) {
            if (answer[0] == array[i]) {
                answer[1] = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 8, 3};
        System.out.println(Arrays.toString(solution(array)));
    }
}
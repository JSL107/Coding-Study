package 스위치_켜고_끄기;


import java.util.Arrays;

class Solution {
    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2];
        int index = 0;
        for (int i = num1; i <= num2; i++) {
            answer[index] = numbers[i];
            index++;
        }
        return answer;
    }


    public static void main(String[] args) {
        int[] numbers = {1,3,5};
        int num1 = 1;
        int num2 = 2;
        System.out.println(Arrays.toString(solution(numbers, num1, num2)));
    }
}




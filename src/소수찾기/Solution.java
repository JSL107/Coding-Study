package 소수찾기;

import java.util.HashSet;

class Solution {
    public static int solution(String numbers) {
        int n = numbers.length();

        return n;

    }

    //1 . 모든 경우의 수 구하기(순열)
    public static HashSet<Integer> permutation(String numbers) {
        HashSet<Integer> set = new HashSet<>();
        for (String i : numbers.split("")) {
            set.add(Integer.parseInt(i));
        }

        return set;

    }

    //2 . 소수 찾기



    public static void main(String[] args) {
        String numbers = "011";
        System.out.println(solution(numbers));
        System.out.println(permutation(numbers));
    }
}
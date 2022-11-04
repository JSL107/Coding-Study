package 방배정;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        double[] manArray = new double[7];
        double[] womanArray = new double[7];
        double count1 = 0;
        double count2 = 0;

        for (int i = 0; i < N; i++) {
            int sex = sc.nextInt();
            int year = sc.nextInt();
            if (sex == 1) {
                manArray[year]++;
            } else {
                womanArray[year]++;
            }
        }
        for (int i = 1; i <= 6; i++) {
            count1 =  count1 + Math.ceil(manArray[i] / K);
            count2 = count2 + Math.ceil(womanArray[i] / K);

        }
        System.out.println((int)count1 + (int)count2);
    }
}

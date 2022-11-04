package 일곱_난쟁이;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int temp1 = 0;
        int temp2 = 0;

        int[] dwaf = new int[9];
        for (int i = 0; i < 9; i++) {
            dwaf[i] = sc.nextInt();
            result = result + dwaf[i];
        }
        Arrays.sort(dwaf);

//        for (int i = 0; i < 9; i++) {
//            System.out.print(dwaf[i] + " ");
//        }
//        System.out.println("result : " + result);

        for (int i = 0; i < dwaf.length - 1; i++) {
            for (int j = i + 1; j < dwaf.length; j++) {
                if (result - (dwaf[i] + dwaf[j]) == 100) {
                    temp1 = i;
                    temp2 = j;
                    break;
                }
            }

        }

        for (int i = 0; i < 9; i++) {
            if(dwaf[i] != dwaf[temp1] && dwaf[i] != dwaf[temp2]) {
                System.out.println(dwaf[i]);
            }
        }

    }
}

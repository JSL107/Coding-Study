package 괄호;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<String> stack = new Stack<>();
        String[] strArray = new String[N];
        System.out.println();
        for (int i = 0; i < N; i++) {
            strArray[i] = sc.next();
            stack.add(Arrays.toString(strArray[i].split("")));

            System.out.println(stack.elementAt(i));
            System.out.println();
        }
        for (int i = 0; i < stack.size(); i++) {
            String[] answerArray = new String[stack.size()];
//            answerArray[i] = Arrays.toString(stack.elementAt(i).split(""));
//            System.out.print(answerArray[i] + " ");
        }





    }
}

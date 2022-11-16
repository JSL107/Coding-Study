package 빙고;

import java.util.Scanner;

public class Main {
    static int[][] arr = new int[5][5];
    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();

            }
        }

// 0으로 바꿔주기
        for (int x = 1; x <= 25; x++) {
            num = sc.nextInt();
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (arr[i][j] == num) {
                        arr[i][j] = 0;
                    }
                }
            }
            rcount();
            lcount();
            dcount();
            d1count();

            if (count >= 3) {
                System.out.println(x);
                break;
            }
            count = 0;

        }

    }

    //    열
    public static void lcount() {
        for (int i = 0; i < 5; i++) {
            int number = 0;
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] == 0) {
                    number++;
                }
            }
            if (number == 5) {
                count++;
            }
        }

    }

    //    왼->오 대각선
    public static void dcount() {
        for (int i = 0; i < 5; i++) {
            int number = 0;
            if (arr[i][i] == 0) {
                number++;
            }
            if (number == 5) {
                count++;
            }
        }


    }

    //    오-> 왼 대각선
    public static void d1count() {
        int number = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i][4 - i] == 0) {
                number++;
            }
        }
        if (number == 5) {
            count++;
        }
    }

    //    행
    public static void rcount() {
        for (int i = 0; i < 5; i++) {
            int number = 0;
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] == 0) {
                    number++;
                }
            }
            if (number == 5) {
                count++;
            }
        }
    }


}




